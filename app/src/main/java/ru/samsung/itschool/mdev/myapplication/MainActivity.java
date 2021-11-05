package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    // инициализация активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TTTT","onCreate()");
    }

    // вызывается, когда сама активность стала видимой
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TTTT","onStart()");
    }

    // возобновление обновления UI
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TTTT","onResume()");
    }

    // вызывается перед выходом из активного состояния
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TTTT","onPause()");
    }

    // приостоновка UI (активность не на переднем плане)
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TTTT","onStop()");
    }

    // Перезапуск активности
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TTTT","onRestart()");
    }
    // Освобождение ресурсов, соеденений с Сетью или БД
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TTTT","onDestroy()");
    }


}