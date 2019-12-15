package main

import com.github.johnnyjayjay.discord.commandapi.CommandSettings
import commands.HelpCMD
import filehandler.FileHandler
import net.dv8tion.jda.core.AccountType
import net.dv8tion.jda.core.JDA
import net.dv8tion.jda.core.JDABuilder

val fh: FileHandler = FileHandler()

fun main(args: Array<String>){
    val jda = JDABuilder(AccountType.BOT).setToken(fh.getString("bot.token")).setAutoReconnect(true).build().awaitReady()
    registerCommands(jda)
}

fun registerCommands(jda: JDA){
    val settings = CommandSettings(fh.getString("bot.prefix"), jda, true)
    settings.put(HelpCMD(), "help")
    settings.activate()
}
