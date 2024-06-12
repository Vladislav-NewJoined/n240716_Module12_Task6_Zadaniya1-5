package task9_9_1.commands;

public class BotCommonCommands {
    @AppBotCommand(name = "/hello", description = "when request hello", showInHelp = true)
//    @task9_9_1.commands.AppBotCommand(name = "/hello", description = "when request hello", showInHelp = true)
    public String hello() {
        return "Hello, User";
    }

    @AppBotCommand(name = "/bye", description = "when request bye", showInHelp = true)
//    @task9_9_1.commands.AppBotCommand(name = "/bye", description = "when request bye", showInHelp = true)
    public String bye() {
        return "Good bye, User";
    }

    @AppBotCommand(name = "/help", description = "when request help", showInKeyboard = true)
    public String help() {
        return "HEEEELP";
    }
}
