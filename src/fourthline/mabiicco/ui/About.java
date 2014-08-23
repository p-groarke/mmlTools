/*
 * Copyright (C) 2014 たんらる
 */

package fourthline.mabiicco.ui;

import java.awt.Frame;
import javax.swing.JOptionPane;

import fourthline.mabiicco.AppResource;

public final class About {
	public void show(Frame parentFrame) {
		String title = AppResource.appText("menu.about");
		String text = "Version: " + AppResource.getVersionText();
		JOptionPane.showMessageDialog(parentFrame, text, title, JOptionPane.PLAIN_MESSAGE);
	}
}