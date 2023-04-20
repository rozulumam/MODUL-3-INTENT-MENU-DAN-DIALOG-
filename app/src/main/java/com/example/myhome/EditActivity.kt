package com.example.myhome

import com.example.myhome.data.AppDatabase
import com.example.myhome.data.entity.User



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EditActivity : AppCompatActivity() {

    private lateinit var fullName: EditText
    private lateinit var email: EditText
    private lateinit var btnSave: Button
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        fullName = findViewById(R.id.full_name)
        email = findViewById(R.id.email)
        btnSave = findViewById(R.id.btn_save)

        database = AppDatabase.getInstance(applicationContext)
        btnSave.setOnClickListener {
            if(fullName.text.isNotEmpty() && email.text.isNotEmpty()){
                database.userDao().insertAll(
                    User(
                    null,
                    fullName.text.toString(),
                    email.text.toString()
                )
                )
                finish()
            }
            else{
                Toast.makeText(applicationContext,"Silahkan Isi semua data dengan valid", Toast.LENGTH_SHORT).show()
            }
        }
    }
}