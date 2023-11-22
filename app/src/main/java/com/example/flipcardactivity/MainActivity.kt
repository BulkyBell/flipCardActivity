package com.example.flipcardactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
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

    private fun generateGame():ArrayList<Card>{
        var item1=Item(R.drawable.bird_svgrepo_com)
        var item2=Item(R.drawable.camel_svgrepo_com)
        var array = arrayListOf<Card>()
        array.add(Card(State.CLEARED,item1))
        array.add(Card(State.CLEARED,item1))
        array.add(Card(State.CLEARED,item2))
        array.add(Card(State.CLEARED,item2))

        array.shuffle()
        return array
    }
}