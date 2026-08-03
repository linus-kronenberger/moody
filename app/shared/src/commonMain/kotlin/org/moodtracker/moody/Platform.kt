package org.moodtracker.moody

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform