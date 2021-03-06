package com.theark.a5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    }

    public void onButtonClick(View v){

        int id = v.getId();
        try {
            double n;
            if(input_a.getText().toString().equals(""))
                n = 0.0;
            else
                n = Double.parseDouble(input_a.getText().toString());

            double n1 = input_a.getText().toString().equals("") ? 0.0 : Double.parseDouble(input_a.getText().toString());
            double n2 = input_b.getText().toString().equals("") ? 0.0 : Double.parseDouble(input_b.getText().toString());
            double rad = Math.toRadians(n1);

            switch (id) {
                case R.id.sin:
                    ans.setText("" + (Math.sin(rad) ));
                    break;
                case R.id.cos:
                    ans.setText("" + (Math.cos(rad)  ));
                    break;
                case R.id.tan:
                    ans.setText("" + (Math.tan(rad)));
                    break;
                case R.id.cosec:
                    ans.setText("" + (1 / Math.sin(rad) ));
                    break;
                case R.id.sec:
                    ans.setText("" + (1 / Math.cos(rad) ));
                    break;
                case R.id.cot:
                    ans.setText("" + (1 / Math.tan(rad) ));
                    break;

                case R.id.plus:
                    ans.setText(""+(n1+n2));
                    break;
                case R.id.minus:
                    ans.setText(""+(n1-n2));
                    break;
                case R.id.divide:
                    ans.setText(""+(n1/n2));
                    break;
                case R.id.multiply:
                    ans.setText(""+(n1*n2));
                    break;
                case R.id.percentage:
                    ans.setText(""+(n1/n2)*100);
                    ans.append("%");
                    break;
                case R.id.abs:
                    ans.setText("" + Math.abs(n1));
                    break;

                case R.id.clear_a:
                    input_a.setText("");
                    break;
                case R.id.clear_b:
                    input_b.setText("");
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
