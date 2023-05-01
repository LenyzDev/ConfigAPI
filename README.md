# ConfigAPI
Use this API to manage your YAML files easily, with loads of reload functions and much more.

### How to use Configuration Loading:
```Java
public static void loadConfig() {
    FileConfiguration config = getConfig("config");

    // Example Usage
    ConfigLoaded.put("message.example", new Infos(config.getString("message.example")));
    System.out.print("Example get usage: " + ConfigLoaded.get("message.example").getString());
}
```

These are the natively supported data types:
* String
* String List
* Integer
* Double
* Float
* Long
* Boolean

But if you need to use another type of data, you can easily add it to our API and adapt it for whatever use you need.

To add information in the API just use:
```Java
// ARGUMENT 1 = Path to the information in the YAML file
// Example: message.example
//
// ARGUMENT 2 = Name of the YAML file you want to use
// Example: config
// Obs it is possible to use other files by creating new FileConfigurations

FileConfiguration config = getConfig("ARGUMENT 2");
ConfigLoaded.put("ARGUMENT 1", new Infos(config.getString("ARGUMENT 1")));
```

### How to get Configuration Information:
```Java
String message_example = ConfigAPI.get("message.example").getString();
Integer integer_example = ConfigAPI.get("integer.example").getNumber_int();
StringList stringList_example = ConfigAPI.get("stringList.example").getStringlist();
```
