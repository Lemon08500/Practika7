open class Programmer(val surname: String, val numberProgram: Int, val numberOfProgrammingLanguages: Int){
    open fun quality(): Double {
        return numberProgram * numberOfProgrammingLanguages.toDouble()
    }
}
class ProgrammerNumberProgramCorrect(surname: String, numberProgram: Int, numberOfProgrammingLanguages: Int, val numberProgramCorrect: Int) : Programmer(surname, numberProgram, numberOfProgrammingLanguages) {
    fun Qp():Double {
        val P = numberProgramCorrect
        return super.quality() * P
    }
    fun printDetails() {
        println("Программист \"$surname\"")
        println("Число программ, написанных программистом: $numberProgram")
        println("Число языков программирования, которыми он пишет программы: $numberOfProgrammingLanguages")
        println("Число программ, которые работают правильно: $numberProgramCorrect")
        println("Качество: ${quality()}")
        println("Qp: ${Qp()}")
    }
}