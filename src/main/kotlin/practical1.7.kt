fun main()
{
    val number = 4
    println("Factorial of $number = ${fact(number)}")
}
tailrec fun fact(n: Int, run: Int = 1): Long
{
    return if (n == 1) run.toLong() else fact(n-1, run*n)
}