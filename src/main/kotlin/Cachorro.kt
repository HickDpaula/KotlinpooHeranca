class Cachorro (nome: String, idade: String): Animal(nome,idade){

    override fun correr() {
        println("Correndo como um catchorro")
    }

    override fun emitirSom() {
        println("Auau")
    }

    fun abanarRabo(){
        println("Abanando o Rabo")
    }

    fun rosnar(){
        println("grrrrrr")
    }
}