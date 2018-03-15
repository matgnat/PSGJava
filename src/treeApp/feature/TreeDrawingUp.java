package treeApp.feature;

/**
 * Created by magn on 3/12/2018.
 */
public class TreeDrawingUp extends TreeDrawing {

    public TreeDrawingUp(int treeHeight) {
        this.treeHeight = treeHeight;
        treeDrawing(this.treeHeight);
    }

    public void treeDrawing(int treeHeight) {
        for (int level = 0; level < treeHeight; level++) {
            for (int countSpace = 0; countSpace < treeHeight - level; countSpace++)
                System.out.print(" ");
            for (int countStar = 0; countStar < (2 * level + 1); countStar++)
                System.out.print("*");
            System.out.println();
        }
    }




}
