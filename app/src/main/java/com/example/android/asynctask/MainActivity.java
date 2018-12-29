package com.example.android.asynctask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText number;
    Button btn;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=(EditText) findViewById(R.id.editText);
        message=(TextView) findViewById(R.id.mess);
    }
    public void btnclk(View v)
    {
        int one=0,two=0,three=0,four=0,five=0,six=0,randomnumber;
        Random random=new Random();
        int notimes=Integer.parseInt(number.getText().toString().trim());
        for(int i=0;i<notimes;++i)
        {
            randomnumber=random.nextInt(6)+1;
            switch (randomnumber)
            {
                case 1: one++;
                        break;
                case 2: two++;
                        break;
                case 3: three++;
                        break;
                case 4: four++;
                        break;
                case 5: five++;
                        break;
                default: six++;
            }
        }
        message.setText("Results: \n1: " + one + "\n" + "2: "+two+"\n3: "+three+"\n4: "+four+"\n5: "+five+"\n6: "+six);
        Toast.makeText(this, "Process Done!", Toast.LENGTH_SHORT).show();
    }
    public class processdiceinbackgorund extends AsyncTask<Integer,Integer,String>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Integer... integers) {
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {

        }
    }
}
