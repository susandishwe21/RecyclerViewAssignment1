package com.example.recyclerviewhomework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewhomework1.adapter.ItemPersonAdapter
import com.example.recyclerviewhomework1.model.ItemPerson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_number.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personArray = ArrayList<ItemPerson>()

        personArray.add(ItemPerson("4K","5K","200"))
        personArray.add(ItemPerson("1K","10K","2K"))
        personArray.add(ItemPerson("8K","3K","20K"))

        var personAdapter = ItemPersonAdapter(personArray)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = personAdapter
    }
}
