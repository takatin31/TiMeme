package com.example.memeapp;


import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import ja.burhanrashid52.photoeditor.PhotoEditor
import ja.burhanrashid52.photoeditor.PhotoEditorView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mPhotoEditorView = findViewById<PhotoEditorView>(R.id.photoEditorView)

        mPhotoEditorView.source.setImageResource(R.drawable.test)


        //Use custom font using latest support library
        //Use custom font using latest support library
        //val mTextRobotoTf = ResourcesCompat.getFont(this, R.font.roboto_medium)

//loading font from assest

//loading font from assest

        var mPhotoEditor = PhotoEditor.Builder(this, mPhotoEditorView)
            .setPinchTextScalable(true)
            .build()

        mPhotoEditor.setBrushDrawingMode(true);
    }
}