package com.ttmobilpos.profilecardb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ttmobilpos.profilecardb.ui.theme.ProfileCardBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }

}

@Composable
fun MainScreen (){
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.LightGray
    ){
        ProfileCard()
    }
}

@Composable
fun ProfileCard(){
   Card(
       modifier = Modifier
           .fillMaxSize()
           .wrapContentHeight(align = Alignment.Top),
       elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
   ) {
       Row (
           modifier =  Modifier.wrapContentSize(),
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.SpaceAround
       ){
           ProfilePicture()
           ProfileContent()
       }

   }
}

@Composable
fun ProfilePicture (){
    Card(shape = CircleShape,
    border = BorderStroke(width = 2.dp, color = Color.Green),
     modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(4.dp)


    ) {
        Image(
            painterResource(R.drawable.photo),
            contentDescription = "",
            modifier = Modifier.size(72.dp),
            contentScale = ContentScale.Crop
        )}
    }



@Composable
fun ProfileContent(){
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(80.dp),
    ) {
        Text("Cem TAŞKIN", style = MaterialTheme.typography.labelLarge)
        Text("Active Now", modifier=Modifier.alpha(0.3f), style = MaterialTheme.typography.labelSmall)
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
   MainScreen()
}