package merlin.ianusinc.ianusinchq;

import merlin.ianusinc.ianusinchq.blocks.CustomOre;
import merlin.ianusinc.ianusinchq.init.BlockInit;
import merlin.ianusinc.ianusinchq.init.ItemInit;
import merlin.ianusinc.ianusinchq.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.logging.Logger;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
@Mod(modid=Reference.MODID, name=Reference.NAME, version=Reference.VERSION)
public class IanusIncHq {

    public static Logger LOGGER = Logger.getLogger(Reference.MODID);

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Starting Preinitialization...");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        LOGGER.info("Starting Initialization...");
        proxy.init(event);
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        LOGGER.info("Starting PostInitialization...");
        proxy.postInit(event);

    }



}

