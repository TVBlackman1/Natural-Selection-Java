package present;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Hashtable;

public class ImageConverter {
    public static ByteBuffer convertImageData(BufferedImage bufferedImage) {
        WritableRaster raster;
        BufferedImage texImage;

        ColorModel glAlphaColorModel = new ComponentColorModel(ColorSpace
                .getInstance(ColorSpace.CS_sRGB), new int[] { 8, 8, 8, 8 },
                true, false, Transparency.TRANSLUCENT, DataBuffer.TYPE_BYTE);

        raster = Raster.createInterleavedRaster(DataBuffer.TYPE_BYTE,
                bufferedImage.getWidth(), bufferedImage.getHeight(), 4, null);
        texImage = new BufferedImage(glAlphaColorModel, raster, true,
                new Hashtable());

        // copy the source image into the produced image
        Graphics g = texImage.getGraphics();
        g.setColor(new Color(0f, 0f, 0f, 0f));
        g.fillRect(0, 0, 256, 256);
        g.drawImage(bufferedImage, 0, 0, null);

        // build a byte buffer from the temporary image
        // that be used by OpenGL to produce a texture.
        byte[] data = ((DataBufferByte) texImage.getRaster().getDataBuffer())
                .getData();

        ByteBuffer imageBuffer = ByteBuffer.allocateDirect(data.length);
        imageBuffer.order(ByteOrder.nativeOrder());
        imageBuffer.put(data, 0, data.length);
        imageBuffer.flip();

        return imageBuffer;
    }
}
