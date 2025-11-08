package com.example.tugasnavigasiku.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPesertaScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Daftar Peserta") }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            Text("Daftar peserta akan ditampilkan di sini.")
        }
    }
}
