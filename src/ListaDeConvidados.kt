fun main() {

    println("Favor informar o nome do convidado:")
    val nome = readLine()

    if (nome.isNullOrEmpty() || nome.isNullOrBlank()) {
        println("O nome informado não é válido!")
        return
    }

    println("Favor informar a idade do convidado: ")
    val idade = readLine()?.toIntOrNull()

    if (idade == null || idade <= 0){
        println("A idade informada não é valida!")
        return
    }

    var estaConvidado = false
    when(nome){
        "kaique" -> estaConvidado = true
        "Ale" -> estaConvidado = true
        "Ricardo" -> estaConvidado = true
        "Allan" -> estaConvidado = true
        "Aldo" -> estaConvidado = true
        else -> estaConvidado = false

    }

    if (estaConvidado && idade >= 18){
        println("Bem vindo a festa Kotlin Devaria 2021 ")
    }else if (!estaConvidado == false){
        println("Você não está na lista de convidados, por favor verifique com a pessoa que te convidou!")
    }else{
        println("Você não tem 18 anos para entrar na festa! ")
    }
}