package org.kotlin.features

fun main(){
    var name: String
    name = "Neha"
//    name = null; null assignment is not possible with this type
    var nullName : String?
    nullName = null;
    println("name "+ name)
    println(" "+ nullName)
    // safe length check
    println(nullName?.length?:0);// safe call and won't throw any NPE
}