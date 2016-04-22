package com.evh98.vision.screens;

import com.evh98.vision.util.Graphics;
import com.evh98.vision.util.Palette;

import javafx.scene.canvas.GraphicsContext;

public class SystemScreen extends Screen {

	public SystemScreen(GraphicsContext gc) {
		super(gc);
	}

	@Override
	public void render() {
		gc.setFill(Palette.GREEN);
		gc.setStroke(Palette.LIGHT_GRAY);
		Graphics.fillRect(gc, 0, 0, 1080, 384);
		Graphics.strokeRect(gc, 0, 0, 1080, 384);
	}
}