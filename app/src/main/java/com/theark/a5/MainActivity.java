package com.theark.a5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input_a,input_b;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        input_a = (EditText) findViewById(R.id.input_a);
        input_b = (EditText) findViewById(R.id.input_b);

        ans = (TextView) findViewById(R.id.ans);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onButtonClick(View v){

        int id = v.getId();
        try {
            switch (id) {
                case R.id.sin:
                    double rad = Math.toRadians(Double.parseDouble(input_a.getText().toString()));
                    double value = Math.sin(rad);
                    ans.setText("" + value);
                    Log.d("ans sin" , value+"----"+rad+"-----"+ans);
                    break;
                case R.id.cos:
                    ans.setText("" + Math.round(Math.cos(Math.toRadians(Double.parseDouble(input_a.getText().toString())))));
                    break;
                case R.id.tan:
                    ans.setText("" + Math.round(Math.tan(Math.toRadians(Double.parseDouble(input_a.getText().toString())))));
                    break;
                case R.id.cosec:
                    ans.setText("" + Math.round((double) 1 / Math.sin(Math.toRadians(Double.parseDouble(input_a.getText().toString())))));
                    break;
                case R.id.sec:
                    ans.setText("" + Math.round((double) 1 / Math.cos(Math.toRadians(Double.parseDouble(input_a.getText().toString())))));
                    break;
                case R.id.cot:
                    ans.setText("" + Math.round((double) 1 / Math.tan(Math.toRadians(Double.parseDouble(input_a.getText().toString())))));
                    break;

                case R.id.num_dot:
                    break;
                case R.id.num_zero:
                    break;
                case R.id.num_one:
                    break;
                case R.id.num_tw0:
                    break;
                case R.id.num_three:
                    break;
                case R.id.num_four:
                    break;
                case R.id.num_five:
                    break;
                case R.id.num_six:
                    break;
                case R.id.num_seven:
                    break;
                case R.id.num_eight:
                    break;
                case R.id.num_nine:
                    break;

                case R.id.equals:
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
}
