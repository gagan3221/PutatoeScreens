package com.example.putatoemain.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.putatoemain.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    var query by remember { mutableStateOf("Search") }
    Scaffold(topBar = {
        "TopAppBarView()"
    },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }){
                Image(painter = painterResource(id = R.drawable.potatoelogo), contentDescription = null )
            }
        },
        bottomBar = {
            BottomAppBarView()

        }){innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)

        ) {
            var text by remember {mutableStateOf("") }
            var active by remember { mutableStateOf(false) }
            SearchBar(query = text , onQueryChange = {
                                                     text=it
            }, onSearch = {active=false}, active = active , onActiveChange ={active=it},
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Search for Products and Brands")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null )
                }) {
                
            }
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween){
                Column(modifier = Modifier
                    .clickable { }
                    .padding(start = 20.dp)){
                    Image(painter = painterResource(id = R.drawable.recharge), contentDescription = null,
                        modifier = Modifier.size(60.dp))
                    Text(text = "Recharge")

                }
                Column(modifier = Modifier.clickable {  }){
                    Image(painter = painterResource(id = R.drawable.loan), contentDescription = null,
                        modifier = Modifier.size(60.dp))
                    Text(text = "Loans")
                }
                Column(modifier = Modifier.clickable {  }){
                    Image(painter = painterResource(id = R.drawable.billpayments), contentDescription = null,
                            modifier = Modifier.size(60.dp))
                    Text(text = "Bill Payments")
                    }
                }
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween){
                Column(modifier = Modifier
                    .clickable { }
                    .padding(start = 20.dp)){
                    Image(painter = painterResource(id = R.drawable.news), contentDescription = null,
                        modifier = Modifier.size(60.dp))
                    Text(text = "News")

                }
                Column(modifier = Modifier.clickable {  }){
                    Image(painter = painterResource(id = R.drawable.blogs), contentDescription = null,
                        modifier = Modifier.size(60.dp))
                    Text(text = "Blogs")
                }
                Column(modifier = Modifier
                    .clickable { }
                    .padding(end = 20.dp)){
                    Image(painter = painterResource(id = R.drawable.jobs), contentDescription = null,
                        modifier = Modifier.size(60.dp))
                    Text(text = "Jobs")
                }



            }

            }

        }

    }





@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
