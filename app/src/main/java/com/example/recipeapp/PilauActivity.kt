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

class PilauActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val detailslistView = findViewById<ListView>(R.id.detailslistview)
        detailslistView.adapter=MyCustomAdapter(this)


    }
}
    private class MyCustomAdapter(context: Context): BaseAdapter() {

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
            peopleserved.text = "6"
            val difficultylevel: TextView =
                detailsactivitylistview.findViewById(R.id.difficultylevel)
            difficultylevel.text = "Medium"
            val ingredients: TextView = detailsactivitylistview.findViewById(R.id.ingredients)
            ingredients.text =
                    "1. 2 cups basmati rice\n" +
                    "2. 5 potatoes medium size [peeled and cut into quarters]\n" +
                    "3. ¼ cup vegetable oil\n" +
                    "4. 2 Red onions medium size [thinly sliced]\n" +
                    "5. 4 cloves garlic minced\n" +
                    "6. 2 tablespoons ginger minced\n" +
                    "7. 1 serrano chile finely chopped\n" +
                    "8. 1 tablespoon pilau masala\n" +
                    "9. 2 beef stock cubes\n" +
                    "10. ¼ cup fresh cilantro roughly chopped\n" +
                    "11. 1 lb beef sirloin cubed\n" +
                    "12. 3 Roma tomatoes diced\n" +
                    "13. 4 cups water\n" +
                    "14. 2 Bay leaves\n" +
                    "15. Salt to taste"
            val preparationsteps: TextView =
                detailsactivitylistview.findViewById(R.id.preparationsteps)
            preparationsteps.text =
                   "1.Heat a stockpot on medium-high heat. Add oil and heat until hot but not smoking.\n" +
                    "2.Add the sliced onions and fry for 10-15 minutes or till the onions starts to turn golden brown (be careful not to burn it).\n" +
                    "3.Add the garlic, ginger, serrano pepper, Cook for 1-2 minutes, until fragrant.\n" +
                    "4. the cubed beef, pilau masala, beef stock cubes, bay leaves, cilantro, and salt to taste. Cook until the meat browns and caramelizes stirring occasionally about 8 to 10 minutes.\n" +
                    "5.Add the diced tomatoes and cook for 4-5 minutes, until the tomatoes have released their liquid.\n" +
                    "6.Stir in the potatoes and the water. Bring to a boil and cook for 10 minutes.\n" +
                    "7.Stir in the rice, and cover tightly with a foil paper (to keep the steam in) if necessary. Reduce the heat to low and cook for 20 minutes, until the rice is cooked and the liquid is absorbed.\n" +
                    "8.Once the rice is dry, remove the foil paper and fluff with a fork to ensure the seasonings are well distributed all around the rice."




            return detailsactivitylistview

        }
    }

