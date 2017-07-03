package merlin.ianusinc.ianusinchq.materials;

import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by Seine Eiligkeit on 03.07.2017.
 */
public class IanusIncHolographicMaterial extends Material {



    public IanusIncHolographicMaterial(MapColor color){

        super(color);
        this.setReplaceable();
        this.setRequiresTool();

    }


    @Override
    public boolean isOpaque() {
        return false;
    }

    @Override
    public EnumPushReaction getMobilityFlag() {
        return EnumPushReaction.BLOCK;
    }

    @Override
    public boolean blocksMovement() {
        return false;
    }

    @Override
    public boolean blocksLight() {return false;  }

    @Override
    public boolean isSolid() { return false;   }


}
