package com.katorabian.composition.domain.usecases

import com.katorabian.composition.domain.entity.GameSettings
import com.katorabian.composition.domain.entity.Level
import com.katorabian.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}