class Operations {
    public boolean isRightTriangle(Triangle triangle) {
        int aSquared = triangle.getA() * triangle.getA();
        int bSquared = triangle.getB() * triangle.getB();
        int cSquared = triangle.getC() * triangle.getC();
        return aSquared + bSquared == cSquared;
    }

}
