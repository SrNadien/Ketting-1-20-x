/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_20_R1.block.impl;

import org.bukkit.craftbukkit.v1_20_R1.block.data.CraftBlockData;

public final class CraftJigsaw extends CraftBlockData implements org.bukkit.block.data.type.Jigsaw {

    public CraftJigsaw() {
        super();
    }

    public CraftJigsaw(net.minecraft.world.level.block.state.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.block.data.type.CraftJigsaw

    private static final net.minecraft.world.level.block.state.properties.EnumProperty<?> ORIENTATION = getEnum(net.minecraft.world.level.block.JigsawBlock.class, "orientation");

    @Override
    public org.bukkit.block.data.type.Jigsaw.Orientation getOrientation() {
        return get(ORIENTATION, org.bukkit.block.data.type.Jigsaw.Orientation.class);
    }

    @Override
    public void setOrientation(org.bukkit.block.data.type.Jigsaw.Orientation orientation) {
        set(ORIENTATION, orientation);
    }
}
