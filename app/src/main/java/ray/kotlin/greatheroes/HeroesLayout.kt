package ray.kotlin.greatheroes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ray.kotlin.greatheroes.model.Hero


@Composable
fun HeroesList(
    heroes: List<Hero>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    LazyColumn(contentPadding = contentPadding) {
        items(heroes) {
            HeroItems(hero = it)
        }
    }
}

@Composable
fun HeroItems(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.padding( horizontal = 20.dp, vertical = 10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .sizeIn(minHeight = 72.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Column {
                Text(
                    text = stringResource(hero.nameRes),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(hero.descRes),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Box(modifier = Modifier
                .size(72.dp)
                .clip(RoundedCornerShape(15.dp)))
            {
                Image(
                    painter = painterResource(hero.imageRes),
                    contentDescription = null,
                    alignment = Alignment.TopCenter,
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewHeroesCard() {
    HeroItems(
        hero = Hero(
            R.string.salahuddin,
            R.string.salahuddin_desc,
            R.drawable.salahuddin
        )
    )
}