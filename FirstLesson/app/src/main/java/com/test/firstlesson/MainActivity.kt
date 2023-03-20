package com.test.firstlesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.firstlesson.ui.theme.FirstLessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstLessonTheme {
               Row(
                   modifier = Modifier
                       .width(200.dp)
                       .fillMaxHeight(0.7f)
                       .background(Color.Green),
                   horizontalArrangement =  Arrangement.SpaceAround,
                   verticalAlignment = Alignment.Bottom
                   ) {
                        Text(text = "Hello")
                        Text(text = "aDevelopr")
                        Text(text = "Hello")

               }
            }
        }
    }
}
