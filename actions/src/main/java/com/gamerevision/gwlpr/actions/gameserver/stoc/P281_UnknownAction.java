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
public final class P281_UnknownAction extends GenericAction
{

    private byte[] unknown1;
    private char[] unknown2;
    private char[] unknown3;
    private char[] unknown4;
    private int unknown5;
    private int unknown6;
    private byte unknown7;


    public short getHeader()
    {
        return 281;
    }


    public void setUnknown1(byte[] newValue)
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


    public void setUnknown7(byte newValue)
    {
        unknown7 = newValue;
    }


    private int getSize()
    {
        int size = 33;

        if (unknown1 == null)
        {
            return 0;
        }
        
        if (unknown1.length != 16)
        {
            return 0;
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

            for (int i = 0; i < 16; i++)
            {
                buffer.put(unknown1[i]);
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
            buffer.put(unknown7);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}