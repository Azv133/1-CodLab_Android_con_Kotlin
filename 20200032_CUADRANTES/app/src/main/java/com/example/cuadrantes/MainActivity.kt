package com.example.cuadrantes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantes.ui.theme.CuadrantesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadrantesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxWidth()
    ){
        Row (
            modifier = modifier.weight(1f)
        ){
            GreetingContent(
                title = stringResource(R.string.title1),
                text = stringResource(R.string.text1),
                backgroundColor = Color(0xFFEADDFF),
                modifier = modifier.weight(1f),
            )
            GreetingContent(
                title = stringResource(R.string.title2),
                text = stringResource(R.string.text2),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = modifier.weight(1f),
            )
        }
        Row (
            modifier = modifier.weight(1f)
        ) {
            GreetingContent(
                title = stringResource(R.string.title3),
                text = stringResource(R.string.text3),
                backgroundColor = Color(0xFFB69DF8),
                modifier = modifier.weight(1f),
            )
            GreetingContent(
                title = stringResource(R.string.title4),
                text = stringResource(R.string.text4),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = modifier.weight(1f),
            )
        }
    }
}

@Composable
fun GreetingContent(title: String, text: String, backgroundColor: Color, modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxHeight()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(bottom = 16.dp)
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadrantesTheme {
        Greeting()
    }
}