package br.senai.sp.jandira.projectprofile.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.projectprofile.R

@Composable
fun ScreenProfile(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.Start
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Magenta),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Details")
                Card (
                    modifier = Modifier
                        .size(100.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFAEFCDEE)
                    )
                ){
                    Image(
                        painter = painterResource(
                            R.drawable.icon_profile
                        ),
                        contentDescription = ""
                    )
                }
            }
            Icon(imageVector = Icons.Default.Email,
                contentDescription = "",
                tint = Color.Cyan)
        }
    }
}

@Preview
@Composable
private fun ScreenProfilePreview() {
    ScreenProfile()
}