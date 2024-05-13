package com.example.infinitelearnapp.navigation_buttomnav.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.infinitelearnapp.R

@Composable
fun ProfileScreen(){
        Column(modifier = Modifier.fillMaxSize()){
            TopAppBar(text = "Tentangku")
            Spacer(modifier = Modifier.height(16.dp) )
            Image(
                modifier = Modifier
                    .size(width = 100.dp, height = 150.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.fotodiri),
                contentDescription = "Hafizha Nur Azizah",
                contentScale = ContentScale.Crop,)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                text = "Hafizha Nur Azizah",
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                text = "hafizhanur21@gmail.com",
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                text = "Universitas Gunadarma",
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                text = "Sistem Informasi",
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp,
                lineHeight = 36.sp,
                textAlign = TextAlign.Center,
                color = Color.Gray
            )
        }
    }
@Preview(showBackground = true)
@Composable
fun MyProfilePreview() {
       ProfileScreen()
    }
