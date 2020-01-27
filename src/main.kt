/*
Pseudocode
Variables:
myByte, myShort, myInt, myLong, myFloat, myDouble, myBoolean, myChar

Process:
Initialize every variable as its respective type
Set every variable to a value
Print every variable
*/


fun main(args: Array<String>){
    var myByte: Byte = 2
    var myShort: Short = 4
    var myInt: Int = 25
    var myLong: Long = 500000L
    var myFloat: Float = 40.1F
    var myDouble: Double = 11.23
    var myBoolean: Boolean = true
    var myChar: Char = 'a'

    println("The Byte Value is " + myByte);
    println("The Short Value is " + myShort);
    println("The Int Value is " + myInt);
    println("The Long Value is " + myLong);
    println("The Float Value is " + myFloat);
    println("The Double Value is " + myDouble);
    println("The Boolean Value is " + myBoolean);
    println("The Char Value is " + myChar)
}