@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.secondmodernui.ui.homeScrean

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.secondmodernui.component.AppBar
import com.example.secondmodernui.component.VisaRow
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
            Spacer(modifier = Modifier.height(20.dp))
            VisaRow()


        }
    }
}


