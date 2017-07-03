package merlin.ianusinc.ianusinchq.blocks;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncTextileConcrete extends CustomBlock
{
    public IanusIncTextileConcrete(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance);
        setHarvestLevel("pickaxe",harvestLevel);
        setCreativeTab(CreativeTabs.MISC);
    }
}
