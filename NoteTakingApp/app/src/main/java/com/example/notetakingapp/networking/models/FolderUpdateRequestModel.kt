package com.example.notetakingapp.networking.models

import kotlinx.serialization.Serializable

@Serializable
data class FolderUpdateRequestModel(
    val id: Long,
    val title: String,
    val dateCreated: String,
    val dateModified: String,
    val dateDeleted: String,
)