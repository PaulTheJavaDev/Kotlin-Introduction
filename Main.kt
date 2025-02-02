import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`);
    
    println("What is your age?")
    
    val age = scanner.nextInt()

    /*
    if (age != 1) {
        println("You are $age years old!")
    } else {
        println("You are $age year old!")
    }
     */

    println(String.format("You are %d years old!", age)) //why would you ever use this :(
}
