
import kotlin.math.pow

//Exercício Final do módulo: Introdução ao Kotlin

//declaração de constantes visando evitar os "números mágicos"

const val SOMA = 1
const val SUB= 2
const val MULT = 3
const val DIV = 4
const val PERC = 5
const val EXPO = 6
const val FIN = 8

fun main() {

    var n1:Float?
    var n2:Float?

    fun sum(a1:Float,a2:Float) = a1.plus(a2)
    fun sub(a1:Float,a2:Float) = a1.minus(a2)
    fun mult(a1:Float,a2:Float) = a1.times(a2)
    fun div(a1:Float,a2:Float) = a1.div(a2)
    fun per(a1:Float,a2:Float) = (a2 * a1 )/ 100 //cálculo do percentual de um número
    fun expo(a1:Float,a2:Float) = a1.pow(a2) // cálculo de potenciação

    fun calculate(n1:Float,n2:Float, operation:(Float,Float)->Float):Float { //aplicação de conceitos de funções lambda
        var result = operation(n1,n2)
        return result
    }

    fun menu () {
        println("==========================================================================================================")
        println("Bem vinda(o) à Calculadora Kotlin 1.0! \n Insira o número da operação que você deseja realizar: ")
        println("==========================================================================================================")
        println("1: Soma | 2: Subtração | 3: Multiplicação | 4: Divisão  | 5: Porcentagem | 6: Potenciação | 8: Finalizar" )
    }

    do {
        menu()
        var choice = readLine()!!.toIntOrNull()

        when (choice) {
            SOMA -> {
                println ("Insira o primeiro valor a ser somado: ")
                n1 = readLine()!!.toFloatOrNull()

                println ("Insira o segundo valor a ser somado: ")
                n2 = readLine()!!.toFloatOrNull()


                if (n1 == null || n2 == null) break
                println ("Resultado: ${calculate(n1,n2,::sum)}")
            }
            SUB -> {
                println ("Insira o primeiro valor a ser subtraído: ")
                n1 = readLine()!!.toFloatOrNull()

                println ("Insira o segundo valor a ser subtraído: ")
                n2 = readLine()!!.toFloatOrNull()

                if (n1 == null || n2 == null) break
                println ("Resultado: ${calculate(n1,n2,::sub)}")
            }
            MULT -> {
                println ("Insira o primeiro valor a ser multiplicado: ")
                n1 = readLine()!!.toFloatOrNull()

                println ("Insira o segundo valor a ser multiplicado: ")
                n2 = readLine()!!.toFloatOrNull()

                if (n1 == null || n2 == null) break
                println ("Resultado: ${calculate(n1,n2,::mult)}")
            }
            DIV -> {
                println ("Insira o primeiro valor a ser dividido: ")
                n1 = readLine()!!.toFloatOrNull()

                println ("Insira o segundo valor a ser dividido: ")
                n2 = readLine()!!.toFloatOrNull()

                if (n1 == null || n2 == null) break
                println ("Resultado: ${calculate(n1,n2,::div)}")
            }
            PERC -> {
                println ("Insira a porcentagem(%) a ser calculada: ")
                n1 = readLine()!!.toFloatOrNull()

                println ("Insira o número a ser calculado : ")
                n2 = readLine()!!.toFloatOrNull()

                if (n1 == null || n2 == null) break
                println ("Resultado: ${calculate(n1,n2,::per)}")
            }

            EXPO -> {
                println ("Insira o número base para calcular a pontência: ")
                n1 = readLine()!!.toFloatOrNull()

                println ("Insira o expoente para o calculo da portência: ")
                n2 = readLine()!!.toFloatOrNull()

                if (n1 == null || n2 == null) break
                println ("Resultado: ${calculate(n1,n2,::expo)}")
            }

            FIN -> println ("Até mais!")
            else -> println("Opção inválida!")
        }

    } while ( choice != 8)// o bloco será repetido até que o dígito 8 seja inserido
}
