package help

import net.dv8tion.jda.core.entities.TextChannel
import java.awt.Color

class Help {

    var site: Site = Site()

    fun show(channel: TextChannel){

        var id = ""

        if(site.currentSite == 1){

            site.createSite("Help Page <1/2>", "First page", Color.GREEN)

            channel.sendMessage(site.getSite().build()).queue{
                it.addReaction("⬅").queue()
                it.addReaction("➡").queue()
            }

            id = channel.latestMessageId

        } else {

            site.createSite("Help Page <2/2>", "Second page", Color.GREEN)
            channel.getMessageById(id).queue{

                it.editMessage(site.getSite().build())

            }
        }

    }

}
