package merlin.ianusinc.ianusinchq;

import merlin.ianusinc.ianusinchq.init.BlockInit;
import merlin.ianusinc.ianusinchq.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Seine Eiligkeit on 30.06.2017.
 */

@Mod.EventBusSubscriber
public class RegisterUtil {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){

        BlockInit.prepareBlocks();
        BlockInit.registerBlocks(event);
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        ItemInit.prepareItems();
        ItemInit.registerItems(event);
    }


}
