package com.example.todolist;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {TodoModel.class}, version = 1, exportSchema = false)
public abstract class TodoDatabase extends RoomDatabase {
    public abstract TodoDAO TodoDao();
    public static TodoDatabase todoDatabase;

    public static TodoDatabase todoDatabaseInstance(Context context){
        if (todoDatabase == null){
            todoDatabase = Room.databaseBuilder(context,TodoDatabase.class, "Data").build();
        }
        return todoDatabase;
    }

}
