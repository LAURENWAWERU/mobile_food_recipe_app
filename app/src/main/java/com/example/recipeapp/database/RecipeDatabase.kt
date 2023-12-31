package com.example.recipeapp.database
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.recipeapp.Dao.RecipeDao
import com.example.recipeapp.entities.Recipes

@Database(entities = [Recipes::class], version = 1, exportSchema = false)
abstract class RecipeDatabase:RoomDatabase() {
    companion object{
        var recipeDatabase:RecipeDatabase?=null

        @Synchronized
        fun getDatabase(context: Context):RecipeDatabase{
            if (recipeDatabase!=null){
                recipeDatabase= Room.databaseBuilder(context,RecipeDatabase::class.java,"recipedb"
                ).build()
            }
            return recipeDatabase!!
        }
    }
    abstract fun recipeDao():RecipeDao
}