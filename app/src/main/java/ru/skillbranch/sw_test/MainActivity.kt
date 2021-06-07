package ru.skillbranch.sw_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import ru.skillbranch.sw_test.model.adapters.PeopleAdapter
import ru.skillbranch.sw_test.viewModel.PeopleViewModel

class MainActivity : AppCompatActivity() {

    private val peopleViewModel = PeopleViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PeopleAdapter(this)
        recyclerPeopleList.layoutManager = LinearLayoutManager(this)
        recyclerPeopleList.adapter = adapter

        peopleViewModel.getListPeople().observe(this, Observer {
            it?.let {
                adapter.refreshPeople(it)
            }
        })
    }
}