//Ashkan Ramjerdi
package comp2850.banking

class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft: Int = 0
        set(value) {
            require(value in 0..MAX_OVERDRAFT) {
                "Overdraft must be between 0 and $MAX_OVERDRAFT"
            }
            field = value
        }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(balance.toLong() - amount.toLong() >= -overdraft.toLong()) {
            "Insufficient funds for withdrawal"
        }
        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean = balance > -overdraft

    override fun toString(): String =
        "Account for $holder, balance = $balance (overdraft = $overdraft)"

    private companion object {
        const val MAX_OVERDRAFT = 100
    }
}
