package model;

public class Page<T> {
    private int index;
    private int totlePage;
    private T data;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getTotlePage() {
        return totlePage;
    }

    public void setTotlePage(int totlePage) {
        this.totlePage = totlePage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
