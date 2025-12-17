package com.icycodes.whatsapp.presentation.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.icycodes.whatsapp.R
import com.icycodes.whatsapp.presentation.bottomnavigation.BottomNavigation
import com.icycodes.whatsapp.presentation.chat_box.ChatDesignModel
import com.icycodes.whatsapp.presentation.updatescreen.TopBar

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
            TopBar("WhatsApp",true)

            LazyColumn {
                items(chatData) {
                    ChatDesign(chatDesignModel = it)
                }
            }

        }
    }
}