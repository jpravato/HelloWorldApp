package app;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Joey on 6/22/2018.
 */
public class HelloJava {
    public static void main(String args[]) {
        displayStringAsAsciiArt("Hello World");
        displayStringAsAsciiArt("Trolololo");
    }

    public static void displayStringAsAsciiArt(String str) {
        int width = 144;
        int height = 32;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(str, 6, 24);

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }
    }
}
