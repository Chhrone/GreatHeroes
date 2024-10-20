package ray.kotlin.greatheroes.model

import ray.kotlin.greatheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameRes = R.string.salahuddin,
            descRes = R.string.salahuddin_desc,
            imageRes = R.drawable.salahuddin
        ),
        Hero(
            nameRes = R.string.baldwin,
            descRes = R.string.baldwin_desc,
            imageRes = R.drawable.king_baldwin_iv
        ),
        Hero(
            nameRes = R.string.caesar,
            descRes = R.string.caesar_desc,
            imageRes = R.drawable.julius_caesar
        ),
        Hero(
            nameRes = R.string.leonidas,
            descRes = R.string.leonidas_desc,
            imageRes = R.drawable.king_leonidas
        ),
        Hero(
            nameRes = R.string.barbarossa,
            descRes = R.string.barbarossa_desc,
            imageRes = R.drawable.the_barbarossa_bros
        ),
        Hero(
            nameRes = R.string.miyamoto,
            descRes = R.string.miyamoto_desc,
            imageRes = R.drawable.miyamoto_musashi
        ),
        Hero(
            nameRes = R.string.genghis,
            descRes = R.string.genghis_desc,
            imageRes = R.drawable.genghis_khan
        ),
        Hero(
            nameRes = R.string.alaric,
            descRes = R.string.alaric_desc,
            imageRes = R.drawable.alaric_the_visigoth
        )
    )
}