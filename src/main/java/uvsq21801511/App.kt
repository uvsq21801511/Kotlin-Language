package uvsq21801511

import java.util.Scanner





object App {


    @JvmStatic fun  main(args: Array<String>) {

        val ci = CommandInvoker()
        val i = Interpreter()
        val ent = Entrance()
        val sc = Scanner(System.`in`)
        println("Enter your command: ")

        //var command:String=sc.nextLine()
        ent.command = sc.nextLine()

        while (true) {

            if (ent.command.equals("exit")) return
            when (ent.command) {
                "e", "edit" -> {

                    println("Enter your file name: ")
                    run {
                        ent.fileName = sc.nextLine()
                        while (true) {
                            if (ent.validateFileName(ent.fileName)) break

                            println("Your file Name is not correct! try again: ")
                            ent.fileName = sc.nextLine()
                        }
                    }
                    if (!ent.fileName.equals("index")) {
                        run {
                            println("please enter your name: ")
                            ent.name = sc.nextLine()
                        }
                        println("please enter your E-mail: ")
                        run {
                            ent.mail = sc.nextLine()
                            while (true) {
                                if (ent.validateMail(ent.mail)) break

                                println("Your mail is not correct! try again: ")
                                ent.mail = sc.nextLine()
                            }
                        }
                        run {
                            println("please enter your project: ")
                            ent.project = sc.nextLine()
                        }
                        run {
                            println("please enter your context: ")
                            ent.context = sc.nextLine()
                        }

                        run {
                            val iEdit = InterpreterEdit(i, ent)
                            ci.placeOrder(iEdit)
                        }

                    } else
                        println("File index is exist!")
                }
                "ls" -> {
                    val ils = InterpreterLs(i)
                    ci.placeOrder(ils)
                }
                "d", "delete" -> {
                    ent.fileName = ""
                    println("Enter your file name: ")
                    ent.fileName = sc.nextLine()
                    val iDelete = InterpreterDelete(i, ent)
                    ci.placeOrder(iDelete)
                }
                "v", "view" -> {
                    ent.fileName = ""
                    println("Enter your file name: ")
                    ent.fileName = sc.nextLine()
                    val iView = InterpreterView(i, ent)
                    ci.placeOrder(iView)
                }
                "s", "search" -> {
                    ent.fileName = ""
                    println("Enter your file name: ")
                    ent.fileName = sc.nextLine()
                    val iSearch = InterpreterSearch(i, ent)
                    ci.placeOrder(iSearch)
                }
                "sa", "searchAtr" -> {
                    println("Enter your file name: ")
                    ent.fileName = sc.nextLine()
                    println("Enter your project or your context: ")
                    ent.searchStr = sc.nextLine()
                    val iSearchAt = InterpreterSearchAttribute(i, ent)
                    ci.placeOrder(iSearchAt)
                }
                else -> {
                    println("This command is unknown! \nplease try again: ")
                    ent.command = ""
                }
            }

            println("Enter your next command: ")
            ent.command = sc.nextLine()


        }
    }

}


operator fun String.invoke(nextLine: String) {

    println(this)
}



