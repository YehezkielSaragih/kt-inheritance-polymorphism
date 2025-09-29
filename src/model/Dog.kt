package model

// Child class (inheritance)
class Dog(name: String) : Animal(name) {

    override fun speak() {
        println("$name barks: Woof woof!")
    }
    override fun speak(loop: Int){
        speak()
        println("$loop x")
    }
}