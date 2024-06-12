package com.example.asmgkotlin

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import com.example.asmgkotlin.MainNavigation
import com.example.asmgkotlin.ui.theme.AsmgkotlinTheme
import com.example.asmgkotlin.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AsmgkotlinTheme{
                MainNavigation()
            }
        }
    }
}
//
//@Composable
//fun Greeting() {
//    val context = LocalContext.current
//
//    Box(
//        modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.backgroudasmgkt),
//            contentDescription = null,
//            modifier = Modifier.fillMaxSize(),
//            contentScale = ContentScale.Crop
//        )
//            Column(
//                modifier = Modifier.padding(16.dp)
//            ) {
//
//                // Welcome text
//                Text(
//                    text = "MAKE YOUR",
//                    color = Color.DarkGray,
//                    style = MaterialTheme.typography.headlineMedium,
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//                Text(
//                    text = "HOME BEAUTIFUL",
//                    color = Color.Black,
//                    style = MaterialTheme.typography.headlineMedium.copy(
//                        fontWeight = FontWeight.Bold,
//                        color = Color.Gray
//                    ),
//                    modifier = Modifier.padding(bottom = 16.dp)
//                )
//
//                // Card for input fields
//                Card(
//                    shape = RoundedCornerShape(8.dp),
//                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Column(
//                        modifier = Modifier.padding(16.dp),
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Text(
//                            text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
//                            color = Color.Black,
//                            style = MaterialTheme.typography.headlineMedium.copy(
//                                color = Color.Gray
//                            ),
//                            modifier = Modifier.padding(bottom = 16.dp)
//                        )
//                        CustomButton(
//                            onClick = {
//                                val intent = Intent(context, Sceen_Login::class.java)
//                                context.startActivity(intent)
//                            },
//                            text = "Get Started",
//                            modifier = Modifier.padding(top = 16.dp)
//                        )
//
//                    }
//                }
//            }
//



