fun main(args: Array<String>) {
    println("Введите название учебника по программированию")
    var name=readLine().toString()
    println("Введите количество страниц")
    var numberPages=readLine().toString().toInt()
    println("Введите цену")
    var price=readLine().toString().toInt()
    println("Введите год издания учебника по программированию")
    var yearOfPublication=readLine().toString().toInt()
    val programmingTutorialYearOfPublication = ProgrammingTutorialYearOfPublication(name, numberPages, price, yearOfPublication)
    programmingTutorialYearOfPublication.printDetails()
}