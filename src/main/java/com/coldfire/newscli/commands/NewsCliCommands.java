package com.coldfire.newscli.commands;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class NewsCliCommands implements CommandMarker {

    @CliCommand(value = {"echo"})
    public String echo() {
        return "Hello";
    }

}
