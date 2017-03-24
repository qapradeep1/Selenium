package com.Practicejava.org;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

public class bg extends Applet
{
public void paint(Graphics graphic)
{
this.setSize(1000, 650);
int x = 0, y = 0, x1 = 0, y1 = 0;
Random point = new Random();
int x2 = 0, y2 = 0;
for (int i = 0; i < 500; i++) 
{
graphic.setColor(new Color(point.nextInt(255), point.nextInt(255),
point.nextInt(255), 255));
x = point.nextInt(250 - 10) + 5 + 750;
y = point.nextInt(325 - 10) + 5;
x1 = point.nextInt(250 - 10) + 5 + 750;
y1 = point.nextInt(325 - 10) + 5;
x2 = point.nextInt(250 - 10) + 5 + 750;
y2 = point.nextInt(325 - 10) + 5;
graphic.fillPolygon(new int[] { x, x1, x2 },new int[] { y, y1, y2 }, 3);
}
}
}