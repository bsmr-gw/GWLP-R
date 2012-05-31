/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-05-28
 */

package com.gamerevision.gwlpr.actions.gameserver.stoc;

import com.realityshard.shardlet.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P365_UnknownAction extends GenericAction
{

    private int unknown1;
    private short unknown2;
    private byte unknown3;
    private List<Short> unknown4;


    public short getHeader()
    {
        return 365;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(short newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(byte newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(List<Short> newValue)
    {
        unknown4 = newValue;
    }


    private int getSize()
    {
        int size = 11;

        if (unknown4 == null)
        {
            return 0;
        }
        
        size += 2 * unknown4.size();

        return size;
    }


    @Override
    public boolean serialize()
    {
        int size = getSize();

        if (size == 0)
        {
            return false;
        }

        ByteBuffer buffer = ByteBuffer.allocate(size).order(ByteOrder.LITTLE_ENDIAN);

        try
        {
            buffer.putShort(getHeader());

            buffer.putInt(unknown1);
            buffer.putShort(unknown2);
            buffer.put(unknown3);
            short prefix_unknown4 = (short) unknown4.size();
            buffer.putShort(prefix_unknown4);
            
            for (int i = 0; i < prefix_unknown4; i++)
            {
                buffer.putShort(unknown4.get(i));
            }
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}