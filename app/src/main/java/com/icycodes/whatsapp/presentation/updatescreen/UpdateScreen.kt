package com.icycodes.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
@Preview(showSystemUi = true)
fun UpdateScreen() {

    val scrollState = rememberScrollState()

    val sampleStatus = listOf(
        StatusData(R.drawable.boy, "raj_kumar_rao", "10.00"),
        StatusData(R.drawable.girl, "simran", "2.00"),
        StatusData(R.drawable.disha_patani, "Disha", "8.00"),
        StatusData(R.drawable.girl2, "neha", "1.00"),
    )

    val sampleChannels = listOf(
        ChannelsData(R.drawable.boy, "raj_updates", "my life"),
        ChannelsData(R.drawable.boy, "raj_updates", "my life"),
        ChannelsData(R.drawable.boy, "raj_updates", "my life"),
        ChannelsData(R.drawable.boy, "raj_updates", "my life")
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(65.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_photo_camera_24),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }, bottomBar = {
            BottomNavigation()
        },
        topBar = { TopBar("Updates", false) }
    ) { it ->
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Status",
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black
            )
            MyStatus()

            sampleStatus.forEach {
                StatusItem(it)
            }

            Spacer(Modifier.height(16.dp))

            HorizontalDivider(thickness = 2.dp)

            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            Column (modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "Stay updated on topics that matters to you. Find channels to follow below.",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                )

                Spacer(Modifier.height(20.dp))

                Text(
                    text = "Find channels to follow",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
                Spacer(Modifier.height(6.dp))

                sampleChannels.forEach {
                    ChannelItemDesign(it)
                }
        }
    }
}