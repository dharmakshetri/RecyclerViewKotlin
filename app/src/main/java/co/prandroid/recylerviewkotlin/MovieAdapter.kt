package co.prandroid.recylerviewkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.listitem.*
import kotlinx.android.synthetic.main.listitem.view.*


class MovieAdapter(context: Context, val items: List<Movie>): RecyclerView.Adapter<MovieAdapter.MyViewHolder>(){

    var c=context;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.listitem, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvName.text = items[position].name
        holder.tvYear.text= items[position].year.toString()
        Glide.with(c)
                .load(items[position].url.toString())
                .into(holder.imgMovie)
    }
    override fun getItemCount(): Int=items.size

    inner class MyViewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView
        var tvYear: TextView
        var imgMovie:ImageView
        var v= itemView
        init {
            tvName = itemView.tvName
            tvYear = itemView.tvYear
            imgMovie = itemView.imageViewMovie
            itemView.setOnClickListener(View.OnClickListener {
                Utils.toast(c, items[position].name,Toast.LENGTH_SHORT)
            })
        }
    }
}

