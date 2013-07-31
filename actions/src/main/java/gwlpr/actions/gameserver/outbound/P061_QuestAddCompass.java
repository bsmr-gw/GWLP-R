
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.utils.Vector2;
import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P061_QuestAddCompass
    extends GenericAction
{

    private long iD;
    private Vector2 position;
    private int unknown1;
    private int unknown2;
    private long unknown3;
    private String category;
    private String name;
    private String givenBy;
    private int mapID;

    public short getHeader() {
        return  61;
    }

    public void setID(long iD) {
        this.iD = iD;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(long unknown3) {
        this.unknown3 = unknown3;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGivenBy(String givenBy) {
        this.givenBy = givenBy;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

}