
package gwlpr.actions.gameserver.outbound;

import realityshard.shardlet.utils.GenericAction;


/**
 * Auto-generated by "Packet generator".
 * 
 * 
 */
public final class P167_PetDestroy
    extends GenericAction
{

    private long pet;

    public short getHeader() {
        return  167;
    }

    public void setPet(long pet) {
        this.pet = pet;
    }

}