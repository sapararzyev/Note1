plugins {
    id (Plugins.AGP.application )version Versions.AGP apply false
    id (Plugins.AGP.library) version Versions.library apply false
    id (Plugins.Kotlin.android) version Versions.android apply false
    id( Plugins.DaggerHilt.hilt) version Versions.hilt apply false
    id( Plugins.Kotlin.jvm) version Versions.android apply false
}