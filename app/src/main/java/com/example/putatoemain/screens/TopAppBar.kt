package com.example.putatoemain.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.putatoemain.R

@Composable
fun TopAppBarView(){
    TopAppBar(title = {
        Icon(imageVector = Icons.Default.Menu, contentDescription = "menubutton",
            modifier = Modifier
                .clickable { }
                .padding(end = 6.dp))
        Image(painter = painterResource(id = R.drawable.potatoelogo),
            contentDescription = "putatoelogo" )
        Spacer(modifier = Modifier.width(7.dp))
        Text(text = "PUTATOE", fontSize = 25.sp,
            fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.width(80.dp))
        Button(onClick = { /*TODO*/ } ,
            colors = ButtonDefaults.buttonColors(Color.White)) {
            Icon(imageVector = Icons.Default.Person, contentDescription = null , tint = Color.Black )
            Text(text = "Login" , color = Color.Black)
        }
    },
        elevation = 5.dp
        , backgroundColor = Color(2, 145, 160)
    )
}


@Preview(showBackground = true , showSystemUi = true)
@Composable
fun TopAppBarPreview(){
    TopAppBarView()
}