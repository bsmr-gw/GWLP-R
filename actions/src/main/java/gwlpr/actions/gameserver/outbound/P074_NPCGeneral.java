
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P074_NPCGeneral
    extends GenericAction
{

    private long localID;
    private long nPCFile;
    private long texture;
    private long scale;
    private long unknown1;
    private long flags;
    private short profession;
    private short level;
    private String name;

    public short getHeader() {
        return  74;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    public void setNPCFile(long nPCFile) {
        this.nPCFile = nPCFile;
    }

    public void setTexture(long texture) {
        this.texture = texture;
    }

    public void setScale(long scale) {
        this.scale = scale;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setFlags(long flags) {
        this.flags = flags;
    }

    public void setProfession(short profession) {
        this.profession = profession;
    }

    public void setLevel(short level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

}