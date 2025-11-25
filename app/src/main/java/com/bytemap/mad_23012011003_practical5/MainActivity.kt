package com.bytemap.mad_23012011003_practical5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.bytemap.mad_23012011003_practical5.ui.theme.Pactical5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pactical5Theme {
                AppNavigation(context = this)
            }
        }
    }
}