package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
private ImageView iv;
private Button btn;
private RadioButton rb;
private RadioGroup rg ;
private EditText pto;
private  EditText demo ;
private static int mine = 0, opo =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView)findViewById(R.id.imageView);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rnd = 1 + (int)(Math.random() *3);
                if(rnd==1) {
                    iv.setImageResource(R.drawable.rock);
                    rnd = 1;
                }
                else if (rnd==2){
                    iv.setImageResource(R.drawable.paper);
                    rnd = 2;
                }
                else if (rnd==3) {
                    iv.setImageResource(R.drawable.scissors);
                    rnd = 3;
                }
                else{}

                int choice = 0;
//                pto = (EditText)findViewById(R.id.pto);
//
//                if (pto.getText().toString().equals("ROCK")){
//
//                    choice = 1;
//                }
//                else  if (pto.getText().toString().equals("PAPER")){
//
//                    choice = 2;
//
//                }
//                else{
//
//                    choice = 3;
//                }

                rg = (RadioGroup) findViewById(R.id.rg);
                demo = (EditText)findViewById(R.id.demo);

                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(id);
                demo.setText(id+"");
                if (rb.getText().equals("ROCK")){
                    choice =1 ;
                }
                else if (rb.getText().equals("PAPER")){
                    choice = 2;
                }
                else {
                    choice = 3;

                }



//                demo.setText(+choice+" "+rnd);

                if ((choice==1)&&(rnd==1)){
                    Toast.makeText(MainActivity.this, "DRAW", Toast.LENGTH_SHORT).show();

                }
                else if ((choice==1)&&(rnd==2)){
                    Toast.makeText(MainActivity.this, "YOU LOOSE", Toast.LENGTH_SHORT).show();
opo++;
                }
               else if ((choice==1)&&(rnd==3)){
                    Toast.makeText(MainActivity.this, "YOU WIN", Toast.LENGTH_SHORT).show();
mine++;
                }

                else if ((choice==2)&&(rnd==1)){
                    Toast.makeText(MainActivity.this, "YOU WIN", Toast.LENGTH_SHORT).show();
mine++;
                }
                else if ((choice==2)&&(rnd==2)){
                    Toast.makeText(MainActivity.this, "DRAW", Toast.LENGTH_SHORT).show();

                }
                else if ((choice==2)&&(rnd==3)){
                    Toast.makeText(MainActivity.this, "YOU LOOSE", Toast.LENGTH_SHORT).show();
opo++;
                }
                else if ((choice==3)&&(rnd==1)){
                    Toast.makeText(MainActivity.this, "YOU LOOSE", Toast.LENGTH_SHORT).show();
opo++;
                }
                else if ((choice==3)&&(rnd==2)){
                    Toast.makeText(MainActivity.this, "YOU WIN", Toast.LENGTH_SHORT).show();
mine++;
                }
                else if ((choice==3)&&(rnd==3)){
                    Toast.makeText(MainActivity.this, "DRAW", Toast.LENGTH_SHORT).show();

                }
                else{}

                demo.setText("Your Score "+mine+" AND AI "+opo);

            }
        });


    }
}