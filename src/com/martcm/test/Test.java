package com.martcm.test;

import com.martcm.test.events.TestEvents;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new TestEvents(), this);
    }

}
