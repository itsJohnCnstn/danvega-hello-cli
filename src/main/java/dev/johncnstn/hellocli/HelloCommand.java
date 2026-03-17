package dev.johncnstn.hellocli;

import org.springframework.shell.core.command.annotation.Command;
import org.springframework.shell.core.command.annotation.Option;
import org.springframework.stereotype.Component;

@Component
class HelloCommand {

    @Command(name = "hello", description = "Say hello to a given name", group = "Greetings",
            help = "A command that greets the user with 'Hello ${name}!'. Usage: hello [-n | --name]=<name>")
    void sayHello(@Option(shortName = 'n', longName = "name", description = "the name of the person to greet",
            defaultValue = "World") String name) {
        System.out.println("Hello " + name + "!");
    }

}
