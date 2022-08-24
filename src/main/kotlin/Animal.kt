abstract class Animal (
    val nome: String,
    val idade: String,


){



    open fun correr() {}

    open fun emitirSom(){
        println("Emitindo som como um animal")
    }

}