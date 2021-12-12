
fun main(){
    var heart = 5
    var randomNumber= (1..100).random()
    println("The game is easy, ı chose a number between 1 and 100 for you to guess. You have 5 hearts. \nIf you guess right before your hearts are gone, you win. If you don't I win.\n")


    while(heart != 0){

        print("Enter your guess:")
        var yourNumber = readLine()!!.toInt()

        if(randomNumber== yourNumber) {
            print("Congrats")
            break
        }
        else if (randomNumber>=yourNumber){
            println("Not right, guess a HIGHER number")
            heart-=1
            println("Your remaining heart = $heart \n")
            continue
        }
        else if (randomNumber<=yourNumber){
            println("Not right, guess a LOWER number")
            heart-=1
            println("Your remaining heart = $heart \n")
            continue
        }
    }
    println("Your hearts are gone :( \nif you're wondering, the number I chose $randomNumber \nGame Over!")

}


