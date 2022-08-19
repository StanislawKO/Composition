package com.codexample.composition.domain.entity

import java.io.Serializable

data class GameSettings (

    val maxSumCount: Int,
    val minCountOfRightAnswer: Int,
    val minPercentOfRightAnswer: Int,
    val gameTimeInSeconds: Int
): Serializable