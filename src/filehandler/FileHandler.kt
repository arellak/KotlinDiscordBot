package filehandler

import org.simpleyaml.configuration.file.YamlFile
import java.io.File

class FileHandler(path: String? = "config.yml") {

    private val file: YamlFile = YamlFile(File(path))

    init {
        if(!file.exists()) file.createNewFile(true)
        file.load()
    }

    fun write(path: String?, value: Any?){
        file.set(path, value)
        file.save()
    }

    fun getInt(path: String?): Int {
        return file.getInt(path)
    }

    fun getString(path: String?): String {
        return file.getString(path)
    }

    fun getStringList(path: String): List<String>{
        return file.getStringList(path)
    }

}
