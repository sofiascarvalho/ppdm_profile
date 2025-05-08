package br.senai.sp.jandira.projectprofile.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
                .background(Color.White)
        ){
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(290.dp),
                shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
            ){
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    Image(
                        painter = painterResource(
                            R.drawable.background_image
                        ),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Row (
                            modifier = Modifier.fillMaxWidth()
                        ){
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )
                            Text(text = "Details",
                                modifier = Modifier.padding(start = 150.dp, top = 4.dp),
                                color = Color.White)
                        }


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
                        Text(text = "Lauren Swan",
                            color = Color.White,
                            fontWeight = FontWeight.Bold)

                        Text(text = "UI/UX Designer",
                            color = Color.LightGray)

                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 20.dp, start = 10.dp, end = 10.dp, bottom = 20.dp)
                                .height(60.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ){
                            Card (
                                modifier = Modifier.fillMaxHeight().width(80.dp)
                                    .border(2.dp, Color.LightGray, shape = RoundedCornerShape(4.dp)),
                                shape = RoundedCornerShape(4.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ){
                                    Icon(imageVector = Icons.Default.Email,
                                        contentDescription = "",
                                        tint = Color.LightGray)
                                    Text(text = "Email")
                                }
                            }
                            Card (
                                modifier = Modifier.fillMaxHeight().width(80.dp)
                                    .border(2.dp, Color.LightGray, shape = RoundedCornerShape(4.dp)),
                                shape = RoundedCornerShape(4.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ){
                                    Icon(imageVector = Icons.Default.Email,
                                        contentDescription = "",
                                        tint = Color.LightGray)
                                    Text(text = "Email")
                                }
                            }
                            Card (
                                modifier = Modifier.fillMaxHeight().width(80.dp)
                                    .border(2.dp, Color.LightGray, shape = RoundedCornerShape(4.dp)),
                                shape = RoundedCornerShape(4.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ){
                                    Icon(imageVector = Icons.Default.Email,
                                        contentDescription = "",
                                        tint = Color.LightGray)
                                    Text(text = "Email")
                                }
                            }
                            Card (
                                modifier = Modifier.fillMaxHeight().width(80.dp)
                                    .border(1.dp, Color.LightGray, shape = RoundedCornerShape(4.dp)),
                                shape = RoundedCornerShape(4.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                )
                            ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ){
                                    Icon(imageVector = Icons.Default.Email,
                                        contentDescription = "",
                                        tint = Color.LightGray)
                                    Text(text = "Email")
                                }
                            }
                        }
                    }
                }
            }
            Column (
                modifier = Modifier.padding(start = 20.dp)
            ){
                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color(0xE4673AB7)
                    )
                    Text(text = "Email")
                }
                Column (
                    modifier = Modifier.padding(start = 23.dp)
                ){
                    Text(text = "Official")
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(text = "lauren.swan@example.com")
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(text = "Personal")
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(text = "lauren@example.com")
                }

                Spacer(modifier = Modifier.height(15.dp))

                Divider(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .height(1.dp)
                        .width(370.dp),
                    color = Color(0xffFFC23D)
                )

                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color(0xE4673AB7)
                    )
                    Text(text = "Phone number")
                }
                Text(text = "Official")
                Text(text = "lauren.swan@example.com")
                Text(text = "Personal")
                Text(text = "lauren@example.com")

                Spacer(modifier = Modifier.height(15.dp))

                Divider(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .height(1.dp)
                        .width(370.dp),
                    color = Color(0xffFFC23D)
                )

                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color(0xE4673AB7)
                    )
                    Text(text = "Team")
                }
                Text(text = "Official")
                Text(text = "lauren.swan@example.com")
                Text(text = "Personal")
                Text(text = "lauren@example.com")

                Spacer(modifier = Modifier.height(15.dp))

                Divider(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .height(1.dp)
                        .width(370.dp),
                    color = Color(0xffFFC23D)
                )

                Spacer(modifier = Modifier.height(15.dp))

                Row {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color(0xE4673AB7)
                    )
                    Text(text = "Leads by")
                }
                Text(text = "Official")
                Text(text = "lauren.swan@example.com")
                Text(text = "Personal")
                Text(text = "lauren@example.com")

                Spacer(modifier = Modifier.height(15.dp))

                Divider(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .height(1.dp)
                        .width(370.dp),
                    color = Color(0xffFFC23D)
                )

                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}
    /*{
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.Start
        ){
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                shape = RoundedCornerShape(
                    bottomEnd = 20.dp,
                    bottomStart = 20.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xff4B0082)
                )
            ){

            }
            Icon(imageVector = Icons.Default.Email,
                contentDescription = "",
                tint = Color.Cyan)
        }
    }*/

@Preview
@Composable
private fun ScreenProfilePreview() {
    ScreenProfile()
}