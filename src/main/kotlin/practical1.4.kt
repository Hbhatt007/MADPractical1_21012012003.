import java.util.Scanner
//fun main(args : Array<String>)
fun main()
{
    var n:Int
    println("Enter any number: ")
    n = readLine()?.toInt()!!
    println("\n")
    if(n % 2 == 0)
        println("$n is Even Number")
    else
        println("$n is Odd Number")
}