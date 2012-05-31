/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-05-31
 */

package com.gamerevision.gwlpr.actions.gameserver.stoc;

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
public final class P285_UnknownAction extends GenericAction
{

    private char[] unknown1;
    private char[] unknown2;
    private char[] unknown3;
    private char[] unknown4;
    private int unknown5;
    private int unknown6;
    private int unknown7;
    private int unknown8;
    private byte unknown9;


    public short getHeader()
    {
        return 285;
    }


    public void setUnknown1(char[] newValue)
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


    public void setUnknown4(char[] newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(int newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(int newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(int newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(int newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(byte newValue)
    {
        unknown9 = newValue;
    }


    private int getSize()
    {
        int size = 27;

        if (unknown1 != null)
        {
            size += 2 * unknown1.length;
        }
        if (unknown2 != null)
        {
            size += 2 * unknown2.length;
        }
        if (unknown3 != null)
        {
            size += 2 * unknown3.length;
        }
        if (unknown4 != null)
        {
            size += 2 * unknown4.length;
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

            short prefix_unknown1;
            if (unknown1 == null)
            {
                prefix_unknown1 = 0;
            }
            else
            {
                prefix_unknown1 = (short) unknown1.length;
            }
            buffer.putShort(prefix_unknown1);
            
            for (int i = 0; i < prefix_unknown1; i++)
            {
                buffer.putChar(unknown1[i]);
            }
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
            short prefix_unknown4;
            if (unknown4 == null)
            {
                prefix_unknown4 = 0;
            }
            else
            {
                prefix_unknown4 = (short) unknown4.length;
            }
            buffer.putShort(prefix_unknown4);
            
            for (int i = 0; i < prefix_unknown4; i++)
            {
                buffer.putChar(unknown4[i]);
            }
            buffer.putInt(unknown5);
            buffer.putInt(unknown6);
            buffer.putInt(unknown7);
            buffer.putInt(unknown8);
            buffer.put(unknown9);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}