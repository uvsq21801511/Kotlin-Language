package uvsq21801511

import org.junit.Assert.*
import org.junit.Test

import java.io.IOException

/**
 * Unit test for simple App.
 */
class TestCase {
    @Test
    @Throws(IOException::class)
    fun testEdit() {
        val i = Interpreter()
        var chain = ""
        val ent = Entrance()
        ent.command="e"
        ent.fileName="Hello world!"
        ent.name="my name"
        ent.mail="me@gmail.com"
        ent.project="my project"
        ent.context="my context"
        val iEdit = InterpreterEdit(i, ent)
        chain = i.edit(iEdit)
        assertEquals("Hello world!", chain)
    }
}
