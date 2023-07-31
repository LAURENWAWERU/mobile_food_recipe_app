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

class BeefStewActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val detailslistView = findViewById<ListView>(R.id.detailslistview)
        detailslistView.adapter=BCustomAdapter(this)


    }
}
private class BCustomAdapter(context: Context): BaseAdapter() {

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
        peopleserved.text = "8"
        val difficultylevel: TextView =
            detailsactivitylistview.findViewById(R.id.difficultylevel)
        difficultylevel.text = "Intermediate"
        val ingredients: TextView = detailsactivitylistview.findViewById(R.id.ingredients)
        ingredients.text =
                                    "1.  1 tbsp. vegetable oil\n" +
                                    "2.  2 lb. beef chuck stew meat, cubed into 1\" pieces\n" +
                                    "3.  1 tbsp. extra-virgin olive oil\n" +
                                    "4.  1 medium yellow onion, chopped\n" +
                                    "5.  2 carrots, peeled and cut into rounds\n" +
                                    "6.  2 stalks celery, chopped\n" +
                                    "7.  Kosher salt\n" +
                                    "8.  Freshly ground black pepper\n" +
                                    "9.  3 cloves garlic, minced\n" +
                                    "10. 1/4 c. tomato paste\n" +
                                    "11. 6 c. low-sodium beef broth\n" +
                                    "12. 1 c. red wine\n" +
                                    "13. 1 tbsp. Worcestershire sauce\n" +
                                    "14. 1 tsp. dried or fresh thyme leaves\n" +
                                    "15. 2 bay leaves\n" +
                                    "16. 1 lb. baby potatoes, halved\n" +
                                    "17. 1 c. frozen peas\n" +
                                    "18. 1/4 c. freshly chopped parsley, for garnish"
        val preparationsteps: TextView =
            detailsactivitylistview.findViewById(R.id.preparationsteps)
        preparationsteps.text =
                    "1.  In a  heavy-bottomed pot over medium heat, heat oil.\n" +
                    "2.  Add beef and cook until seared on all sides, 10 minutes, working in batches if necessary.\n " +
                    "3.  Transfer beef to a plate. \n" +
                    "4.  In the same pot, cook onion, carrots, and celery until soft, 5 minutes.\n" +
                    "5.  Season with salt and pepper. \n" +
                    "6.  Add garlic and tomato paste and cook until garlic is fragrant and tomato paste has darkened, 2 minutes. \n" +
                    "7.  Add beef back to dutch oven then add broth, wine, Worcestershire sauce, thyme, and bay leaves. \n" +
                    "8.  Bring to a boil then reduce heat to a simmer. Season with salt and pepper.\n" +
                    "9.  Cover and let simmer until beef is tender, 30 to 45 minutes.\n" +
                    "10. Add potatoes and simmer, covered, until potatoes are tender, 15 minutes. \n" +
                    "11. Remove bay leaves. Stir in peas and cook until warmed through, 2 minutes.\n" +
                    "12. Season stew to taste with salt and pepper, then ladle into serving bowls and garish with parsley. "




        return detailsactivitylistview

    }
}

