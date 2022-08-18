package com.codexample.composition.domain.usecases

import com.codexample.composition.domain.entity.GameSettings
import com.codexample.composition.domain.entity.Level
import com.codexample.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGemSettings(level)
    }
}