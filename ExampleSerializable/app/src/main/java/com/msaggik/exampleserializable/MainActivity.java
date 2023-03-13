package com.msaggik.exampleserializable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // определение полей
    private EditText nameIn; // поле имени
    private EditText addressIn; // поле адреса
    private EditText emailIn; // поле электронного адреса
    private Button button; // поле кнопки

    private String name; // поле хранения имени
    private String address; // поле хранения адреса
    private String email; // поле хранения электронного адреса

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка id к полям
        nameIn = findViewById(R.id.nameIn);
        addressIn = findViewById(R.id.addressIn);
        emailIn = findViewById(R.id.emailIn);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран и передача данных

            // считывание данных с экрана
            name = nameIn.getText().toString();
            address = addressIn.getText().toString();
            email = emailIn.getText().toString();

            // создадим объект нашей сущности и через конструктор инициализируем его
            User user = new User(name, address, email);

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            // запаковка данных в контейнер намерения
            intent.putExtra(User.class.getSimpleName(), user); // User.class.getSimpleName() является ключом для запаковки в контейнер

            // старт переключения активити и передачи данных
            startActivity(intent);
        }
    };
}