package treeapp.feature;

/**
 * Created by magn on 3/12/2018.
 */
public class TreeDrawingDown extends TreeDrawing {


    public TreeDrawingDown(int treeHeight) {

        setTreeHeight(treeHeight);
        treeDrawing(getTreeHeight());
    }

    private void treeDrawing(int treeHeight) {
        for (int level = 0; level < treeHeight; level++) {
            for (int countSpace = 0; countSpace < level + 1; countSpace++)
                System.out.print(" ");
            for (int countStar = level * 2; countStar < treeHeight * 2 - 1; countStar++)
                System.out.print("*");
            System.out.println();

        }
    }
}
