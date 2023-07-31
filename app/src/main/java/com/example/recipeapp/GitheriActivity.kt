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

class GitheriActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val detailslistView = findViewById<ListView>(R.id.detailslistview)
        detailslistView.adapter=GCustomAdapter(this)


    }
}
private class GCustomAdapter(context: Context): BaseAdapter() {

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
        peopleserved.text = "5"
        val difficultylevel: TextView =
            detailsactivitylistview.findViewById(R.id.difficultylevel)
        difficultylevel.text = "Intermediate"
        val ingredients: TextView = detailsactivitylistview.findViewById(R.id.ingredients)
        ingredients.text =
                            "1.  3 tablespoon cooking oil (use your favorite cooking oil).\n" +
                            "2.  2 cups boiled maize (corn kernels)\n" +
                            "3.  4 cups boiled beans (see the recipe notes below)\n" +
                            "4.  5 cloves crushed garlic\n" +
                            "5.  1 tablespoon crushed ginger\n" +
                            "6.  1 large chopped onion (use yellow or red onion).\n" +
                            "7.  3 tomatoes (diced )\n" +
                            "8.  1 tablespoon tomato paste\n" +
                            "9.  1 teaspoon curry powder (use more, or less, to taste)\n" +
                            "10. ½ teaspoon cumin powder (optional)\n" +
                            "11. ¾ teaspoon salt (or more to taste)\n" +
                            "12. ½ teaspoon turmeric powder (optional)\n" +
                            "13. 5 large potatoes (cubed)\n" +
                            "14. 1 chopped carrot\n" +
                            "15. 2 chopped paprika (bell pepper) (also known as pili pili hoho, in Swahili)\n" +
                            "16. 1 stock cube (such as Maggi or Knorr)\n" +
                            "17. ½ cup water\n" +
                            "18. 1 teaspoon garam masala\n" +
                            "19. 1 small bunch chopped fresh cilantro (coriander) to garnish"
        val preparationsteps: TextView =
            detailsactivitylistview.findViewById(R.id.preparationsteps)
        preparationsteps.text =
                            "1. Heat cooking oil in a medium-sized pot or pan. Add the garlic and fry until fragrant. Fry for about one minute, taking care not to burn then stir in the ginger.\n" +
                            "2. Add the chopped onion and cook until it is slightly browned and fragrant then add in the diced tomatoes, tomato paste, curry powder, cumin powder, salt, and turmeric. Stir to combine.\n" +
                            "3. Next, add the potatoes, paprika (bell pepper), stock cube, and water, then stir. Cover and allow it to cook for about 10 minutes, or until the potatoes are slightly tender, but not entirely cooked through. Make sure to stir from time to time.\n" +
                            "4. Finally, add the boiled corn kernels (or maize), boiled beans, and garam masala. Garnish with some chopped coriander (cilantro), serve and enjoy while still hot!"




        return detailsactivitylistview

    }
}

