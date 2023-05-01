
import com.sun.org.apache.xerces.internal.xs.StringList;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.HashMap;

public class ConfigAPI {

    //   _____ ____  _   _ ______ _____ _____             _____ _____
    //  / ____/ __ \| \ | |  ____|_   _/ ____|      /\   |  __ \_   _|
    // | |   | |  | |  \| | |__    | || |  __      /  \  | |__) || |
    // | |   | |  | | . ` |  __|   | || | |_ |    / /\ \ |  ___/ | |
    // | |___| |__| | |\  | |     _| || |__| |   / ____ \| |    _| |_
    //  \_____\____/|_| \_|_|    |_____\_____|  /_/    \_\_|   |_____|
    //

    private static HashMap<String, Infos> ConfigLoaded = new HashMap<>();

    //   _    _  _____         _____ ______
    // | |  | |/ ____|  /\   / ____|  ____|
    // | |  | | (___   /  \ | |  __| |__
    // | |  | |\___ \ / /\ \| | |_ |  __|
    // | |__| |____) / ____ \ |__| | |____
    //  \____/|_____/_/    \_\_____|______|

    public static void loadConfig() {
        FileConfiguration config = getConfig("config");

        // Example Usage
        ConfigLoaded.put("message.example", new Infos(config.getString("message.example")));
        System.out.print("Example get usage: " + ConfigLoaded.get("message.example").getString());

    }

    public static void reloadConfig() {
        ConfigLoaded.clear();
        loadConfig();
    }

    public static void createConfig(String file) {
        if (!(new File(Main.instance.getDataFolder(), String.valueOf(file) + ".yml")).exists())
            Main.instance.saveResource(String.valueOf(file) + ".yml", false);
    }

    public static FileConfiguration getConfig(String file) {
        File arquivo = new File(Main.instance.getDataFolder() + File.separator + file + ".yml");
        return (FileConfiguration) YamlConfiguration.loadConfiguration(arquivo);
    }

    //   _____ ______ _______ _______ ______ _____                _____ ______ _______ _______ ______ _____
    //  / ____|  ____|__   __|__   __|  ____|  __ \     ___      / ____|  ____|__   __|__   __|  ____|  __ \
    // | |  __| |__     | |     | |  | |__  | |__) |   ( _ )    | (___ | |__     | |     | |  | |__  | |__) |
    // | | |_ |  __|    | |     | |  |  __| |  _  /    / _ \/\   \___ \|  __|    | |     | |  |  __| |  _  /
    // | |__| | |____   | |     | |  | |____| | \ \   | (_>  <   ____) | |____   | |     | |  | |____| | \ \
    //  \_____|______|  |_|     |_|  |______|_|  \_\   \___/\/  |_____/|______|  |_|     |_|  |______|_|  \_\
    //

    public static Infos get(String id) {
        return ConfigLoaded.getOrDefault(id, null);
    }

    public static void put(String id, Infos infos) {
        ConfigLoaded.put(id, infos);
    }

    public static class Infos {
        private String string;
        private StringList stringlist;
        private Double number_double;
        private Integer number_int;
        private Float number_float;
        private Long number_long;
        private Boolean boolean_data;



        public Infos(String string){
            this.string = string;
        }
        public Infos(StringList stringlist){
            this.stringlist = stringlist;
        }
        public Infos(Double number_double){
            this.number_double = number_double;
        }
        public Infos(Integer number_int){
            this.number_int = number_int;
        }
        public Infos(Float number_float){
            this.number_float = number_float;
        }
        public Infos(Long number_long){
            this.number_long = number_long;
        }
        public Infos(Boolean boolean_data){
            this.boolean_data = boolean_data;
        }



        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public Double getNumber_double() {
            return number_double;
        }

        public void setNumber_double(Double number_double) {
            this.number_double = number_double;
        }

        public Integer getNumber_int() {
            return number_int;
        }

        public void setNumber_int(Integer number_int) {
            this.number_int = number_int;
        }

        public StringList getStringlist() {
            return stringlist;
        }

        public void setStringlist(StringList stringlist) {
            this.stringlist = stringlist;
        }

        public Float getNumber_float() {
            return number_float;
        }

        public void setNumber_float(Float number_float) {
            this.number_float = number_float;
        }

        public Long getNumber_long() {
            return number_long;
        }

        public void setNumber_long(Long number_long) {
            this.number_long = number_long;
        }

        public Boolean getBoolean_data() {
            return boolean_data;
        }

        public void setBoolean_data(Boolean boolean_data) {
            this.boolean_data = boolean_data;
        }
    }


}
