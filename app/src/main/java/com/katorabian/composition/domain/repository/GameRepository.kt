package com.katorabian.composition.domain.repository

import com.katorabian.composition.domain.entity.GameSettings
import com.katorabian.composition.domain.entity.Level
import com.katorabian.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}