package com.example.asmgkotlin


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun SignInScreenn(
    navController: NavHostController
) {
    // State for username and password input
    var username by remember { mutableStateOf("") }
    var Name by remember { mutableStateOf("") }
    var Email by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var ConfirmPassword by remember { mutableStateOf("") }
    var ConfirmPasswordVisible by remember { mutableStateOf(false) }
    val context = LocalContext.current

    // Main content
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,/-strong/-heart:>:o:-((:-hmodifier = Modifier.padding(16.dp)
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

            Text(
                text = "WELCOME",
                color = Color.Black,
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
            // Card for input fields
            Card(
                shape = RoundedCornerShape(8.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Name input
                    OutlinedTextField(
                        value = Name,
                        onValueChange = { Name = it },
                        label = { Text("Name") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)

                    )

                    // Email input
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

//                            Icon(
//                                painter = image,/-strong/-heart:>:o:-((:-hcontentDescription = "Toggle Password Visibility",
//                            modifier = Modifier.clickable { passwordVisible = !passwordVisible }
//                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    )
                    // Confirm Password input
                    OutlinedTextField(
                        value = ConfirmPassword,
                        onValueChange = { ConfirmPassword = it },
                        label = { Text("Confirm Password") },
                        visualTransformation = if (ConfirmPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            val image = if (ConfirmPasswordVisible)
                                painterResource(id = com.google.android.material.R.drawable.design_ic_visibility) // Icon for visible password
                            else
                                painterResource(id = com.google.android.material.R.drawable.design_ic_visibility_off) // Icon for hidden password

                            Icon(
                                painter = image,
                                contentDescription = "Toggle Password Visibility",
                                modifier = Modifier.clickable {
                                    ConfirmPasswordVisible = !ConfirmPasswordVisible
                                }
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    )
                    // Sign in button
                    CustomButton(
                        onClick = {

                        },
                        text = "SIGN UP",
                        modifier = Modifier.padding(top = 16.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Already have account?",
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier
                                .padding(8.dp)
                        )
                        Text(
                            text = "SIGN IN",
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier
                                .clickable {
                                    // Hành động khi nhấn vào Text
                                    // Chuyển đến màn hình quên mật khẩu
                                    navController.navigate("login")
                                }

                        )

                    }
                }
            }
        }
    }
}
