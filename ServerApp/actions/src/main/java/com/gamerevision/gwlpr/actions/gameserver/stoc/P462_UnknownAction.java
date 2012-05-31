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
public final class P462_UnknownAction extends GenericAction
{

    private short unknown1;
    private short unknown2;
    private byte unknown3;
    private byte unknown4;
    private byte unknown5;
    private byte unknown6;
    private byte unknown7;
    private char[] unknown8;
    private char[] unknown9;
    private byte unknown10;
    private byte unknown11;
    private byte unknown12;
    private int unknown13;


    public short getHeader()
    {
        return 462;
    }


    public void setUnknown1(short newValue)
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


    public void setUnknown4(byte newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(byte newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(byte newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(byte newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(char[] newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(char[] newValue)
    {
        unknown9 = newValue;
    }


    public void setUnknown10(byte newValue)
    {
        unknown10 = newValue;
    }


    public void setUnknown11(byte newValue)
    {
        unknown11 = newValue;
    }


    public void setUnknown12(byte newValue)
    {
        unknown12 = newValue;
    }


    public void setUnknown13(int newValue)
    {
        unknown13 = newValue;
    }


    private int getSize()
    {
        int size = 22;

        if (unknown8 != null)
        {
            size += 2 * unknown8.length;
        }
        if (unknown9 != null)
        {
            size += 2 * unknown9.length;
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

            buffer.putShort(unknown1);
            buffer.putShort(unknown2);
            buffer.put(unknown3);
            buffer.put(unknown4);
            buffer.put(unknown5);
            buffer.put(unknown6);
            buffer.put(unknown7);
            short prefix_unknown8;
            if (unknown8 == null)
            {
                prefix_unknown8 = 0;
            }
            else
            {
                prefix_unknown8 = (short) unknown8.length;
            }
            buffer.putShort(prefix_unknown8);
            
            for (int i = 0; i < prefix_unknown8; i++)
            {
                buffer.putChar(unknown8[i]);
            }
            short prefix_unknown9;
            if (unknown9 == null)
            {
                prefix_unknown9 = 0;
            }
            else
            {
                prefix_unknown9 = (short) unknown9.length;
            }
            buffer.putShort(prefix_unknown9);
            
            for (int i = 0; i < prefix_unknown9; i++)
            {
                buffer.putChar(unknown9[i]);
            }
            buffer.put(unknown10);
            buffer.put(unknown11);
            buffer.put(unknown12);
            buffer.putInt(unknown13);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}