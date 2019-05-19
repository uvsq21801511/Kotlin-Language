package uvsq21801511

import java.awt.Desktop
import java.io.*
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.Scanner
import org.asciidoctor.Asciidoctor.Factory.create
import org.asciidoctor.Asciidoctor

class Interpreter {

    private val fileVide = File("")
    private val chemin: String
    internal var asciidoctor: Asciidoctor

    init {
        chemin = fileVide.absolutePath + "/src/main/java/resources/"
        asciidoctor = create()
    }

    @Throws(IOException::class)
    fun edit(ent: InterpreterEdit): String {
        println(ent.fileName)
        val directory = File(chemin)
        if (Desktop.isDesktopSupported()) {
            val file = File(chemin + ent.fileName + ".adoc")
            val fw = FileWriter(file)
            try {
                val sdf = SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
                if (!directory.isDirectory) {
                    directory.mkdir()
                }
                if (!file.isFile) {
                    file.createNewFile()
                    writToFile(ent, file, fw, sdf)
                } else {
                    writToFile(ent, file, fw, sdf)

                }
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }

        return ent.fileName

    }

    @Throws(IOException::class)
    private fun index() {
        val directory = File(chemin)
        val listOfFiles = directory.listFiles()
        val idx = File(chemin + "index.adoc")
        val listPrg = ArrayList<String>()
        val listCon = ArrayList<String>()
        val listDate = ArrayList<String>()

        for (listOfFile in listOfFiles!!) {
            var chaine = ""

            val s = Scanner(listOfFile)
            while (s.hasNextLine()) {
                chaine = s.nextLine()
                if (chaine.contains(":project:")) {
                    val tab = chaine.split(":project:".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
                    listPrg.add(tab[1] + "   ====>   " + listOfFile.name)
                } else if (chaine.contains(":context:")) {
                    val tab = chaine.split(":context:".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
                    listCon.add(tab[1] + "   ====>   " + listOfFile.name)
                } else if (chaine.contains(":date:")) {
                    val tab = chaine.split(":date:".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
                    listDate.add(tab[1] + "   ====>   " + listOfFile.name)
                }
            }

        }
        val fw = FileWriter(idx)
        Collections.sort(listPrg)
        for (i in listPrg.indices) {
            val lp = listPrg[i]
            fw.write(lp)
            fw.write("\n")
        }
        fw.write("....................................." + "\n")
        for (lC in listCon) {
            fw.write(lC)
            fw.write("\n")
        }
        fw.write("......................................" + "\n")
        for (ld in listDate) {
            fw.write(ld)
            fw.write("\n")
        }
        fw.close()
    }

    @Throws(IOException::class)
    private fun writToFile(ent: InterpreterEdit, file: File, fw: FileWriter, sdf: SimpleDateFormat) {
        fw.write("= " + ent.fileName + "\n" + ent.name + " <" + ent.mail + ">" + "\n" +
                ":date:" + sdf.format(file.lastModified()) + "\n:context: " + ent.context + "\n:project: " + ent.project)
        fw.close()
        Desktop.getDesktop().open(file)
        index()
    }

    fun Ls() {
        val directory = File(chemin)
        val listOfFiles = directory.listFiles()
        if (listOfFiles == null)
            print("This directory dose not have a file")
        for (file in listOfFiles!!) {
            if (!file.isDirectory)
                println(
                        file.name)
        }
    }

    @Throws(IOException::class)
    fun View(ent: InterpreterView) {

        val file = File(chemin + ent.fileName + ".html")
        try {
            if (file.exists())
                file.delete()
            asciidoctor.convertFile(
                    File(chemin + ent.fileName + ".adoc"),
                    HashMap())
            Desktop.getDesktop().browse(file.toURI())
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

    fun DeleteFile(ent: InterpreterDelete) {
        val file = File(chemin + ent.fileName + ".adoc")
        if (ent.fileName == "index") {
            println("You can not delete this file")
            return
        }

        if (file.isFile) {
            file.delete()
            println("File " + ent.fileName + " is deleted !")
        } else {
            println("File  " + ent.fileName + " does not exist !")
            return
        }

    }

    fun SearchFile(ent: InterpreterSearch) {

       /* val dir = File(chemin)

        val filter = { dir1, name ->
            val b = name.startsWith(ent.fileName)
            b
        }

        val children = dir.list(filter)
        if (children!!.size > 0) {
            for (i in children.indices) {
                val filename = children[i]
                println(filename)
            }
        } else
            println("Search did not have any results")
            */
        File(chemin).walk().forEach { println(it) }
    }

    fun SearchAtr(ent: InterpreterSearchAttribute) {

        val file = File(chemin + ent.fileName + ".adoc")

        if (file.isFile) {
            var scan: Scanner? = null
            try {
                scan = Scanner(file)
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            }

            while (scan!!.hasNextLine()) {
                val line = scan.nextLine()
                if (line.contains(ent.setSearchStr)) {
                    println(line)
                }
            }
        } else
            println("This file is not exist")

    }

    fun SearchTitr(fileName: String) {}
}
