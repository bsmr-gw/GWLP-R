
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P131_MissionMapIconColor
    extends GenericAction
{

    private long localID;
    private short color;

    public short getHeader() {
        return  131;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    public void setColor(short color) {
        this.color = color;
    }

}