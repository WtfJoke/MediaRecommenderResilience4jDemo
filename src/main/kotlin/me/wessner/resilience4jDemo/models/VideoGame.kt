package me.wessner.resilience4jDemo.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class VideoGame(@Id var id: String, val title: String, val ageRestriction: Int){
    constructor(existingGame: VideoGame) : this(UUID.randomUUID().toString(), existingGame.title, existingGame.ageRestriction)
}