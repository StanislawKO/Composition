package com.codexample.composition.domain.repository

import com.codexample.composition.domain.entity.GameSettings
import com.codexample.composition.domain.entity.Level
import com.codexample.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGemSettings(level: Level): GameSettings
}