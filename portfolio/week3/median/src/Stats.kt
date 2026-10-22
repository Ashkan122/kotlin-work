fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) { "Cannot compute the median of an empty list" }

    val sortedValues = values.sorted()
    val middle = sortedValues.size / 2

    return if (sortedValues.size % 2 == 1) {
        sortedValues[middle]
    } else {
        (sortedValues[middle - 1] + sortedValues[middle]) / 2.0f
    }
}
