package ch.fhnw.oop1.le.figures;

class Rectangle extends Figure {
	private int w, h;

	public Rectangle(int x, int y, int w, int h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}

	public Rectangle(int w, int h) {
		this(0, 0, w, h);
	}

	public int getArea() {
		return w * h;
	}

	public int getWidth() {
		return w;
	}

	@Override
	public void draw() {/* draw Rectangle */
	}
}
