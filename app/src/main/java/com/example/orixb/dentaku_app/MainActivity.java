package com.example.orixb.dentaku_app;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;

import java.io.IOException;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.RotateAnimation;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private SoundPool soundPool;

    private int mp_0,mp_1,mp_2,mp_3,mp_4,mp_5,mp_6,mp_7,mp_8,mp_9,mp_tasu,mp_hiku,mp_kakeru,mp_waru,mp_ikoru, mp_cr,mp_dot;


    private TextView display;
    private ImageButton[] buttons;
    private Calc calc;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //音を出すための設定
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                .build();
        soundPool = new SoundPool.Builder()
                .setAudioAttributes(audioAttributes)
                // ストリーム数に応じて
                .setMaxStreams(15)
                .build();


        // 音声をロードしておく
        mp_0 = soundPool.load(this, R.raw.zero1, 1);
        mp_1 = soundPool.load(this, R.raw.ichi1, 1);
        mp_2 = soundPool.load(this, R.raw.ni2, 1);
        mp_3 = soundPool.load(this, R.raw.san3, 1);
        mp_4 = soundPool.load(this, R.raw.yon4, 1);
        mp_5 = soundPool.load(this, R.raw.go5, 1);
        mp_6 = soundPool.load(this, R.raw.roku6, 1);
        mp_7 = soundPool.load(this, R.raw.nana7, 1);
        mp_8 = soundPool.load(this, R.raw.hachi8, 1);
        mp_9 = soundPool.load(this, R.raw.kyuu9, 1);
        mp_tasu = soundPool.load(this, R.raw.tasu, 1);
        mp_hiku = soundPool.load(this, R.raw.hiku, 1);
        mp_kakeru = soundPool.load(this, R.raw.kakeru, 1);
        mp_waru = soundPool.load(this, R.raw.waru, 1);
        mp_ikoru = soundPool.load(this, R.raw.equal, 1);
        mp_cr = soundPool.load(this, R.raw.clear, 1);
        mp_dot = soundPool.load(this, R.raw.ten0, 1);


        display = (TextView)findViewById(R.id.display);
        buttons = new ImageButton[17];
        int[] buttonId = {
                R.id.zero_button, R.id.one_button, R.id.two_button,
                R.id.three_button, R.id.four_button, R.id.five_button,
                R.id.six_button, R.id.seven_button, R.id.eight_button,
                R.id.nine_button, R.id.ac_button, R.id.mul_button,
                R.id.div_button, R.id.plus_button, R.id.minus_button,
                R.id.dot_button, R.id.equal_button
        };
        for(int i = 0; i < buttons.length; i++) {
            buttons[i] = (ImageButton) findViewById(buttonId[i]);
            buttons[i].setOnClickListener(this);
        }
        calc = new Calc("0", "0");
        display.setText(calc.clear());
    }
    @Override
    public void onClick(View view) {
        ImageButton button = (ImageButton) view;
        switch(button.getId()) {
            case R.id.zero_button :
                display.setText(calc.inputData("0"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_0,1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.one_button :
                display.setText(calc.inputData("1"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_1, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.two_button :
                display.setText(calc.inputData("2"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_2, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.three_button :
                display.setText(calc.inputData("3"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_3, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.four_button :
                display.setText(calc.inputData("4"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_4, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.five_button :
                display.setText(calc.inputData("5"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_5, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.six_button :
                display.setText(calc.inputData("6"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_6, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.seven_button :
                display.setText(calc.inputData("7"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_7, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.eight_button :
                display.setText(calc.inputData("8"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_8, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.nine_button :
                display.setText(calc.inputData("9"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_9, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.ac_button :
                display.setText(calc.clear());
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_cr, 1.0f, 1.0f, 0, 0, 1);;
                break;
            case R.id.mul_button :
                calc.onOperatorButtonClick(1);
//display.setText(calc.doCalc("*"))
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_kakeru, 1.0f, 1.0f, 0, 0, 1);;
                break;
            case R.id.div_button :
                calc.onOperatorButtonClick(2);
//display.setText(calc.doCalc("/"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_waru, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.plus_button :
                calc.onOperatorButtonClick(3);
//display.setText(calc.doCalc("+"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_tasu, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.minus_button :
                calc.onOperatorButtonClick(4);
//display.setText(calc.doCalc("-"));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_hiku, 1.0f, 1.0f, 0, 0, 1);
                break;
            case R.id.dot_button :
                display.setText(calc.inputData("."));
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_dot, 1.0f, 1.0f, 0, 0, 1);;
                break;
            case R.id.equal_button :
                display.setText(calc.doCalc());
                // play(ロードしたID, 左音量, 右音量, 優先度, ループ,再生速度)
                soundPool.play(mp_ikoru, 1.0f, 1.0f, 0, 0, 1);
                break;
        }
   }
}