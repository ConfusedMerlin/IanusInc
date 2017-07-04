package merlin.ianusinc.ianusinchq.blocks;

import merlin.ianusinc.ianusinchq.materials.IanusIncHolographicMaterial;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Seine Eiligkeit on 29.06.2017.
 */
public class IanusIncHolographicDemonstrator extends IanusIncCommonHolographicBlock implements IHoloBlock
{

    protected final Material blockMaterial = new IanusIncHolographicMaterial(MapColor.CYAN);

    public IanusIncHolographicDemonstrator(String name, float hardness, float resistance, int harvestLevel){
        super(name,hardness,resistance,harvestLevel);




    }

    @Override
    public int getFadeTime() {
        return 2;
    }
}
