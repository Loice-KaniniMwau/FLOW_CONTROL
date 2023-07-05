import org.w3c.dom.ranges.Range
import kotlin.reflect.typeOf

fun main() {
ageClassifier(16)
    Ages(3)
    identity(80)
    classifier2(2)
    haveYouBeen("kenyan")
    passengers(2)
    myNum(76,87,99,102)
    var x = (arrayOf("hobberlab", 20, 30.5, 32.4, "loice"))

    odd_numbers(1..100)
    party_drinks(23)



}
fun ageClassifier(age:Int) {
    if (age in 13 ..19) {
        println("you are a teenager")
    } else if (age in 20..35) {
        println("you are an adult")
    }
    else if (age in 36..50)
        println("menopause")
}
fun Ages(age: Int){
    if (age in 0..1 )
    {
        println("you are a baby")

    }
    else if (age in 2..3)
    {
        println("you are a toddler")
    }

    else if(age in 18..59){
        println("you are an adult")
    }
    else{
        println("you are a retiree")
    }

}
fun identity(years:Int){
    if (years<=35){
        println("approaching adulting")
    }
    else  if (years>=65){
        if (years<=65){
            println("approaching retirement")
        }
        else{
            println("should retire")
        }

    }
}
//when expression
fun classifier2(age:Int){
    when (age){
        0,1 -> println("you are a baby")
        2,3 -> println("you are a toddler")
      in  12..15 -> println("you are a teenager")


    }
}
fun haveYouBeen(nationality:String){
    when (nationality){
        "kenyan"-> println("have you been to Nairobi?")
        "Ugandan" -> println("have you been to kampala?")
        "Tanzanian" -> println("have you been to Dodoma?")
        "Rwandan" -> println("have you been to kigali?")
        "Sudan" -> println("have you been to khartoom")
       else -> println("have you been to East Africa")

    }
}
fun passengers(noOFPassengers:Int ){
    when (noOFPassengers){  // or use return when
        2 -> println("coupe2seater") // return coupe2seater
//        4,5 -> println("sedan") // return sedar
        6,7 -> println("wagon") //return wagon
        in 4..5 -> println("sedan")
        else -> println("other") //return other

    }

}
//for loops
fun myNum(num1:Int,num2:Int,num3:Int,num4:Int) {
    var myNumbers = arrayOf(num1, num2, num3, num4)
    for (num in myNumbers)
//        when (num % 2) {
//            0 -> println("even number")
//            1 -> println("odd-number")
//        }
        if (num %2==0){
            println("even number")
        }
    else if (num % 2 !=0){
        println("odd-number")
        }
}

////Write a program in Kotlin that asks the user to enter a password.
//// If the password is "password123", print "Access granted".
//// If the password is incorrect, print "Access denied".
//

//Create a function that prints out all the odd numbers between 1 and 100
fun odd_numbers(nums:IntRange){
    for (num in nums){
        if (num % 2 !=0){
            println(num)
        }

    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
//fun mynames(allnames:Array<String>):String{
//}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun party_drinks(ages: Int){
    when (ages){
      in 0..5 -> println("serve glass of milk")
        in 6..14 -> println("serve a bottle of fanta orange")
        else -> println("serve a bottle of cocacola")
    }
}

