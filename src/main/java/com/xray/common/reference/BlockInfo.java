// This class (structure?) is for holding the blocks x,y,z and color to draw.
// This gets copied and accessed by RenderTick to draw the boxes around found ores/blocks.

package com.xray.common.reference;
import com.xray.common.reference.OreInfo;

public class BlockInfo
{
	public int x, y, z, oreID;
	public int[] color;
	public OreInfo ore;
	
	public BlockInfo( int bx, int by, int bz, int[] c, OreInfo bore)
	{
		this.x = bx;
		this.y = by;
		this.z = bz;
		this.color = c;
		this.ore = bore;
	}
}
