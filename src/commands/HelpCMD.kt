package commands

import com.github.johnnyjayjay.discord.commandapi.CommandEvent
import com.github.johnnyjayjay.discord.commandapi.ICommand
import help.Help
import net.dv8tion.jda.core.EmbedBuilder
import net.dv8tion.jda.core.entities.Member
import net.dv8tion.jda.core.entities.TextChannel
import java.awt.Color

class HelpCMD : ICommand{

    override fun onCommand(event: CommandEvent, member: Member, channel: TextChannel, args: Array<out String>) {
        if(args.isEmpty()){

            val help = Help()

            //val eb = EmbedBuilder().setAuthor("Help Page <1/1>").setDescription("Here you will get a list of all commands!").setFooter("God of this Bot is Marcel#6612", null).setColor(Color.GREEN)
            //event.channel.sendMessage(eb.build()).queue()
            help.show(event.channel)
        }


    }

}
