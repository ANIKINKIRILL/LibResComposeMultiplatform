package com.anikinkirill.example

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.github.skeptick.libres.compose.painterResource

@Composable
internal fun App() {
    Box(modifier = Modifier.fillMaxSize().background(Color.White)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(Greeting().greeting())
            Image(
                painter = painterResource(image = AppResources.image.ic_calendar),
                contentDescription = null,
            )
        }
    }
}