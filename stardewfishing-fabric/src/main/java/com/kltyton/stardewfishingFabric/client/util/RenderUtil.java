package com.kltyton.stardewfishingFabric.client.util;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;
import org.joml.Matrix3x2fStack;

public class RenderUtil {
    public static void blitF(GuiGraphicsExtractor extractor, Identifier texture, float x, float y, int uOffset, int vOffset, int uWidth, int vHeight) {
        blitF(extractor, texture, x, y, uOffset, vOffset, uWidth, vHeight, 0xFFFFFFFF);
    }

    public static void blitF(GuiGraphicsExtractor extractor, Identifier texture, float x, float y, int uOffset, int vOffset, int uWidth, int vHeight, int color) {
        extractor.blit(RenderPipelines.GUI_TEXTURED, texture, (int) x, (int) y, (float) uOffset, (float) vOffset, uWidth, vHeight, 256, 256, color);
    }

    public static void fillF(GuiGraphicsExtractor extractor, float pMinX, float pMinY, float pMaxX, float pMaxY, float pZ, int pColor) {
        int minX = (int) Math.min(pMinX, pMaxX);
        int maxX = (int) Math.max(pMinX, pMaxX);
        int minY = (int) Math.min(pMinY, pMaxY);
        int maxY = (int) Math.max(pMinY, pMaxY);
        extractor.fill(minX, minY, maxX, maxY, pColor);
    }

    public static void drawRotatedAround(Matrix3x2fStack poseStack, float radians, float pivotX, float pivotY, Runnable runnable) {
        poseStack.pushMatrix();
        poseStack.translate(pivotX, pivotY);
        poseStack.rotate(radians);
        poseStack.translate(-pivotX, -pivotY);
        runnable.run();
        poseStack.popMatrix();
    }

    public static void drawWithShake(Matrix3x2fStack poseStack, Shake shake, float partialTick, boolean doShake, Runnable runnable) {
        if (doShake) {
            poseStack.pushMatrix();
            poseStack.translate(shake.getXOffset(partialTick), shake.getYOffset(partialTick));
        }

        runnable.run();

        if (doShake) {
            poseStack.popMatrix();
        }
    }
}
