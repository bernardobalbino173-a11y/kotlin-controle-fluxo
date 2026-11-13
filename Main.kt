fun main() {
    println("=== Questão 1 ===")
    questao1()
    
    println("\n=== Questão 2 ===")
    questao2()
    
    println("\n=== Questão 3 ===")
    questao3()
    
    println("\n=== Questão 4 ===")
    questao4()
    
    println("\n=== Questão 5 ===")
    questao5()
    
    println("\n=== Questão 6 ===")
    questao6()
    
    println("\n=== Questão 7 ===")
    questao7()
    
    println("\n=== Questão 8 ===")
    questao8()
}

fun questao1() {
    val palavra = "Universidade"
    for (char in palavra) {
        val charLower = char.lowercaseChar()
        if (charLower == 'a' || charLower == 'e' || charLower == 'i' || charLower == 'o' || charLower == 'u') {
            continue
        }
        print("$char ")
    }
    println()
}

fun questao2() {
    var numero = 1
    while (true) {
        if (numero % 7 == 0 && numero % 13 == 0) {
            println(numero)
            break
        }
        numero++
    }
}

fun questao3() {
    var total = 0
    for (i in 1..100) {
        if (i % 10 == 0) {
            continue
        }
        total += i
        if (total > 500) {
            break
        }
    }
    println(total)
}

fun questao4() {
    var saldo = 1000.0
    val valorSaque = 150.0
    
    while (true) {
        if (saldo < valorSaque) {
            println("Saldo Insuficiente")
            break
        }
        saldo -= valorSaque
    }
}

fun questao5() {
    val alvo = 29
    var ehPrimo = true
    
    for (i in 2 until alvo) {
        if (alvo % i == 0) {
            ehPrimo = false
            break
        }
    }
    
    println(ehPrimo)
}

fun questao6() {
    val entradas = listOf(1, 3, 2, 0)
    var index = 0
    
    while (true) {
        val opcao = entradas[index++]
        if (opcao == 1 || opcao == 2) {
            println("Processando...")
        } else if (opcao == 3) {
            println("Módulo em manutenção")
            continue
        } else if (opcao == 0) {
            break
        }
    }
}

fun questao7() {
    for (numero in 1..50) {
        if (numero % 10 == 7) {
            continue
        }
        print("$numero ")
    }
    println()
}

fun questao8() {
    val tentativasSimuladas = listOf("1234", "0000", "1111", "2222", "9999")
    val senhaCorreta = "secret"
    
    for (i in 1..5) {
        val tentativa = tentativasSimuladas[i - 1]
        if (tentativa == senhaCorreta) {
            println("Acesso concedido")
            break
        } else {
            println("Senha incorreta")
            if (i == 3) {
                println("Cofre travado administrativamente")
                break
            }
        }
    }
}
