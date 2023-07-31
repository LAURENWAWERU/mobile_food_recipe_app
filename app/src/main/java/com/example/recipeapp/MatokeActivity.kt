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

class MatokeActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val detailslistView = findViewById<ListView>(R.id.detailslistview)
        detailslistView.adapter=MaCustomAdapter(this)


    }
}
private class MaCustomAdapter(context: Context): BaseAdapter() {

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
        difficultylevel.text = "Difficult"
        val ingredients: TextView = detailsactivitylistview.findViewById(R.id.ingredients)
        ingredients.text =
                            "1. 10-12 matoke\n" +
                            "2.  2 tablespoons oil\n" +
                            "3.  1 medium onion diced\n" +
                            "4.  1 teaspoon minced garlic\n" +
                            "5.  ½ teaspoon grated ginger\n" +
                            "6.  1½ lb beef cut into small cubes\n" +
                            "7.  1 teaspoon curry powder\n" +
                            "8.  2 teaspoon chicken bouillon powder or 2 cubes\n" +
                            "9.  1 teaspoon paprika\n" +
                            "10. ½ teaspoon cayenne pepper or add to taste\n" +
                            "11. 4 medium tomatoes diced\n" +
                            "12. 2½ to 3 cups chicken stock or water\n" +
                            "13. salt and pepper to taste\n" +
                            "14. handful coriander leaves or cilantro [chopped]"
        val preparationsteps: TextView =
            detailsactivitylistview.findViewById(R.id.preparationsteps)
        preparationsteps.text =
                            "1. Peel and cut the matoke into 1.5 – 2 inch pieces. Put them in water till you are ready to use them so that they don’t become discolored.\n" +
                            "2. Heat the oil in a large skillet over medium-high heat, add onions, and cook until soft, about 2 minutes.\n" +
                            "3. Stir in the garlic and ginger and cook until fragrant—a few seconds.\n" +
                            "4. Stir in the beef and add the paprika, curry powder, bouillon powder, salt, and pepper. Mix well, cover, and leave to cook for 10 minutes, stirring halfway between.\n" +
                            "5. Add the matoke, diced tomatoes, and stock (or water), stir, cover, and leave to simmer for 25 to 30 minutes or till the matoke becomes tender.\n" +
                            "6. Stir in the coriander and serve."




        return detailsactivitylistview

    }
}

