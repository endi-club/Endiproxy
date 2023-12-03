package club.endi.endiproxy

import com.google.inject.Inject
import com.velocitypowered.api.command.CommandManager
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger


@Plugin(id = "endiproxy", name = "endiproxy", version = "1.0-SNAPSHOT")
class Endiproxy {
    private var proxy: ProxyServer? = null

    @Inject
    fun EndiPPlugin(proxy: ProxyServer?) {
        this.proxy = proxy
    }

    @Inject
    private val logger: Logger? = null

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent?) {
        val commandManager: CommandManager? = proxy?.commandManager
        val commandMeta = commandManager?.metaBuilder("staffchat")
            ?.aliases("sc", "s", "staffc")
            ?.plugin(this)
            ?.build()

        commandManager?.register(commandMeta, StaffChat())
    }
}
