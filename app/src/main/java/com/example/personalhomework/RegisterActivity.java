package com.example.personalhomework;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText username, password, name, address, phone;
    RadioGroup agree;
    Button register, cancel;

    SharedPreferences preferences;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        setTitle("회원가입 페이지");
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        phone = findViewById(R.id.phone);
        agree = findViewById(R.id.agree);
        register = findViewById(R.id.register);
        cancel = findViewById(R.id.cancel);

        preferences = getSharedPreferences("Userinfo", 0);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameValue = username.getText().toString();
                String passwordValue = password.getText().toString();
                String nameValue = name.getText().toString();
                String addressValue = address.getText().toString();
                String phoneValue = phone.getText().toString();
                RadioButton checkedBtn = findViewById(agree.getCheckedRadioButtonId());
                String agreeValue = checkedBtn.getText().toString();

                if (usernameValue.length()>1 && passwordValue.length()>4) {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("username", usernameValue);
                    editor.putString("password", passwordValue);
                    editor.putString("name", nameValue);
                    editor.putString("address", addressValue);
                    editor.putString("phone", phoneValue);
                    editor.putString("agree", agreeValue);
                    editor.apply();
                    Toast.makeText(RegisterActivity.this, "회원정보 저장", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(RegisterActivity.this, "조건을 맞춰주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "처음 화면으로", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
