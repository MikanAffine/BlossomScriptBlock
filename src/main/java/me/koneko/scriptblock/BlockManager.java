package me.koneko.scriptblock;

import java.util.*;
import java.io.*;

import org.bukkit.*;

import me.koneko.util.*;
import static me.koneko.util.Constants.*;

public final class BlockManager {

  private static final HashMap<String, String> blockStore = new HashMap<>();

  public static final String blockMark(Location loc, int type){
    return loc.getWorld().getName() + loc.getBlockX() + "#" + loc.getBlockY() + "#" + loc.getBlockZ() + "#" + type;
  }

  public static final void bind(Location loc, int type, String name){
    blockStore.put(blockMark(loc, type), name);
  }

  public static final void unbind(Location loc){
    blockStore.remove(blockMark(loc, 0));
    blockStore.remove(blockMark(loc, 1));
    blockStore.remove(blockMark(loc, 2));
    blockStore.remove(blockMark(loc, 3));
  }

  public static final String get(Location loc, int type){
    return blockStore.get(blockMark(loc, type));
  }

  public static final void load(){
    blockStore.clear();
    Arrays.stream(FileUtils.readAsStringArray(new File(dataFolder, "block.db"))).forEach(s -> {
      String[] a = s.split(":");
      blockStore.put(a[0], a[1]);
    });
  }

  public static final void save(){
    try{
      BufferedWriter bw = new BufferedWriter(new FileWriter(new File(dataFolder, "block.db")));
      blockStore.forEach((k, v) -> {
        try{
          bw.write(k);
          bw.write(':');
          bw.write(v);
          bw.newLine();
        }catch(Exception e){
          e.printStackTrace();
        }
      });
      bw.flush();
      bw.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }


}
