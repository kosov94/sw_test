package ru.skillbranch.sw_test.model.data

import ru.skillbranch.sw_test.model.entity.PeopleEntity

object PeopleData {
    fun getPeoples() = listOf(
        PeopleEntity(
            "Lyke Skywoker",
            177,
            50,
            "brown",
            "white",
            "blue",
            "ertet",
            "rtetre",
            "gdfgdgd"
        ),
        PeopleEntity(
            "fsfs",
            13,
            23,
            "rwrw",
            "rwrw",
            "w234",
            "ssdff",
            "ertet",
            "rwts"
        )

    )
}