package com.example.flipcardactivity

class Card(public var state:State, public var item:Item) {

     fun compare(other: Card): Boolean {
        return (other.item == this.item)
     }


}