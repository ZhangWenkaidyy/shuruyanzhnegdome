package com.choose_gold.jupengdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dalimao.corelibrary.VerificationCodeInput;

public class MainActivity extends AppCompatActivity {
    VerificationCodeInput input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      input = (VerificationCodeInput) findViewById(R.id.verificationCodeInput);
        input.setOnCompleteListener(new VerificationCodeInput.Listener() {
            @Override
            public void onComplete(String content) {
                Log.d("------------", "完成输入：" + content);

            }
        });


    }

    public void click(View view) {
        input.setEnabled(true);

    }
}
