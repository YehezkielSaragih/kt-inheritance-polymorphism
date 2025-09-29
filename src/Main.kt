fun main() {
    // Polymorphism: variabel tipe Animal bisa menyimpan objek Dog atau Cat
    val animals: List<Animal> = listOf(
        Dog("Buddy"),
        Cat("Kitty"),
        Animal("Generic Animal")
    )

    // Polymorphism in action: method speak() dipanggil sesuai jenis object
    for (a in animals) {
        a.speak()
    }
}