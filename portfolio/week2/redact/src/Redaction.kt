// COMP2850 Portfolio: Week 2
// Function to redact text from a string
fun redact(input: String, text: String, redactionChar: Char = 'X'): String {
    if (text.isEmpty()) {
        return input
    }

    return input.replace(text, redactionChar.toString().repeat(text.length))
}