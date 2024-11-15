package me.mykindos.betterpvp.clans.fields.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;

import javax.annotation.Nullable;

/**
 * Represents an ore in the Fields zone.
 */
@Data
@EqualsAndHashCode(of = {"world", "x", "y", "z"})
public class FieldsBlock {

    private final String world;
    private final int x;
    private final int y;
    private final int z;
    private final @Nullable BlockData data; // block data
    private long lastUsed; // when it was last mined, used for regeneration
    private boolean active; // if it is active or not

    public World getWorld() {
        return Bukkit.getWorld(world);
    }

    public Location getLocation() {
        return new Location(getWorld(), x, y, z);
    }

    public Block getBlock() {
        return getLocation().getBlock();
    }

    public BlockData getBlockData() {
        return data;
    }

}
