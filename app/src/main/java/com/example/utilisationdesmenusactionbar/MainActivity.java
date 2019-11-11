package com.example.utilisationdesmenusactionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView count=findViewById(R.id.text);
        switch(item.getItemId()) {
            case R.id.home:

                count.setText("Home");
                return(true);
        case R.id.add:

            count.setText("Add is clicked");
            return(true);
        case R.id.reset:

            count.setText("Nothing is selected");
            return(true);
        case R.id.about:
            count.setText("Nothing ");
            return(true);
            case R.id.app1:
                count.setText("app1 ");
                return(true);
            case R.id.app2:
                count.setText("app2 ");
                return(true);
        case R.id.exit:
            finish();
            return(true);

    }
        return(super.onOptionsItemSelected(item));
    }

}
