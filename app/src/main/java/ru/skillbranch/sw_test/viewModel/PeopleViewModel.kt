package ru.skillbranch.sw_test.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.skillbranch.sw_test.model.data.PeopleData
import ru.skillbranch.sw_test.model.entity.PeopleEntity

class PeopleViewModel: ViewModel() {
    var peopleList: MutableLiveData<List<PeopleEntity>> = MutableLiveData()

    init {
        peopleList.value = PeopleData.getPeoples()
    }

    fun getListPeople() = peopleList
}