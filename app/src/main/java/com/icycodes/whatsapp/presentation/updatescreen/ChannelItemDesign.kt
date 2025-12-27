package com.icycodes.whatsapp.presentation.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.icycodes.whatsapp.R

@Composable
fun ChannelItemDesign(channelsData: ChannelsData) {


    var isFollowing by remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = channelsData.image),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(shape = RectangleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(Modifier.width(12.dp))
        Column {
            Text(
                text = channelsData.name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.Black
            )
            Spacer(Modifier.height(4.dp))
            Text(
                text = channelsData.headline,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray
            )
        }
        Spacer(Modifier.weight(1f))
        Button(
            onClick = { isFollowing = !isFollowing },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isFollowing) {
                    Color.Gray
                } else {
                    colorResource(R.color.light_green)
                }
            ), modifier = Modifier
                .padding(8.dp)
                .height(36.dp)
        ) {
            Text(
                text = if (isFollowing) {
                    "Following"
                } else {
                    "Follow"
                }, color = if (isFollowing){
                    Color.Black
                }
                else
                {
                    Color.White
                }, fontWeight = FontWeight.Bold
            )
        }
    }
}

data class ChannelsData(
    val image: Int,
    val name: String,
    val headline: String
)