package dev.eliseo.composable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.ui.core.*
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBackground
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import dev.eliseo.composable.domain.model.ProfileInfo
import dev.eliseo.composable.domain.model.SocialNetwork
import dev.eliseo.composable.ui.ComposableTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val profileInfo = ProfileInfo("Eliseo Juan Quintanilla", "Android Developer", R.drawable.image_profile)
        setContent {
            ComposableTheme {
                profileCard(profileInfo)
            }
        }
    }
}

@Composable
fun screen(profileInfo: ProfileInfo) {
    profileCard(profileInfo)
}

@Composable
fun profileCard(profileInfo: ProfileInfo) {
    Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.padding(16.dp).fillMaxWidth()
    ) {
        Column(
                horizontalGravity = Alignment.Start) {
            Image(asset = imageResource(id = R.drawable.image_profile),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1f)
                            .clipToBounds()
            )

            Text(text = profileInfo.name,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier
                            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )

            profileInfo.jobTitle?.let {
                Text(text = it,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier
                                .padding(bottom = 16.dp, start = 16.dp, end = 16.dp)
                )
            }

            Divider()

            Text(text = profileInfo.name,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier
                            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            )
        }
    }
}

@Composable
fun socialNetworkList(socialNetworkList: List<SocialNetwork>) {

}

@Composable
fun socialNetworkListItem(socialNetworks: SocialNetwork) {
    ConstraintLayout(constraintSet = ConstraintSet {

    }) {

    }

}