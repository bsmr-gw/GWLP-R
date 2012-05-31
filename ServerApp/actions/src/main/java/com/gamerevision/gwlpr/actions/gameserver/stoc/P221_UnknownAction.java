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
public final class P221_UnknownAction extends GenericAction
{

    private int unknown1;
    private int unknown2;
    private int unknown3;
    private int unknown4;
    private int unknown5;
    private int unknown6;
    private int unknown7;
    private int unknown8;
    private int unknown9;
    private int unknown10;
    private int unknown11;
    private int unknown12;
    private int unknown13;
    private int unknown14;
    private int unknown15;


    public short getHeader()
    {
        return 221;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(int newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(int newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(int newValue)
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


    public void setUnknown9(int newValue)
    {
        unknown9 = newValue;
    }


    public void setUnknown10(int newValue)
    {
        unknown10 = newValue;
    }


    public void setUnknown11(int newValue)
    {
        unknown11 = newValue;
    }


    public void setUnknown12(int newValue)
    {
        unknown12 = newValue;
    }


    public void setUnknown13(int newValue)
    {
        unknown13 = newValue;
    }


    public void setUnknown14(int newValue)
    {
        unknown14 = newValue;
    }


    public void setUnknown15(int newValue)
    {
        unknown15 = newValue;
    }


    private int getSize()
    {
        return 62;
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
            buffer.putInt(unknown2);
            buffer.putInt(unknown3);
            buffer.putInt(unknown4);
            buffer.putInt(unknown5);
            buffer.putInt(unknown6);
            buffer.putInt(unknown7);
            buffer.putInt(unknown8);
            buffer.putInt(unknown9);
            buffer.putInt(unknown10);
            buffer.putInt(unknown11);
            buffer.putInt(unknown12);
            buffer.putInt(unknown13);
            buffer.putInt(unknown14);
            buffer.putInt(unknown15);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}