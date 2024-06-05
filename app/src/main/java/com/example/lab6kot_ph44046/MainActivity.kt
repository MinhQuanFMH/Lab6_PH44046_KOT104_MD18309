package com.example.lab6kot_ph44046

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab6kot_ph44046.components.CinemaSeatBookingScreen
import com.example.lab6kot_ph44046.model.MovieModel
import com.example.lab6kot_ph44046.ui.theme.Lab6KOT_PH44046Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Bai1_MovieScreen(MovieModel.getSampleMovies())
            //Bai2_MovieScreen(MovieModel.getSampleMovies())
            CinemaSeatBookingScreen(
                createTheaterSeating(
                    totalRows = 12,
                    totalSeatsPerRow = 9,
                    aislePositionInRow = 4,
                    aislePositionInColumn = 5
                ), totalSeatsPerRow = 9
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab6KOT_PH44046Theme {
        Greeting("Android")
    }
}