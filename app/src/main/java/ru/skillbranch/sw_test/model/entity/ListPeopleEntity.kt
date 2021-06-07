package ru.skillbranch.sw_test.model.entity

data class ListPeopleEntity(
    val count: Int,
    val next: String,
    val previous: String,
    val results: MutableList<PeopleEntity>
)