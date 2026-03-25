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

@Composable
fun Ejercicio03(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)){
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(ComposeColor(0xFFEADDFF)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Column(modifier= Modifier.padding(16.dp),  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                    Box(){
                        Text(stringResource(R.string.text1),
                            textAlign=TextAlign.Justify,
                            fontWeight = FontWeight.Bold,
                            modifier= Modifier.padding(bottom = 16.dp))
                    }
                    Box(){
                        Text(stringResource(R.string.parraf1),
                            textAlign=TextAlign.Justify)
                    }
                }
            }
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(ComposeColor(0xFFC0BCFF)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Column(modifier= Modifier.padding(16.dp),  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                    Box(){
                        Text(stringResource(R.string.text2),
                            textAlign=TextAlign.Justify,
                            fontWeight = FontWeight.Bold,
                            modifier= Modifier.padding(bottom = 16.dp))
                    }
                    Box(){
                        Text(stringResource(R.string.parraf2),
                            textAlign=TextAlign.Justify)
                    }
                }
            }
        }
        Row(modifier = Modifier.weight(1f)){
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(ComposeColor(0xFFB69DF8)),  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Column(modifier= Modifier.padding(16.dp),  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                    Box(){
                        Text(stringResource(R.string.text3),
                            textAlign=TextAlign.Justify,
                            fontWeight = FontWeight.Bold,
                            modifier= Modifier.padding(bottom = 16.dp))
                    }
                    Box(){
                        Text(stringResource(R.string.parraf3),
                            textAlign=TextAlign.Justify)
                    }
                }
            }
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(ComposeColor(0xFFF6EDFF)),  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Column(modifier= Modifier.padding(16.dp),  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                    Box(){
                        Text(stringResource(R.string.text4),
                            textAlign=TextAlign.Justify,
                            fontWeight = FontWeight.Bold,
                            modifier= Modifier.padding(bottom = 16.dp))
                    }
                    Box(){
                        Text(stringResource(R.string.parraf4),
                            textAlign=TextAlign.Justify)
                    }
                }
            }
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

@Preview(showBackground = true)
@Composable
fun Ejercicio2Preview() {
    Ejercicio1Theme {
        Ejercicio02()
    }
}

@Preview(showBackground = true)
@Composable
fun Ejercicio3Preview() {
    Ejercicio1Theme {
        Ejercicio03()
    }
}