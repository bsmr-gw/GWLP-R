
package gwlpr.actions.gameserver.outbound;

import gwlpr.actions.utils.IsArray;
import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P075_NPCModel
    extends GenericAction
{

    private long localID;
    @IsArray(constant = false, size = 8, prefixLength = 2)
    private long[] modelFile;

    public short getHeader() {
        return  75;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    public void setModelFile(long[] modelFile) {
        this.modelFile = modelFile;
    }

}