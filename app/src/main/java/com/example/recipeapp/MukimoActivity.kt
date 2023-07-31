package com.example.recipeapp

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MukimoActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val detailslistView = findViewById<ListView>(R.id.detailslistview)
        detailslistView.adapter=MCustomAdapter(this)


    }
}
private class MCustomAdapter(context: Context): BaseAdapter() {

    private val ncontext: Context

    init {
        ncontext = context
    }

    override fun getCount(): Int {

        return 1

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
        val layoutInflater = LayoutInflater.from(ncontext)
        val detailsactivitylistview = layoutInflater.inflate(
            R.layout.activity_detailslistview, viewGroup,
            false
        )
        val mealtype: TextView = detailsactivitylistview.findViewById(R.id.mealtype)
        mealtype.text = "Lunch/Supper"
        val peopleserved: TextView = detailsactivitylistview.findViewById(R.id.peopleserved)
        peopleserved.text = "4"
        val difficultylevel: TextView =
            detailsactivitylistview.findViewById(R.id.difficultylevel)
        difficultylevel.text = "Intermediate"
        val ingredients: TextView = detailsactivitylistview.findViewById(R.id.ingredients)
        ingredients.text =
                    "1.   1 kg Irish potatoes(select fresh for better taste)\n" +
                    "2.   2 handfuls of pumpkin leaves/spinach(soft and fresh)\n" +
                    "3.   3 cups of soft maize off the cob\n" +
                    "4.   A bunch of spring onions(finely chopped)\n" +
                    "5.   A spoonful of cooking oil\n" +
                    "6.   Salt to taste"
        val preparationsteps: TextView =
            detailsactivitylistview.findViewById(R.id.preparationsteps)
        preparationsteps.text =
                    "1. Carefully peel the potatoes and slice them into halves, wash them clean and set aside.\n" +
                    "2. Prepare the pumpkin leaves by removing the stalk and shred them into sizeable pieces. You can also blend them for richer colour. lf you are using spinach you just need to shred a little bit as well.\n" +
                    "3. Mix the pumpkin leaves, maize and potatoes in a Sufuria and add some water. Just enough for everything to cook well.\n" +
                    "4. Place the Sufuria or cooking pot on fire and let the mixture boil for 30 minutes under medium heat. Open and add a pinch of salt and let it cook for 10 more minutes.\n" +
                    "5. Reduce the heat and mash everything together using a wooden spoon until all blends in well. Remove from. Heat and set aside.\n" +
                    "6. In another larger pot/Sufuria, pour in the spring onions and cooking oil and place on fire. Mix until the onions turn golden brown then adjust the heat to minimal and add the Mashed mixture. Mix well.\n" +
                    "7. You can now remove from the heat and serve while hot."




        return detailsactivitylistview

    }
}

