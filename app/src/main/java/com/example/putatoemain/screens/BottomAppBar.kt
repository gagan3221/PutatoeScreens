package com.example.putatoemain.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomAppBarView(){
    BottomAppBar(backgroundColor = Color(2, 145, 160)){
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween){
            Column(modifier = Modifier
                .clickable { }
                .padding(start = 10.dp)){
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null,
                    modifier = Modifier
                        .size(40.dp))
                Text(text = "Profile")
            }

            Column(modifier = Modifier.clickable {  }){
                Icon(imageVector = Icons.Rounded.ShoppingCart, contentDescription = null,
                    modifier = Modifier
                        .size(40.dp))
                Text(text = "Your Cart")
            }
            Column(modifier = Modifier
                .clickable { }
                .padding(start = 10.dp)){
                Icon(imageVector = Icons.Default.Add, contentDescription = null,
                    modifier = Modifier
                        .size(40.dp))
                Text(text = "Add items")
            }
            Column(modifier = Modifier
                .clickable { }
                .padding(start = 10.dp)){
                Icon(imageVector = Icons.Default.Favorite, contentDescription = null,
                    modifier = Modifier
                        .size(40.dp))
                Text(text = "Favourites")
            }

        }


    }

}

@Preview
@Composable
fun BottomAppBarPreview(){
    BottomAppBarView()
}