package com.example.tugasnavigasiku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.tugasnavigasiku.ui.theme.TugasNavigasiKuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasNavigasiKuTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Konten utama aplikasi
                }
            }
        }
    }
}
