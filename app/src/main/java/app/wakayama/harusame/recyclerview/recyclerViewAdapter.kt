package app.wakayama.harusame.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class recyclerViewAdapter(private val context: Context):RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val charaImage:ImageView = view.findViewById(R.id.characterImageView)
        val charaNameTextView:TextView = view.findViewById(R.id.listNameTextView)
        val charaDetailTextView:TextView = view.findViewById(R.id.descriptionTextView)

    }
    val items:MutableList<listData> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_list_data_cell,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.charaImage.setImageResource(item.imageResource)
        holder.charaNameTextView.text = item.listName
        holder.charaDetailTextView.text = item.description
    }

    fun addAll(items:List<listData>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}