package org.alkaaf.clevercoin

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        R.layout.activity_main
        var adapter = object : FirebaseRecyclerAdapter<String, RecyclerView.ViewHolder>(String::class.java, R.layout.activity_main , RecyclerView.ViewHolder::class.java ,FirebaseDatabase.getInstance().reference){
            override fun populateViewHolder(viewHolder: RecyclerView.ViewHolder?, model: String?, position: Int) {
            }
        }
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
