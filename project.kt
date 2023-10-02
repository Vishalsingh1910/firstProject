fun main() {
    println("please enter your card")
    println()
    println("select your card type and please press \n 1:- saving \n 2:- current \n 3:- profile")
    val a = Integer.valueOf(readLine())
    println()
    when(a){
        1-> println("you have a saving account")
        2-> println("you have a current account")
        3-> println(" you want to see your profile")
    }

    val condition3 = a == 3
    if (condition3){
        println(" name:- vishal singh \n mobile no:- 325874691 \n address:- dadra")
        return
    }

    println()
    val password = "vishal"
    var chance = 3
    while (chance > 0){
        print("enter your password:- ")
        //Thread.sleep(20000)
        val userinput = readLine()

        if (userinput == password){
            println("proceed")
            break
        }else{
            chance--
            println("wrong password try again")
        }
    }
    if (chance == 0){
        println("you cant try more")
    }

    println()
    println("press \n 1:- view balance \n 2:- withdraw a money")
    val money = Integer.valueOf(readLine())
    println()
    when(money){
        1-> println("you want to view your balance")
        2-> println("you want to withdraw a money")
    }

    println()
    if (money == 1){
        println("you have rs:- 2500")

    }
    else{
        print("enter your money in rupees you want to withdraw:- ")
        val user = Integer.valueOf(readLine())
        if (user <= 2500) {
            println("proceed")
        }else{
            println("you dont have enough balance.")
        }
    }
}