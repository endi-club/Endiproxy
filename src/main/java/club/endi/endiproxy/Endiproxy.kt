package club.endi.endiproxy

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import org.slf4j.Logger

@Plugin(id = "endiproxy", name = "endiproxy", version = "1.0-SNAPSHOT")
class Endiproxy {
    @Inject
    private val logger: Logger? = null
    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent?) {
    }
}
