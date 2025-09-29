import model.Animal
import model.Cat
import model.Dog

fun main() {

    // Polymorphism: variabel tipe model.Animal bisa menyimpan objek model.Dog atau model.Cat
    val animals: List<Animal> = listOf(
        Dog("Buddy"),
        Cat("Kitty"),
        Animal("Generic model.Animal")
    )

    // Polymorphism in action: method speak() dipanggil sesuai jenis object
    for (a in animals) {
        a.speak()
    }
}