package org.moody.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform