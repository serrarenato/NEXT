package br.com.globalcode.whiteboard.model.factory;

import java.awt.Color;
import java.awt.event.MouseEvent;

import br.com.globalcode.whiteboard.model.Polygon;
import br.com.globalcode.whiteboard.model.Triangle;

public final class PolygonFactory extends ShapeFactory {

	private Polygon currentPolygon;

	public PolygonFactory(Color color) {
		super(color);
	}

	@Override
	public Polygon getShape() {
		return currentPolygon;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (currentPolygon == null || currentPolygon.isComplete()) {
			currentPolygon = new Polygon(getColor(), e.getPoint());
		} else {
			currentPolygon.addPoint(e.getPoint());
		}

	}

	@Override
	public String getName() {
		return "Polygon";
	}

}
