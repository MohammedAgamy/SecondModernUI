@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.secondmodernui.ui.homeScrean

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondmodernui.ui.AppBar
import com.example.secondmodernui.ui.theme.Black

@Composable
fun Home() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Black)
    ) {

        Column {
            Spacer(modifier = Modifier.height(40.dp))
            AppBar()

        }
    }
}


