package merlin.ianusinc.ianusinchq.blocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Seine Eiligkeit on 01.07.2017.
 */
public class CustomNugget extends Item {

    public CustomNugget(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
    }
}
