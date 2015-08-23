package com.example.dell.buttonevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button= (Button) findViewById(R.id.button);
        button2= (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
//the button
    public void clickme(View v){

        if(v.getId()==R.id.button)
        {Log.d("ahm","1st button clicked"+v.getId());}
        else if(v.getId()==R.id.button2)
        {Log.d("ahm","2nd button is clicked"+v.getId());}
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    Log.d("ahm","button was clicked   "+ view.getId());
if(view.getId()==R.id.button){
    Log.d("ahm","button 1 was clicked");

}
        else {
    Log.d("ahm","button 2 was clicked");
        }

    }
}
