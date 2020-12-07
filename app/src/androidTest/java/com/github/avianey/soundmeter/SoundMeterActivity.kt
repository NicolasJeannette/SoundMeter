package com.github.avianey.soundmeter
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class SoundMeterActivity : AppCompatActivity() {

    private var popupDisplayed = false

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sound_meter)
        if (savedInstanceState?.getBoolean("popupAlreadyDisplayed") != true){

            //Afficher la popup
            popupDisplayed = true
        }
    }
    override fun onSaveInstanceState(outState: Bundle)
    {
        super.onSaveInstanceState(outState)
        outState.putBoolean("popupAlreadyDisplayed", popupDisplayed)
    }

}