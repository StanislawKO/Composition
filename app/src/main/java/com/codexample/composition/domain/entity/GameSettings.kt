package com.codexample.composition.domain.entity

data class GameSettings (

    val maxSumCount: Int,
    val minCountOfRightAnswer: Int,
    val minPercentOfRightAnswer: Int,
    val gameTimeInSeconds: Int
)