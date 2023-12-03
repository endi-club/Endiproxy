package club.endi.endiproxy

import com.velocitypowered.api.command.SimpleCommand
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import java.util.concurrent.CompletableFuture

class StaffChat : SimpleCommand {
    override fun execute(invocation: SimpleCommand.Invocation) {
        val source = invocation.source()
        // Get the arguments after the command alias
        val args = invocation.arguments()
        source.sendMessage(Component.text("Hello World!").color(NamedTextColor.AQUA))
    }

    // This method allows you to control who can execute the command.
    // If the executor does not have the required permission,
    // the execution of the command and the control of its autocompletion
    // will be sent directly to the server on which the sender is located
    override fun hasPermission(invocation: SimpleCommand.Invocation): Boolean {
        return invocation.source().hasPermission("endi.staffchat")
    }

    override fun suggest(invocation: SimpleCommand.Invocation): List<String> {
        return listOf()
    }

    override fun suggestAsync(invocation: SimpleCommand.Invocation): CompletableFuture<List<String>> {
        return CompletableFuture.completedFuture(listOf())
    }
}