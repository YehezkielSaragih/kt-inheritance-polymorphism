package model

// Child class lain (inheritance)
class Cat(name: String) : Animal(name) {

    override fun speak() {
        println("$name meows: Meow~")
    }
    override fun speak(loop: Int){
        speak()
        println("$loop x")
    }
}