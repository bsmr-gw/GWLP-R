
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P444_PartyMemberAdd
    extends GenericAction
{

    private int partyId;
    private int charLocalID;
    private short isLoaded;

    public short getHeader() {
        return  444;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public void setCharLocalID(int charLocalID) {
        this.charLocalID = charLocalID;
    }

    public void setIsLoaded(short isLoaded) {
        this.isLoaded = isLoaded;
    }

}