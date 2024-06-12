package com.example.asmgkotlin


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.asmgkotlin.component.CustomButton
@ExperimentalMaterial3Api
@Composable
fun LoginScreen(
    navController: NavHostController
) {
    // State for username and password input
    var Email by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    val context = LocalContext.current

    // Main content
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // Logo
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground), // Thay đổi bằng logo của bạn
                contentDescription = "Logo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally) // Căn giữa theo chiều ngang
                    .padding(top = 16.dp) // Thêm khoảng cách phía trên
            )


            // Welcome text
            Text(
                text = "Hello !",
                color = Color.DarkGray,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "WELCOME BACK",
                color = Color.Black,
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )// Card for input fields
            Card(
                shape = RoundedCornerShape(8.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Username input
                    OutlinedTextField(
                        value = Email,
                        onValueChange = { Email = it },
                        label = { Text("Email") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)

                    )

                    // Password input
                    OutlinedTextField(
                        value = Password,
                        onValueChange = { Password = it },
                        label = { Text("Password") },
                        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            val image = if (passwordVisible)
                                painterResource(id = com.google.android.material.R.drawable.design_ic_visibility) // Icon for visible password
                            else
                                painterResource(id = com.google.android.material.R.drawable.design_ic_visibility_off) // Icon for hidden password

                            Icon(
                                painter = image,
                                contentDescription = "Toggle Password Visibility",
                                modifier = Modifier.clickable { passwordVisible = !passwordVisible }
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    )

                    // Sign in button
                    Text(
                        text = "Forgot Password",
                        color = Color.Black,
                        modifier = Modifier
                            .clickable {
                                // Hành động khi nhấn vào Text
                                // Chuyển đến màn hình quên mật khẩu
                                navController.navigate("singln")
                            }
                            .padding(top = 16.dp)

                    )
                    // Sign in button
                    CustomButton(
                        onClick = {
                            navController.navigate("appNavigation")
                                  },
                        text = "Log in",
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    // Sign in button
                    Text(
                        text = "SIGN UP",
                        color = Color.Black,
                        modifier = Modifier
                            .clickable {
                                // Hành động khi nhấn vào Text
                                // Chuyển đến màn hình quên mật khẩu
                                navController.navigate("singln")
                            }
                            .padding(top = 16.dp)

                    )
                }
            }
        }
    }
}