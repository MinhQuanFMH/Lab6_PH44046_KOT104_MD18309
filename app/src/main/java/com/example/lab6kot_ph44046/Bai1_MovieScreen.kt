package com.example.lab6kot_ph44046

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.lab6kot_ph44046.components.MovieItem
import com.example.lab6kot_ph44046.model.MovieModel


@Composable
fun Bai1_MovieScreen(movies: List<MovieModel>) {
    LazyRow(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies.size) { index ->
            MovieItem(movie = movies[index])
        }
    }
}