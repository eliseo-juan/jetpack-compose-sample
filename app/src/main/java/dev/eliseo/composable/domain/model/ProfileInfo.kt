package dev.eliseo.composable.domain.model

data class ProfileInfo(
        val name: String,
        val jobTitle: String?,
        val imageResource: Int,
        val socialNetworks: List<SocialNetwork>
)