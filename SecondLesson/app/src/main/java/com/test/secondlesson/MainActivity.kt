package com.test.secondlesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.secondlesson.ui.theme.SecondLessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxSize(0.5f)
                    .fillMaxWidth()
//                    .requiredWidth(600.dp)
//                    .padding(top = 50.dp)
                    .border(5.dp,Color.Magenta)
                    .padding(5.dp)
            ) {
                Text("hello", modifier = Modifier.clickable {
                    
                }
//
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text("World")
            }
        }
    }
}

