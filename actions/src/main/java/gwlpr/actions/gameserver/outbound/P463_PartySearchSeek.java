
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P463_PartySearchSeek
    extends GenericAction
{

    private int seeking;

    public short getHeader() {
        return  463;
    }

    public void setSeeking(int seeking) {
        this.seeking = seeking;
    }

}