package com.it.principles.demo6.after;

public abstract class Car {
        private Color color;
        abstract void run();
        public Color getColor() {
            return color;
        }
        public void setColor(Color color) {
            this.color = color;
        }
}
