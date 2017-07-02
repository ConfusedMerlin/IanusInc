package merlin.ianusinc.ianusinchq.init;

import merlin.ianusinc.ianusinchq.IanusIncHq;
import merlin.ianusinc.ianusinchq.Reference;
import merlin.ianusinc.ianusinchq.blocks.CustomOre;
import merlin.ianusinc.ianusinchq.blocks.IanusIncTurret;
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
public class BlockInit {

    public static Block tutorial_ore;
    public static Block ianus_inc_turret;
    public static ArrayList<Block> blockList = new ArrayList<>();

    public static void prepareBlocks(){
        IanusIncHq.LOGGER.info("Block Preparation starts now");

        tutorial_ore = new CustomOre("tutorial_ore",2.0F,4.0F,2);
        ianus_inc_turret = new IanusIncTurret("ianus_inc_turret",4.0F,4.0F,2);

        ItemInit.addItemBlockToItems(tutorial_ore);
        ItemInit.addItemBlockToItems(ianus_inc_turret);

        blockList.add(tutorial_ore);
        blockList.add(ianus_inc_turret);
    }

    public static void registerBlocks(RegistryEvent.Register<Block> event){
        IanusIncHq.LOGGER.info("Block Registration starts now");
        for(Block block : blockList){
            IanusIncHq.LOGGER.info("Going to register: " + block.getUnlocalizedName() +"...");
            event.getRegistry().register(block);

        }
        IanusIncHq.LOGGER.info("Done Item registration...");
        }

    }