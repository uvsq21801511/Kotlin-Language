package uvsq21801511

import java.util.Scanner
import java.util.regex.Pattern

 class Entrance {

     var searchStr =""
     var context: String=""
     var name: String=""
     var mail: String=""
     var project: String=""
     var fileName:String=""
     var  command:String=""

/*
     var fileName: String=""
         set(value) {
             field = value
             //var fileName = fileName
             val sc = Scanner(System.`in`)
             while (!validate(field)) {
                 println("File Name is not valid!\nplease try again: ")
                 field = sc.nextLine()
             }
             this.fileName = field
         }
*/



     /*
    fun setName(name: String) {
        this.name = name
    }

    fun setMail(mail: String) {
        this.mail = mail
    }

    fun setProject(project: String) {
        this.project = project
    }

    fun setContext(context: String) {
        this.context = context
    }

    fun setCommand(command: String) {
        var command = command
        val sc = Scanner(System.`in`)
        while (command === "" || command.isBlank()) {
            println("Command is empty!\nplease try again: ")
            command = sc.nextLine()
        }
        this.command = command
    }

     fun setSearchStr(searchStr: String) {
         this.searchStr = searchStr
     }

    fun setFileName(fileName: String) {
        var fileName = fileName
        val sc = Scanner(System.`in`)
        while (!validate(fileName)) {
            println("File Name is not valid!\nplease try again: ")
            fileName = sc.nextLine()
        }
        this.fileName = fileName


    }

    */


    fun validateFileName(ffileName: String): Boolean {
        val matcher = FILENAME_PATTERN.matcher(ffileName)
        return matcher.find()
    }

    fun validateMail(emailStr: String): Boolean {
        val matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr)
        return matcher.find()
    }


     companion object {
        val VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE)
        private val FILENAME_PATTERN = Pattern.compile("^[a-z A-Z0-9   ]{1,50}$")
        private val COMMAND_PATTERN = Pattern.compile("^[e\\\\s\\\\d\\\\ls]$")
    }
}
