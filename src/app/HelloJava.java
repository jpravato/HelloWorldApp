package app;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Joey on 6/22/2018.
 * You can find the original example here: https://www.mkyong.com/java/ascii-art-java-example/
 */
public class HelloJava {
    public static void main(String args[]) {
        displayStringAsAsciiArt("Hello World");
        displayStringAsAsciiArt("Trolololo");
        displayStringAsAsciiArt("Teh Javas");
    }

    public static void displayStringAsAsciiArt(String str) {
        int width = 250;
        int height = 50;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        graphics.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.drawString(str, 6, 24);

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();

            for (int x = 0; x < width; x++) {
                sb.append(image.getRGB(x, y) == -16777216 ? " " : "0");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }

        System.out.println("");
    }
}
