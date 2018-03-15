package treeapp.feature;

/**
 * Created by magn on 3/12/2018.
 */
public class TreeDrawingRight extends TreeDrawing {


    public TreeDrawingRight(int treeHeight) {
        this.treeHeight = treeHeight;
        treeDrawing(this.treeHeight);
    }

    public void treeDrawing(int treeHeight) {
        for (int level = 0; level < treeHeight; level++) {
            for (int countStar = 0; countStar < level + 1; countStar++)
                System.out.print("*");
            System.out.println();
        }
        for (int level = 0; level < treeHeight; level++) {
            for (int countStarBack = treeHeight - 1; countStarBack > level; countStarBack--)
                System.out.print("*");
            System.out.println();
        }
    }
}
