package com.example.tugasnavigasiku.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class PesertaData(
    val nama: String,
    val jenisKelamin: String,
    val status: String,
    val alamat: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPesertaScreen(navController: NavController) {
    val daftarPeserta = listOf(
        PesertaData("Rina Aulia", "Perempuan", "Belum Menikah", "Bantul"),
        PesertaData("Dimas Fadli", "Laki-laki", "Menikah", "Yogyakarta"),
        PesertaData("Siti Rahmawati", "Perempuan", "Belum Menikah", "Sleman")
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Daftar Peserta") })
        }
    ) { padding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(padding)
                .padding(8.dp)
                .fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(daftarPeserta) { peserta ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(peserta.nama, style = MaterialTheme.typography.titleMedium)
                        Spacer(Modifier.height(4.dp))
                        Text("Jenis Kelamin: ${peserta.jenisKelamin}")
                        Text("Status: ${peserta.status}")
                        Text("Alamat: ${peserta.alamat}")
                    }
                }
            }
        }
    }
}
