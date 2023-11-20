package com.example.flipcardactivity

class Category (public var name:String, public var imageID:Int){
    private var element=ArrayList<Item>()

    fun addItem(item:Item){
        this.element.add(item)
    }

    fun getAllItems():ArrayList<Item>{
        return this.element
    }
}