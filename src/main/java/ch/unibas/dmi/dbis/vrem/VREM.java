package ch.unibas.dmi.dbis.vrem;

import ch.unibas.dmi.dbis.vrem.importer.ExhibitionImporter;
import ch.unibas.dmi.dbis.vrem.server.WebServer;
import com.github.rvesse.airline.annotations.Cli;
import com.github.rvesse.airline.help.Help;

@Cli(name = "VREM", description = "Virtual Reality Exhibition Manager", commands = {WebServer.class, ExhibitionImporter.class, Help.class}, defaultCommand = Help.class)
public class VREM {

    /**
     *
     */
    public static void main(String[] args) {
        new com.github.rvesse.airline.Cli<Runnable>(VREM.class).parse(args).run();
    }
}
