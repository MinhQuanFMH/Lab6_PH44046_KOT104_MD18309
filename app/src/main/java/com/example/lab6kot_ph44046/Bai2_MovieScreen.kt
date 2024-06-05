package com.example.lab6kot_ph44046

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab6kot_ph44046.components.MovieColumn
import com.example.lab6kot_ph44046.components.MovieGrid
import com.example.lab6kot_ph44046.components.MovieRow
import com.example.lab6kot_ph44046.model.ListType
import com.example.lab6kot_ph44046.model.MovieModel



@Composable
fun Bai2_MovieScreen(movies: List<MovieModel>) {
    var listType by remember { mutableStateOf(ListType.ROW) }
    Column {
        Row(
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { listType = ListType.ROW }) {
                Text("Row")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { listType = ListType.COLUMN }) {
                Text("Column")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { listType = ListType.GRID }) {
                Text("Grid")
            }
        }
        when (listType) {
            ListType.ROW -> MovieRow(movies)
            ListType.COLUMN -> MovieColumn(movies)
            ListType.GRID -> MovieGrid(movies)
        }
    }
}