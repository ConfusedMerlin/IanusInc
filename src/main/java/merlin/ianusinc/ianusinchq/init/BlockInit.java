package merlin.ianusinc.ianusinchq.init;

import merlin.ianusinc.ianusinchq.IanusIncHq;
import merlin.ianusinc.ianusinchq.Reference;
import merlin.ianusinc.ianusinchq.blocks.*;
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
    public static Block ianus_inc_small_sup_con;
    public static Block ianus_inc_carbon_concrete;
    public static Block ianus_inc_textile_concrete;
    public static Block ianus_inc_high_voltage_coil;
    public static Block ianus_inc_sub_zero_super_cond;
    public static Block ianus_inc_quantum_magnet;
    public static Block ianus_inc_quantum_core;
    public static Block ianus_inc_holo_common_passable;
    public static Block ianus_inc_holo_common_unpassable;


    public static ArrayList<Block> blockList = new ArrayList<>();

    public static void prepareBlocks(){
        IanusIncHq.LOGGER.info("Block Preparation starts now");

        tutorial_ore = new CustomOre("tutorial_ore",2.0F,4.0F,2);
        ianus_inc_turret = new IanusIncTurret("ianus_inc_turret",4.0F,4.0F,2);
        ianus_inc_small_sup_con = new IanusIncSmallSuperCondensator("ianus_inc_small_sup_con",4F,4F, 2);
        ianus_inc_carbon_concrete = new IanusIncCarbonConcrete("ianus_inc_carbon_concrete",15F,5000F, 3);
        ianus_inc_textile_concrete = new IanusIncTextileConcrete("ianus_inc_textile_concrete",35F,11001F, 4);
        ianus_inc_high_voltage_coil = new IanusIncHighVoltageCoil("ianus_inc_high_voltage_coil",2F,500F, 2);
        ianus_inc_sub_zero_super_cond = new IanusIncSubZeroSuperCond("ianus_inc_sub_zero_super_cond",1F,5F, 2);
        ianus_inc_quantum_magnet = new IanusIncQuantumMagnet("ianus_inc_quantum_magnet",100F,25000F, 4);
        ianus_inc_quantum_core = new IanusIncQuantumCore("ianus_inc_quantum_core",100F,50000F, 4);
        ianus_inc_holo_common_passable = new IanusIncHolographicDemonstrator("ianus_inc_holo_common_passable",1F,100000F, 4);
        ianus_inc_holo_common_unpassable = new IanusIncHolographicBlocker("ianus_inc_holo_common_unpassable",1F,5, 1);

        ItemInit.addItemBlockToItems(tutorial_ore);
        ItemInit.addItemBlockToItems(ianus_inc_turret);
        ItemInit.addItemBlockToItems(ianus_inc_small_sup_con);
        ItemInit.addItemBlockToItems(ianus_inc_carbon_concrete);
        ItemInit.addItemBlockToItems(ianus_inc_textile_concrete);
        ItemInit.addItemBlockToItems(ianus_inc_high_voltage_coil);
        ItemInit.addItemBlockToItems(ianus_inc_sub_zero_super_cond);
        ItemInit.addItemBlockToItems(ianus_inc_quantum_magnet);
        ItemInit.addItemBlockToItems(ianus_inc_quantum_core);
        ItemInit.addItemBlockToItems(ianus_inc_holo_common_passable);
        ItemInit.addItemBlockToItems(ianus_inc_holo_common_unpassable);


        blockList.add(tutorial_ore);
        blockList.add(ianus_inc_turret);
        blockList.add(ianus_inc_small_sup_con);
        blockList.add(ianus_inc_carbon_concrete);
        blockList.add(ianus_inc_textile_concrete);
        blockList.add(ianus_inc_high_voltage_coil);
        blockList.add(ianus_inc_sub_zero_super_cond);
        blockList.add(ianus_inc_quantum_magnet);
        blockList.add(ianus_inc_quantum_core);
        blockList.add(ianus_inc_holo_common_passable);
        blockList.add(ianus_inc_holo_common_unpassable);
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