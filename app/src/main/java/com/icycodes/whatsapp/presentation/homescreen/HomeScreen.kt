package com.icycodes.whatsapp.presentation.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.icycodes.whatsapp.R
import com.icycodes.whatsapp.presentation.bottomnavigation.BottomNavigation
import com.icycodes.whatsapp.presentation.chat_box.ChatDesignModel

@Composable
@Preview(showSystemUi = true)
fun HomeScreen() {

    val chatData = listOf(
        ChatDesignModel(R.drawable.rajkummar_rao, "raj_kumar_rao", "10.00", "Hi"),
        ChatDesignModel(R.drawable.ajay_devgn, "ajay_devgan", "11.00", "Hey"),
        ChatDesignModel(R.drawable.akshay_kumar, "akshay", "11.00", "Hey"),
        ChatDesignModel(R.drawable.bhuvan_bam, "buhavan", "11.00", "Hey"),
        ChatDesignModel(R.drawable.boy, "boy", "11.00", "Hey"),
        ChatDesignModel(R.drawable.boy1, "boy1", "11.00", "Hey"),
        ChatDesignModel(R.drawable.boy3, "boy3", "11.00", "Hey"),
        ChatDesignModel(R.drawable.carryminati, "carry", "11.00", "Hey"),
        ChatDesignModel(R.drawable.disha_patani, "ajay_devgan", "11.00", "Hey"),
        ChatDesignModel(R.drawable.girl, "ajay_devgan", "11.00", "Hey"),
        ChatDesignModel(R.drawable.kartik_aaryan, "ajay_devgan", "11.00", "Hey"),
        ChatDesignModel(R.drawable.girl, "ajay_devgan", "11.00", "Hey"),
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }
        },
        bottomBar = { BottomNavigation() }
    ) {
        Column(modifier = Modifier.padding(it)) {

            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    "WhatsApp",
                    fontSize = 28.sp,
                    color = colorResource(R.color.light_green),
                    modifier = Modifier
                        .align(
                            Alignment.CenterStart
                        )
                        .padding(start = 16.dp), fontWeight = FontWeight.Bold
                )
                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
            HorizontalDivider()

            LazyColumn {
                items(chatData) {
                    ChatDesign(chatDesignModel = it)
                }
            }

        }
    }
}