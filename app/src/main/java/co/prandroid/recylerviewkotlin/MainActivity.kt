package co.prandroid.recylerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.*

import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager





var layout:String ="list"
val spanCount=2
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // use this setting to improve performance if you know that changes

        // use a linear layout manager
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        mRecyclerView.addItemDecoration(SimpleDividerItemDecoration(this))
        // specify an adapter (see also next example)
        mRecyclerView.adapter = MovieAdapter(applicationContext,Utils.getMovies())

    }

    // choose the layout between Linear and Grid
    fun typeLayout(view: View){
        when(layout){
            "list"-> {
                Utils.toast(applicationContext,"grid", Toast.LENGTH_SHORT)
                imageViewType.setImageResource(R.drawable.list)
                mRecyclerView.layoutManager= GridLayoutManager(this, spanCount)
                layout="grid"
            }
            "grid"->{
                Utils.toast(applicationContext,"list", Toast.LENGTH_SHORT)
                imageViewType.setImageResource(R.drawable.grid)
                mRecyclerView.layoutManager = LinearLayoutManager(this)
                layout="list"
            }

        }
    }

    // Only for Stagger
    fun clickStagger(view :View){
        imageViewType.setImageResource(R.drawable.abc_ic_clear_material)
        Utils.toast(applicationContext,"stagger", Toast.LENGTH_SHORT)
        mRecyclerView.layoutManager = StaggeredGridLayoutManager(spanCount, StaggeredGridLayoutManager.HORIZONTAL)
    }
}


