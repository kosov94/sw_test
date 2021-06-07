package ru.skillbranch.sw_test.model.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import ru.skillbranch.sw_test.R
import ru.skillbranch.sw_test.model.entity.PeopleEntity
import kotlinx.android.synthetic.main.item_layout.view.*

class PeopleAdapter(private val context: Context) :
    RecyclerView.Adapter<PeopleAdapter.ViewHolder>() {
    private var peopleList: List<PeopleEntity> = ArrayList()
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.iv_card
        val txt_name = itemView.tv_cadr
        fun bind(listItem: PeopleEntity) {
            itemView.setOnClickListener {
                Toast.makeText(it.context, "Press on ${itemView.tv_cadr.text}", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = peopleList[position]
        holder.bind(listItem)

        holder.txt_name.text = peopleList[position].name
    }

    override fun getItemCount(): Int = peopleList.size

    fun refreshPeople(people: List<PeopleEntity>){
        this.peopleList = people
        notifyDataSetChanged()
    }

}