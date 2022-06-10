fun primes() = sequence {
    val primeList = mutableListOf<Int>()
    for (i in 2..Int.MAX_VALUE) {
        var isPrime = true
        for (j in primeList) {
            if (j > kotlin.math.sqrt(i.toDouble())) break
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primeList.add(i)
            yield(i)
        }
    }
}

fun main() {
    println(primes().take(100).toList())
}