package com.example.putatoemain.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SignUpScreen(){
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)){
        Image(painter = painterResource(id = com.example.putatoemain.R.drawable.potatoelogo ),
            contentDescription ="Putatoe logo", modifier = Modifier.size(120.dp))
        /*Text(text = "PUTATOE" ,
            fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)*/
        Text(text = "Welcome Back!", fontSize = 30.sp, fontWeight = FontWeight.SemiBold)
        Text(text = "Sign in to your account", fontSize = 16.sp, fontWeight = FontWeight.Light)
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedTextField(value = username , onValueChange ={username=it} ,
            label = { Text(text = "Enter mobile or username") })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = password , onValueChange ={password=it} ,
            label = { Text(text = "Enter Password") },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Forgot Password?", modifier = Modifier
            .clickable { }
            .padding(start = 160.dp),
            color = Color(2, 145, 160), fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(30.dp))
        Row(){
            Text(text = "I agree to all the")
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Terms & Conditions",
                modifier = Modifier.clickable { },
                color = Color(2, 145, 160),
                textDecoration = TextDecoration.Underline
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(){
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(2, 145, 160))) {
                Text("Login")

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(2, 145, 160))) {
                Text(text = "Login with O.T.P")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(){
            Text(text = "___________________")
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Or")
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "___________________")

        }
        Image(painter = painterResource(id = com.example.putatoemain.R.drawable.signinwithgoogle) ,
            contentDescription = "Signinwithgoogle", modifier = Modifier.clickable {  })

        Row(){
            Text(text = "Not having an account?")
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Create Account",
                modifier = Modifier.clickable { },
                color = Color(2, 145, 160),
                fontWeight = FontWeight.Bold
            )
        }


    }

}


@Preview(showBackground = true , showSystemUi = true)
@Composable
fun SignUpScreenPreview(){
    SignUpScreen()
}
