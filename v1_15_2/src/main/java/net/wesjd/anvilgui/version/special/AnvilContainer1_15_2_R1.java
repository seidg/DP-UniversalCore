package net.wesjd.anvilgui.version.special;


import net.minecraft.server.v1_15_R1.*;
import org.bukkit.craftbukkit.v1_15_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class AnvilContainer1_15_2_R1 extends ContainerAnvil {
    public AnvilContainer1_15_2_R1(Player player, int containerId , String guiTitle) {
        super(containerId, ((CraftPlayer)player).getHandle().inventory,
                ContainerAccess.at(((CraftWorld)player.getWorld()).getHandle(), new BlockPosition(0, 0, 0)));
        this.checkReachable = false;
        setTitle(new ChatMessage(guiTitle));
    }

    @Override
    public void b(EntityHuman player) {}

    public int getContainerId() {
        return this.windowId;
    }
}