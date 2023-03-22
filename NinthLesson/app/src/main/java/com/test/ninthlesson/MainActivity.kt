package com.test.ninthlesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.graphics.Color
import  androidx.compose.material.Text
import  androidx.compose.material.Button
import androidx.compose.ui.Alignment
import  androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var sizeState by remember {
                mutableStateOf(200.dp)
            }
            val size by androidx.compose.animation.core.animateDpAsState(targetValue = sizeState,
                androidx.compose.animation.core.tween(durationMillis = 3000, delayMillis = 300, easing = androidx.compose.animation.core.LinearOutSlowInEasing))
            Box(
                modifier = androidx.compose.ui.Modifier
                    .size(size)
                    .background(Color.Red),
                contentAlignment = Alignment.Center) {
                Button(onClick = { sizeState += 50.dp
                }) {
                    Text(text = "IncreaseSize")
                }
            }
        }
    }
}


