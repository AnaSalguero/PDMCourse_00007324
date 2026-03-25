package com.pdmcourse.ejercicio1

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.graphics.Color as ComposeColor
import android.graphics.Color as AndroidColor
import com.pdmcourse.ejercicio1.ui.theme.Ejercicio1Theme


@Composable
fun Ejercicio01(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.imagen),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }
        Box(){
            Text(text = stringResource(id = R.string.compose_tutorial),
                fontSize = 24.sp,
                modifier= Modifier.padding(16.dp))
        }
        Box(modifier=Modifier.fillMaxWidth()){
            Text(text = stringResource(id = R.string.compose1),
                textAlign=TextAlign.Justify,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                )
        }
        Box(){
            Text(text = stringResource(id = R.string.compose2),
                textAlign=TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Ejercicio1Preview() {
    Ejercicio1Theme {
        Ejercicio01()
    }
}