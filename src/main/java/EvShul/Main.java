package EvShul;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        NoteBook commands = new NoteBook();
        Shell shell = ShellFactory.createConsoleShell(
            "cmd",
            "Notebook",
            commands) ;
        shell.commandLoop();
    }


    }
