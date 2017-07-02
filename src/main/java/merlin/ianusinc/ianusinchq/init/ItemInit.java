package merlin.ianusinc.ianusinchq.init;

import merlin.ianusinc.ianusinchq.IanusIncHq;
import merlin.ianusinc.ianusinchq.Reference;
import merlin.ianusinc.ianusinchq.blocks.CustomNugget;
import merlin.ianusinc.ianusinchq.items.CustomIngot;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class ItemInit {

    public static Item tutorial_ingot;
    public static Item tutorial_nugget;

    public static ArrayList<Item> itemList = new ArrayList<>();

    public static void prepareItems(){
        IanusIncHq.LOGGER.info("Item Preparation starts now");

        tutorial_ingot = new CustomIngot("tutorial_ingot");
        tutorial_nugget = new CustomNugget("tutorial_nugget");

        itemList.add(tutorial_nugget);
        itemList.add(tutorial_ingot);
    }
    public static void addItemBlockToItems(Block block){
        ItemBlock itemblock = new ItemBlock(block);
        itemblock.setRegistryName(block.getRegistryName());
        itemList.add(itemblock);
    }


    public static void registerItems(RegistryEvent.Register<Item> event){
        IanusIncHq.LOGGER.info("Item Registration starts now");
        for(Item item : itemList){
            IanusIncHq.LOGGER.info("Going to register: " + item.getUnlocalizedName() +"...");
            event.getRegistry().register(item);
            IanusIncHq.LOGGER.info("\t\tSet ModelResourceLocation to " + Reference.MODID + ":" + item.getRegistryName());
            ModelLoader.setCustomModelResourceLocation(
                    item,
                    0,
                    new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5))
            );
            IanusIncHq.LOGGER.info("Done registering: " + item.getUnlocalizedName() +"...");
        }
        IanusIncHq.LOGGER.info("Done Item registration...");
    }
}
