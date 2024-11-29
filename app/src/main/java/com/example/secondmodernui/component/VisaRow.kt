package com.example.secondmodernui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondmodernui.data.VisaModel

@Composable
fun VisaRow() {
    val rowList = listOf<VisaModel>(
        VisaModel("Visa", "Business", "$ 5.988", "...7676", Color.Blue),
        VisaModel("Visa", "Business", "$ 5.988", "...7676", Color.Blue),
        VisaModel("Visa", "Business", "$ 5.988", "...7676", Color.Blue),
        VisaModel("Visa", "Business", "$ 5.988", "...7676", Color.Blue)
    )



    LazyRow (
        modifier = Modifier
            .height(300.dp)
            .padding(vertical = 16.dp)
    ){
        items(rowList.size) { index ->
            val item = rowList[index]
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(horizontal = 15.dp, vertical = 20.dp)
                    .width(200.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(item.backgroundColor)
                    .padding(horizontal = 8.dp)


            )

            {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = item.title,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(all = 8.dp),
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = item.type,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(all = 8.dp),
                        fontSize = 10.sp,
                        color = Color.Black
                    )

                    Text(
                        text = item.balance.toString(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(all = 8.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = item.cardNumber,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(all = 8.dp),
                        fontSize = 10.sp,
                        color = Color.Black
                    )

                }
            }

        }
    }
}