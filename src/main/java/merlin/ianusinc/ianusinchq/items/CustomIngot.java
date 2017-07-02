package merlin.ianusinc.ianusinchq.items;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class CustomIngot extends net.minecraft.item.Item {

    public CustomIngot(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
    }
}
