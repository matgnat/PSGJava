package treeapp.feature;

/**
 * Created by magn on 3/12/2018.
 */
public class TreeDrawingLeft extends TreeDrawing {

    public TreeDrawingLeft(int treeHeight) {
        this.treeHeight = treeHeight;
        treeDrawing(this.treeHeight);
    }

    private void treeDrawing(int treeHeight) {
        for (int level = 0; level < treeHeight; level++) {
            for (int countSpace = 0; countSpace < treeHeight - level; countSpace++)
                System.out.print(" ");
            for (int countStar = 0; countStar < level + 1; countStar++)
                System.out.print("*");
            System.out.println();
        }

        for (int level = 0; level < treeHeight; level++) {
            for (int countSpace = 0; countSpace < level + 2; countSpace++)
                System.out.print(" ");
            for (int countStarBack = treeHeight - 1; countStarBack > level; countStarBack--)
                System.out.print("*");
            System.out.println();
        }
    }
}
