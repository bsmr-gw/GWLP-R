
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P070_QuestRemove
    extends GenericAction
{

    private long iD;

    public short getHeader() {
        return  70;
    }

    public void setID(long iD) {
        this.iD = iD;
    }

}