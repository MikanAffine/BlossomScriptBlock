package me.koneko.scriptblock;

import org.bukkit.event.*;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.EquipmentSlot;

public class BlockInteractListener implements Listener {
  
  public static final int LEFT_CLICK = 0;
  public static final int RIGHT_CLICK = 1;
  public static final int WALK = 2;
  public static final int BREAK = 3;
  
  @EventHandler(priority = EventPriority.LOWEST)
  public void onInteract(PlayerInteractEvent e) {
    switch(e.getAction()) {
      case LEFT_CLICK_BLOCK:
        if(e.getHand() != EquipmentSlot.HAND) {
          return;
        }
        ScriptTrigger.trigger(LEFT_CLICK, e.getClickedBlock().getLocation(), e.getPlayer());
        break;
      case RIGHT_CLICK_BLOCK:
        if(e.getHand() != EquipmentSlot.HAND) {
          return;
        }
        ScriptTrigger.trigger(RIGHT_CLICK, e.getClickedBlock().getLocation(), e.getPlayer());
        break;
      default:
    }
  }
  
  @EventHandler(priority = EventPriority.LOWEST)
  public void onWalk(PlayerMoveEvent e) {
    ScriptTrigger.trigger(WALK, e.getTo().clone().subtract(0d, 1d, 0d), e.getPlayer());
  }
  
  @EventHandler(priority = EventPriority.LOWEST)
  public void onBreak(BlockBreakEvent e) {
    ScriptTrigger.trigger(BREAK, e.getBlock().getLocation(), e.getPlayer());
  }
  
}
