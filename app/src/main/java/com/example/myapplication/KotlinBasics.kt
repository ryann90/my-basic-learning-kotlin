package com.example.myapplication

fun main() {

    // TODO: this is an example of todo

    /*
    * This is
    * a multiline
    * comment
    * */

    // mutable variable can be change on run time
    var text = "Hey"
    // in the next line the variable text will be change
    text = "Heyyyah!!"

    // immutable variable
    val text2 = "Hmm"
    //

    var isRainy = false
    isRainy = true

//    println("Is weather today Rainy? $isRainy")
//    println("Hello " + text)
//    println("Hello this is an example of immutable variable" + text2)

    val isEqual = 5 == 3
//    println("isEqual is $isEqual")

    val num1 = 100
    val num2 = 200

//    when {
//        num1 > num2 -> {
//            println("num 1 is greater than num 2")
//        }
//        num1 == num2 -> {
//            println("num1 is equal to num2")
//        }
//        else -> {
//            println("none")
//        }
//    }

//    val month = 1
//
//    when(month){
//        in 3..5 -> println("Spring")
//        in 6..8 -> println("Summer")
//        in 9..11 -> println("Fall")
//        12, 1, 2 -> println("Winter")
//        else -> println("Invalid Season")
//    }

//    var x = 1
//    while(x <= 10){
//        print("$x")
//        x++
//    }
//    println("\nwhile loop is done")

//    var x = 100
//    while(x >= 0){
//        if(x < 2){
//            print("$x")
//        } else {
//            print("$x, ")
//        }
//        x -= 2
//    }
//    println("\nwhile loop is done")

//    for (i in 10 downTo 1 step 2){
//        if(i <= 2){
//            print("$i")
//        } else {
//            print("$i, ")
//        }
//    }

    //Exercise Loops

    // No 1
//    var powerLevel = 0
//    while(powerLevel <= 10000){
//        if(powerLevel == 9001){
//            println("IT'S OVER 9000!!!")
//        }
//        powerLevel++
//    }

    // No 2
//    var humidityLevel = 80
//    var humidity = "humid"
//
//    while(humidity == "humid") {
//        humidityLevel -= 5
//        println("humidity decreased")
//        if(humidityLevel == 60){
//            println("it's comfy now")
//            humidity = "comfy"
//        }
//    }


    var nullableName : String? = null
    println(nullableName)
}