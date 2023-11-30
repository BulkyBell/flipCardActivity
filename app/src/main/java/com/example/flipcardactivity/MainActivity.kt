package com.example.flipcardactivity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var animalCategory: Category
    private lateinit var kebabCategory: Category
    private lateinit var pokemonCategory: Category
    private lateinit var selectedCategory: Category

    private fun shuffleAllCategories() {
        animalCategory.shuffleItems()
        kebabCategory.shuffleItems()
        pokemonCategory.shuffleItems()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        animalCategory = Category("Animals", R.drawable.crocodile_svgrepo_com)
        kebabCategory = Category("Kebabs", R.drawable.kebab3)
        pokemonCategory = Category("Pokemon", R.drawable.pokeball)


        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.bear_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.bear_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.bird_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.bird_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.camel_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.camel_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.cat_with_wry_smile_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.cat_with_wry_smile_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.dog_face_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.dog_face_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.dolphin_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.dolphin_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.lion_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.lion_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.mouse_svgrepo_com)))
        animalCategory.addItem(Card(State.CLEARED, Item(R.drawable.mouse_svgrepo_com)))

        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab1)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab1)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab2)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab2)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab3)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab3)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab4)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab4)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab5)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab5)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab6)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab6)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab7)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab7)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab8)))
        kebabCategory.addItem(Card(State.CLEARED, Item(R.drawable.kebab8)))

        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon1)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon1)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon2)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon2)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon3)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon3)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon4)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon4)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon5)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon5)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon6)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon6)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon7)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon7)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon8)))
        pokemonCategory.addItem(Card(State.CLEARED, Item(R.drawable.pokemon8)))


        shuffleAllCategories()

        selectedCategory = animalCategory


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager


        val adapter = AdaptadorReciclerView(selectedCategory.getAllItems())
        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.abrirMenu -> {
                findViewById<DrawerLayout>(R.id.drawer).openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
