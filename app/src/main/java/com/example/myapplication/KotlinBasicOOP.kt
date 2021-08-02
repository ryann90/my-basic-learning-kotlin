package com.example.myapplication

fun main (){
    MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
//    MobilePhone("IOS", "Apple", "Iphone 12 Max")
//    MobilePhone("Android", "Google", "Google Pixel 5")

    var ryann = Person("Ryann", "Casanova", 31)
    ryann.hobby = "Play Video Games"
    ryann.stateHobby()
    println("${ryann.firstName} is ${ryann.age} years old")

    var john = Person()
    john.hobby = "Play Yugioh Cards"
    john.stateHobby()
}

class MobilePhone(osName: String, brand: String, model: String){

    init {
        println("OS = $osName Brand = $brand Model = $model")
    }

}

// this is a Person class and its constructor are firstName and lastName
class Person (firstName: String = "John", lastName: String = "Doe"){
    // Member Variables - Properties
    var firstName: String? = null
    var age: Int? = null
    var hobby: String = "watch netflix"

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new person object with " +
        "first name = $firstName and last name = $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
        println("Initialized a new person object with " +
                "first name = $firstName and last name = $lastName and age $age")
    }


    // Member function - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}

