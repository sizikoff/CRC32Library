package ru.library.crc32lib;

import java.nio.ByteBuffer;

public class CRCcalculation {

    public long CRC(String array) {
        CRC32 crc32 = new CRC32();
        byte [] crcbyte = HexToArray(array);
        crc32.reset();
        crc32.update(crcbyte);
        return crc32.getValue();
    }

    public String CRC32SForString(String string) {
        byte[] day02 = string.getBytes();
        StringBuilder sb0 = new StringBuilder();
        for (byte b : day02) {
            sb0.append(String.format("%02X", b));
        }
        return sb0.toString();
    }

    public String CRC32ForInt(int number) {
        byte[] a = intToBytes(number);
        StringBuilder sb = new StringBuilder();
        for (int j = 3; j >= 0; j--) {
            sb.append(String.format("%02X", a[j]));
        }
        return sb.toString();
    }

    public static byte[] intToBytes( final int i ) {
        ByteBuffer bb = ByteBuffer.allocate(4);
        bb.putInt(i);
        return bb.array();
    }
    public static byte[] HexToArray(String astrHex)
    {
        int nLen = astrHex.length() / 2;
        byte[] szRes = new byte[nLen];
        for (int i = 0; i < nLen; i++)
        {
            String strByte = astrHex.substring(2 * i, 2 * i + 2);
            int nVal = Integer.parseInt(strByte, 16);
            szRes[i] = (byte)nVal;
        }
        return szRes;
    }

}
