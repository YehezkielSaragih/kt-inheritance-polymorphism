package model

// Parent class (Super class)
open class Animal(protected val name: String) {

    open fun speak() {
        println("$name makes a sound")
    }
    // Overloading
    open fun speak(loop: Int){
        for (i in 1 .. loop){
            speak()
        }
    }
    open fun greet(){
        println("My name is $name")
    }

}