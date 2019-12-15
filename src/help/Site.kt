package help

import net.dv8tion.jda.core.EmbedBuilder
import java.awt.Color

class Site {

    var currentSite = 1

    private val eb:EmbedBuilder = EmbedBuilder()

    fun getSite(): EmbedBuilder {
        return eb
    }

    fun createSite(author: String, description: String, color: Color){
        eb.setAuthor(author)
        eb.setDescription(description)
        eb.setColor(color)
        eb.setFooter("Help Page", null)
    }

    fun nextSite(){
        currentSite++
    }

    fun prevSite(){
        currentSite--
    }

}
