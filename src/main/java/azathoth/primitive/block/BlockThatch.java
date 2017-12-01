package azathoth.primitive.block;

import azathoth.primitive.Primitive;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockThatch extends Block {
	public BlockThatch() {
		super(Material.plants);
		this.setStepSound(soundTypeGrass);
		this.setBlockName("Thatch");
		this.setBlockTextureName(Primitive.MODID + ":thatch");
	}
}