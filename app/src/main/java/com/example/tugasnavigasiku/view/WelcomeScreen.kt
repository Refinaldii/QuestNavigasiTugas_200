package com.example.tugasnavigasiku.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugasnavigasiku.R

@Composable
fun WelcomeScreen(navController: NavController) {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Selamat Datang!", style = MaterialTheme.typography.headlineLarge)
            Spacer(Modifier.height(24.dp))
            Image(
                painter = painterResource(id = R.drawable.contoh),
                contentDescription = "Gambar Selamat Datang",
                modifier = Modifier
                    .size(200.dp)
                    .padding(bottom = 16.dp)
            )
        }
    }
}
