package com.li.activitylifecycle;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String inforContent=getIntent().getStringExtra(MainActivity.BOOK_NAME_OF_CATEGORY_PHYSICAL);
        Toast.makeText( ActivitySecond.this,inforContent,Toast.LENGTH_SHORT ).show();
    }
}
