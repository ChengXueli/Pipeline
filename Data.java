public class Data implements Comparable<Data> {
    public int num0;
    public int num1;

    @Override
    public String toString() {
        return "(" + num0 + ", " + num1 + ")";
    }

    @Override
    public int compareTo(Data o) {
        return this.num0 - o.num0;
    }
}
