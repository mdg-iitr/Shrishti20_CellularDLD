public class Pair {
    private Coordinate coordinate;
    private Cell cell;

    public Pair(Coordinate coordinate, Cell cell) {
        this.coordinate = coordinate;
        this.cell = cell;
    }

    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    public Cell getCell() {
        return this.cell;
    }
}
