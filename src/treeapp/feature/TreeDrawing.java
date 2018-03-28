package treeapp.feature;

/**
 * Created by magn on 3/12/2018.
 */
public abstract class TreeDrawing {

    private int treeHeight;
    private void treeDrawing(int treeHeight) {
        System.out.println("Draw");
    }

    public int getTreeHeight() {
        return treeHeight;
    }

    public void setTreeHeight(int treeHeight) {
        this.treeHeight = treeHeight;
    }
}
