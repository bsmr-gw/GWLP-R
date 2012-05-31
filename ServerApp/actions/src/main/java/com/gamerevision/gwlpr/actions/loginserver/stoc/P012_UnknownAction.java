/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-05-31
 */

package com.gamerevision.gwlpr.actions.loginserver.stoc;

import com.realityshard.shardlet.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P012_UnknownAction extends GenericAction
{

    private int unknown1;
    private char[] unknown2;
    private char[] unknown3;


    public short getHeader()
    {
        return 12;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(char[] newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(char[] newValue)
    {
        unknown3 = newValue;
    }


    private int getSize()
    {
        int size = 10;

        if (unknown2 != null)
        {
            size += 2 * unknown2.length;
        }
        if (unknown3 != null)
        {
            size += 2 * unknown3.length;
        }

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
            short prefix_unknown2;
            if (unknown2 == null)
            {
                prefix_unknown2 = 0;
            }
            else
            {
                prefix_unknown2 = (short) unknown2.length;
            }
            buffer.putShort(prefix_unknown2);
            
            for (int i = 0; i < prefix_unknown2; i++)
            {
                buffer.putChar(unknown2[i]);
            }
            short prefix_unknown3;
            if (unknown3 == null)
            {
                prefix_unknown3 = 0;
            }
            else
            {
                prefix_unknown3 = (short) unknown3.length;
            }
            buffer.putShort(prefix_unknown3);
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                buffer.putChar(unknown3[i]);
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