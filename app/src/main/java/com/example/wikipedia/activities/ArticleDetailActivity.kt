package com.example.wikipedia.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.wikipedia.R

class ArticleDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstantState: Bundle?) {
        super.onCreate(savedInstantState)
        setContentView(R.layout.activity_article_detail)

        setSupportActionBar(toolbar);
        supportActionBar!! setDisplayHomeAsUpEnabled (true);
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId == android.R.id.home){
            finish()
    }
        return true;
    }
}