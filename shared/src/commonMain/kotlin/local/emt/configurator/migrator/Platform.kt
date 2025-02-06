package local.emt.configurator.migrator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform