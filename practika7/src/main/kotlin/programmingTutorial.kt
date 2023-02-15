 open class ProgrammingTutorial(val name: String, val numberPages: Int, val price: Int){
     open fun quality(): Double {
        return  price / numberPages.toDouble()
    }
}
 class ProgrammingTutorialYearOfPublication(name: String, numberPages: Int, price: Int, val yearOfPublication: Int) : ProgrammingTutorial(name, numberPages, price) {
     fun Q(): Double {
         val T = 2023
         val P = yearOfPublication
         return super.quality() - 0.2 * (T - P)
     }
     fun printDetails() {
         println("Учебник по программированию \"$name]\"")
         println("Количество страниц: $numberPages")
         println("Цена: $price")
         println("Год издания: $yearOfPublication")
         println("Качество учебника по программированию: ${quality()}")
         println("Q: ${Q()}")
     }
 }