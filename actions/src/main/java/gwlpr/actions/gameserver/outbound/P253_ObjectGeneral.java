
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * This is used to setup objects such as signposts.
 * 
 */
public final class P253_ObjectGeneral
    extends GenericAction
{

    private long localID;
    private long modelFile;
    private long flag;
    private short scale;
    private String name;

    public short getHeader() {
        return  253;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    public void setModelFile(long modelFile) {
        this.modelFile = modelFile;
    }

    public void setFlag(long flag) {
        this.flag = flag;
    }

    public void setScale(short scale) {
        this.scale = scale;
    }

    public void setName(String name) {
        this.name = name;
    }

}