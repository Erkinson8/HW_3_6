package com.example.hw_3_6

import CitiesFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment = CitiesFragment()


        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }
}
/*f (savedInstanceState == null) {
            val fragment = MyFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment, "MY_FRAGMENT_TAG")
                .commit()*/