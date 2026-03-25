package com.pdmcourse.ejercicio1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color as ComposeColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdmcourse.ejercicio1.ui.theme.Ejercicio1Theme

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
fun Ejercicio3Preview() {
    Ejercicio1Theme {
        Ejercicio03()
    }
}