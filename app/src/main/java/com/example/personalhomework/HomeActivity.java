package com.example.personalhomework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    Button Button_event;
    ImageView Change_image;

    EditText num1, num2;
    Button[] numbuttons = new Button[10];
    Button btnadd, btnsub, btnmul, btndiv, btnres;
    TextView result;
    int res;

    Integer[] numBtnIDs = {R.id.button1, R.id.button2, R.id.button3,
            R.id.button5, R.id.button6, R.id.button7, R.id.button8,
            R.id.button9, R.id.button0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        setTitle("계산기 페이지");

        Button_event = (Button) findViewById(R.id.change);
        Change_image = (ImageView) findViewById(R.id.imageView);


        num1 = (EditText) findViewById(R.id.Edit1);
        num2 = (EditText) findViewById(R.id.Edit2);

        btnadd = (Button) findViewById(R.id.buttonadd);
        btnsub = (Button) findViewById(R.id.buttonsub);
        btnmul = (Button) findViewById(R.id.buttonmul);
        btndiv = (Button) findViewById(R.id.buttondiv);
        btnres = (Button) findViewById(R.id.buttonres);

        result = (TextView) findViewById(R.id.TextResult);


        for (int i = 0; i < numBtnIDs.length; i++) {
            numbuttons[i] = (Button) findViewById(numBtnIDs[i]);
        }

        for (int i = 0; i < numBtnIDs.length; i++) {
            final int index = i;
            numbuttons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String a, b;

                    if (num1.isFocused() == true) {
                        a = num1.getText().toString() + numbuttons[index].getText().toString();
                        num1.setText(a);
                    } else if (num2.isFocused() == true) {
                        b = num2.getText().toString() + numbuttons[index].getText().toString();
                        num2.setText(b);
                    } else {
                        Toast.makeText(HomeActivity.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }

        View.OnClickListener clisten = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b;
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());

                switch (v.getId()) {
                    case R.id.buttonadd:
                        res = a + b;
                        break;
                    case R.id.buttonsub:
                        res = a - b;
                        break;
                    case R.id.buttonmul:
                        res = a * b;
                        break;
                    case R.id.buttondiv:
                        res = a / b;
                        break;
                    case R.id.buttonres:
                        result.setText("정답: " + res);
                        break;
                }
            }
        };

        btnadd.setOnClickListener(clisten);
        btndiv.setOnClickListener(clisten);
        btnmul.setOnClickListener(clisten);
        btnsub.setOnClickListener(clisten);
        btnres.setOnClickListener(clisten);
    }

    public void onClick(View view){
        Change_image.setImageResource(R.drawable.andtwo);
    }
}
