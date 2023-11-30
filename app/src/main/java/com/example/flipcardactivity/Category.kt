package com.example.flipcardactivity

class Category(public var name: String, public var imageID: Int) {
    private var elements = ArrayList<Card>()

    fun addItem(card: Card) {
        this.elements.add(card)
    }

    fun getAllItems(): ArrayList<Card> {
        return this.elements
    }

    fun shuffleItems() {
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
        this.elements.shuffle()
    }
}
