package com.pdmcourse.ejercicio1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdmcourse.ejercicio1.ui.theme.Ejercicio1Theme

@Composable
fun Ejercicio02(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxHeight().fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Box() {
            Image(
                painter = painterResource(id = R.drawable.task_completed),
                contentDescription = "",
                contentScale = ContentScale.None
            )
        }
        Box(){
            Text(text = stringResource(R.string.task),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
            )
        }
        Box(){
            Text(text = stringResource(R.string.nice_work),
                textAlign=TextAlign.Center,
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Ejercicio2Preview() {
    Ejercicio1Theme {
        Ejercicio02()
    }
}
