fun main(args: Array<String>) {
    println("Введите фамилию")
    var surname=readLine().toString()
    println("Введите число программ, написанных программистом")
    var numberProgram=readLine().toString().toInt()
    println("Введите число языков программирования, которыми он пишет программы")
    var numberOfProgrammingLanguages= readLine().toString().toInt()
    println("Введите число программ, которые работают правильно")
    var numberProgramCorrect=readLine().toString().toInt()
    val programmerNumberProgramCorrect = ProgrammerNumberProgramCorrect(surname, numberProgram, numberOfProgrammingLanguages, numberProgramCorrect)
    programmerNumberProgramCorrect.printDetails()
}