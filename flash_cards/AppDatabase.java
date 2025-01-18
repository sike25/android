//@author codepath.org

package com.example.myapplication;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {com.example.myapplication.Flashcard.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.example.myapplication.FlashcardDao flashcardDao();
}
