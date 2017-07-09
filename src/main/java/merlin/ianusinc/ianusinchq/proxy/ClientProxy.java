package merlin.ianusinc.ianusinchq.proxy;

import merlin.ianusinc.ianusinchq.IanusIncHq;
import merlin.ianusinc.ianusinchq.Reference;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event){

        super.preInit(event);

        IanusIncHq.LOGGER.log(Level.INFO,"Adding "+Reference.MODID+" to OBJLoader Instance");
        OBJLoader.INSTANCE.addDomain(Reference.MODID);

    }

    public void init(FMLInitializationEvent event){
        super.init(event);
    }

    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }
}
