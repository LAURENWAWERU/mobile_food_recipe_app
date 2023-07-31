package com.example.recipeapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.recipeapp.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.listview)
        listView.adapter=MyCustomAdapter(this)
        listView.onItemClickListener=
            AdapterView.OnItemClickListener { parent, view, position, id -> // value of item that is clicked
                if(position==0){
                val intent = Intent(this, PilauActivity::class.java)
                startActivity(intent)
            }else if(position==1){
                    val intent = Intent(this, MukimoActivity::class.java)
                    startActivity(intent)
            }else if(position==2){
                    val intent = Intent(this, BeefStewActivity::class.java)
                    startActivity(intent)
            }else if(position==3){
                    val intent = Intent(this, MatokeActivity::class.java)
                    startActivity(intent)
            }else if(position==4){
                    val intent = Intent(this, GitheriActivity::class.java)
                    startActivity(intent)
                }
            }









        }
    private class MyCustomAdapter(context: Context):BaseAdapter(){
        private val recipenames= arrayListOf<String>(
            "Pilau","Mukimo","Beefstew","Matoke","Githeri")
        private var recipeimages= arrayListOf<Int>(
            R.drawable.pilau,
            R.drawable.mukimo,
            R.drawable.beefstew,
            R.drawable.matoke,
            R.drawable.githeri
        )
        private val ncontext : Context
        init{
            ncontext = context
        }

        //how many rows I want in my list aka 5
        override fun getCount(): Int {
            return recipenames.size


        }

        override fun getItem(position: Int): Any {


            return "TestString"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }
        //responsible for rendering row
        @SuppressLint("SetTextI18n", "SuspiciousIndentation")
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val layoutInflater=LayoutInflater.from(ncontext)
            val activitylistview=layoutInflater.inflate(R.layout.activity_listview,viewGroup,false)
            val textview=activitylistview.findViewById<TextView>(R.id.textview)
            textview.text=recipenames.get(position)
            var imageview=activitylistview.findViewById<ImageView>(R.id.imageview)
            imageview.setImageResource(recipeimages.get(position))


            return activitylistview

        }



    }

}