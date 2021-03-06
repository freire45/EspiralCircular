package br.com.erickfreire.espiralcircular;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha uma espiral circular
 * @author Erick Freire
 * @version 1 - Criado em 07-06-2021 as 16:35
 */

public class EspiralCircular extends JPanel {
	
	private static final int DELTA = 1;
	   private static final int ARC_ANGLE = 20;
	   private static final int PREF_W = 300;
	   private static final int PREF_H = PREF_W;
	   private static final int LOOP_MAX = 400;

	   public void paintComponent(Graphics g) {
	      int x = PREF_W / 2;
	      int y = PREF_H / 2;
	      int width = 1;
	      int height = 1;
	      int startAngle = 0;
	      int arcAngle = ARC_ANGLE;
	      for (int i = 0; i < LOOP_MAX; i++) {
	         g.drawArc(x, y, width, height, startAngle, arcAngle);
	         x = x - DELTA;
	         y = y - DELTA;
	         width += 2 * DELTA;
	         height += 2 * DELTA;
	         startAngle = startAngle - arcAngle;
	      }
	   }

	   @Override
	   public Dimension getPreferredSize() {
	      if (isPreferredSizeSet()) {
	         return super.getPreferredSize();
	      }
	      return new Dimension(PREF_W, PREF_H);
	   }

}
