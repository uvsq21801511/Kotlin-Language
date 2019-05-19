[Basics](index.md)

[Main standard libraries](mainlib.md)

[Major third-party libraries](major.md)

[Development tools](development.md)

[learning resources](resource.md)

## Kotlin Standard Library

The standard library functions are built-in functions in Kotlin that are readily available for use. 
There are a number of main libraries in Kotlin, such as:

### kotlin.io
 ```markdown
 import kotlin.io.*
 ```
This package is one of Kotlin's most important libraries
Io is for Reading and writing files and command line input/output.

This library is composed of a number of types, exceptions, extensions for external Classes, properties and functions :

```markdown
Types :
  - FileTreeWalk
  - FileWalkDirection
Exceptions :
  - AccessDeniedException
  - FileAlreadyExistsException
  - FileSystemException
  ...
Extensions for External Classes :
  - java.io.BufferedInputStream
  - java.io.File
  - java.io.BufferedReader
  - java.io.Reader
  ...
Properties : 
  - DEFAULT_BUFFER_SIZE
Functions :
  - byteInputStream
  - createTempFile
  - inputStream
  ...
  
```
### kotlin.math

The basic math functions in Kotlin are contained in the kotlin.math package.
To use the math functions we have to write this line at the top of our file:
```markdown
import kotlin.math.*
```
This library is composed of a number of functions for Math, such as:

```markdown
  - sqrt() 
  - PI
  - E
  - Sign
  - ulp
  - abs
  - acos
  - cosh
  ...
```

For exaple sqrt returns square root of a number (Double value)
```markdown
fun main(args: Array<String>) {
    var number = 5.5
    print("Result = ${Math.sqrt(number)}")
}
```

### kotlin.comparisons

Kotlin contains a very useful package to build a Comparator.
The library is composed of a number of  functions for comparison, sach as:

```markdown
  - compareBy
  - compareByDescending
  - compareValues
  - compareValuesBy
 
  ...
```
For example compareBy Creates a comparator using the sequence of functions to calculate a result of comparison.
```markdown
val list = listOf("aa", "b", "bb", "a")

val sorted = list.sortedWith(compareBy(
    { it.length },
    { it }
))

println(sorted) // [a, b, aa, bb]
```

###  kotlin.contracts
Kotlin Contracts are a new experimental feature introduced in Kotlin 1.3. The main purpose of contracts is to help the Kotlin compiler with complicated code analysis in cases where the developer knows more details about the code than the compiler can see.
[For more information](https://blog.kotlin-academy.com/understanding-kotlin-contracts-f255ded41ef2)

The library is composed of a number of type, functions and an notations such as:

```markdown
Type:
  - CallsInPlace
  - ConditionalEffect
  - ContractBuilder
  - Effect
  - SimpleEffect
  ...
Function: 
  - contract
    inline fun contract(builder: ContractBuilder.() -> Unit)
   ...
Annotations:
  - ExperimentalContracts
```

### kotlin.dom
This is utility functions for working with the browser DOM.
With kotlinx.html you can build DOM trees and append them to a document. This functionality is available for both Kotlin-JVM and Kotlin-JavaScript.
The library is composed of a number of properties And functions such as :
```markdown
Properties :
  - isElement
  - isText
Functions :
  - addClass
  - appendElement
  - appendText
  - clear
  - removeClass
  ...
  
```
### kotlin.js

The Kotlin support for JavaScript is geared both to the language and the modules.
Kotlin include libraries to support the manipulation of the DOM elements and also graphical elements using WebGL that is composed of a number of type, functions, properties and an notations such as:
```markdown
Type:
  - Console
  - Date
  - JsClass
  - Json
  - JSON
  - Math
 ... 
Notations:
  - JsModule
  - JsName
  - native
 ... 
Propertise:
  - console
  - definedExternally
  - Js
  - JsClass
 ...
Functions:
  - add
  - asArray
  - asDynamic
  - eval
  - get
 
...

```

### kotlin.native

Kotlin/Native is a technology for compiling Kotlin to native binaries that run without any VM. It comprises of a LLVM-based backend for the Kotlin compiler and a native implementation of the Kotlin runtime library

This library is composed of a number of type, functions and an notations such as:
```markdown
Types:
 - BitSet
 - ImmutableBlob
Annotations:
 - CName
 - SharedImmutable
 - Throws
Function:
 - asCPointer
 - getCharAt
 - getFloatAt
 - getUShortAt

...
```


Kotlin it has many library for using in web development and web service and desktop application 
for more details you can see: [Kotlin Standard Library](https://kotlinlang.org/api/latest/jvm/stdlib/index.html)And [Awesome Kotlin](https://kotlin.link)


