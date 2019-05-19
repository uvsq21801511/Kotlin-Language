
[Basics](index.md)

[Main standard libraries](mainlib.md)

[Major third-party libraries](major.md)

[Development tools](development.md)

[learning resources](resource.md)



# Kotlin "Hello, World!" Program
```markdown
// Hello World Program

fun main(args : Array<String>) {
    println("Hello, World!")
}
```
After run the program, the output will be:
```markdown
Hello, World!
```

# basic languages

## Types

### Numbers

The numbers in Kotlin are six types:
```markdown 
Double , Float , Long, Int , Short , Byte	

```
The integer types available in Kotlin are:
```markdown
Long—64 bit
Int—32 bit
Short—16 bit
Byte—8 bit
```
The floating-point types are: 
```markdown
Double—64 bit
Float—32 bit
```


### Characters

Characters are represented using the type Char
 
They are declared using single quotes like this
```markdown
val letterChar = 'A'
val letterChar = '/'
val digitChar = '$'
val digitChar = '9'
```


### Strings

Strings are represented by the type String

```markdown
val myString = "Hey there!"
```
```markdown
val myString: String
myString = "Howdy"
```
To create a string that spans multiple lines in the source file, we use triple quotes:
```markdown
val multipleStringLines = """
        This is first line
        This is second line
        This is third line """
```



### Booleans

The type Boolean represents booleans, and has two values: 
```markdown
true and false.
```
```markdown
val myTrueBoolean = true
val myFalseBoolean = false
```


### Arrays

Arrays in Kotlin are represented by the Array class:  
[See more about Arrays class](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)

```markdown
The example creates three arrays.
val nums = arrayOf(1, 2, 3, 4, 5)
```

### Comments

This is an easy one. In Kotlin, comments are just the same as in Java. We can use either block or line comments:
```markdown
/*
 hello, this is a block comment
 with multiple lines.
 This is another line.
 This is another one again
*/
 
// this is a single line comment
```


### Variables

### Defining variables

In Kotlin, use val to declare a constant or var keywords to declare a variable.

for example we declared  a variable with var keywords: 
```markdown
var car = "Toyota Matrix"
car = "Mercedes-Maybach" //can be changed

or

var age = 30
```

We declared a constant of type String with the val keyword. 
```markdown
val firstName: String = "Chike"
```



### Defining packages
The package declaration must go on the top of the file:

```markdown
package content.exercises
```

Package specification should be at the top of the source file:

[See more about of Packages](https://kotlinlang.org/docs/reference/packages.html)

## Control Flow: 

### if, when, for, while If Expression


### if

The syntax of if...else loop in Kotlin is:

```markdown
if (testExpression) {
   // codes to run if testExpression is true
}
else {
  // codes to run if testExpression is false
}
```
Example: Kotin if expression

```markdown
fun main(args: Array<String>) {

    val number = -5

    val result = if (number > 0) {
        "Positive number"
    } else {
        "Negative number"
    }

    println(result)
}
```
After run the program, the output will be:
```markdown
Negative number
```

[See more about of if](https://kotlinlang.org/docs/reference/control-flow.html)


###  When Expression

#### Kotlin when Construct
The when construct in Kotlin can be thought of as a replacement for Java switch Statement. 
#### Example: Simple when Expression

```markdown
fun main(args: Array<String>) {

    val a = 10
    val b = 7

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}
```

[See more about of when](https://kotlinlang.org/docs/reference/control-flow.html)


### For Loops

In Kotlin, for loop is used to iterate through ranges, arrays, maps and so on (anything that provides an iterator).

The syntax of for loop in Kotlin is:

```markdown
for (item in collection) {
    // body of loop
}
```

```markdown
for (item in collection) print(item)
```
The body can be a block.

Example: Kotlin for Loop 
```markdown
fun main(args: Array<String>) {

    for (i in 1..5) {
        println(i)
    }
}
```

[See more about of for](https://kotlinlang.org/docs/reference/control-flow.html)


### While Loops

The syntax of while loop in Kotlin is:
```markdown 
while (testExpression) {
    // codes inside body of while loop
}
```
Example: Kotlin while Loop
```markdown
fun main(args: Array<String>) {

    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }
}
```

[See more about of while](https://kotlinlang.org/docs/reference/control-flow.html)


### Kotlin do...while Loop

The syntax of do...while loop in Kotlin is:

```markdown
do {
   // codes inside body of do while loop
} while (testExpression);
```
Example: Kotlin do...while Loop
```markdown
fun main(args: Array<String>) {

    var sum: Int = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")
}
```
[See more about of do...while](https://kotlinlang.org/docs/reference/control-flow.html)


### Kotlin - Exception Handling

To catch an exception, use the try-expression:

```markdown
try {
    // some code
}
catch (e: SomeException) {
    // handler
}
finally {
    // optional finally block
}
```

The exceptions in Kotlin is pretty similar to the exceptions in Java. All the exceptions are descendants of the “Throwable” class. 

Following example shows how to use exception handling technique in Kotlin.
```markdown
fun main(args: Array<String>) {
   try {
      val myVar:Int = 12;
      val v:String = "Tutorialspoint.com";
      v.toInt();
   } catch(e:Exception) {
      e.printStackTrace();
   } finally {
      println("Exception Handeling in Kotlin");
   }
}
```
[See more about of Exceptions](https://kotlinlang.org/docs/reference/exceptions.html)    

## Functions

### How to call a function?
You have to call the function to run codes inside the body of the function. Here's how:
```markdoan
callme()
```
This statement calls the callMe() function declared earlier.
```markdow

fun callme(){
...
...
}

fun main(args: Array<String>) {
   .... 
    callMe()
   ....
}
```

### Defining and Calling Functions

You can declare a function in Kotlin using the (fun) keyword.

general syntax of declaring a function in Kotlin:
```markdown
fun functionName(param1: Type1, param2: Type2,..., paramN: TypeN): Type {
	// Method Body
}
```

Following is a simple function that calculates the average of two numbers 

```markdown
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}
```
Calling a function is simple. You just need to pass the required number of parameters in the function name like this
```markdown
avg(4.6, 9.0)  // 6.8
```

Function with an expression body and inferred return type:

```markdown
fun sum(a: Int, b: Int) = a + b
```

[See more about of Functions.](https://kotlinlang.org/docs/reference/functions.html)


## Classes

You can create a Class in Kotlin using the class keyword
```markdown
class Car{
}
```
For create an object/instance of the above the class using its default constructor like so 
```markdown
val car = Car()
```
### Notice that
unlike other object-oriented programming languages like Java, You don’t need to use the new keyword to instantiate a class in Kotlin. In fact, (new) is not a keyword in Kotlin.
[See more about of classes](https://kotlinlang.org/docs/reference/classes.html)

