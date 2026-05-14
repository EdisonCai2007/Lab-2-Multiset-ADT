import java.util.ArrayList;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    private Integer _root;
    private ArrayList<Tree> _subtrees;

    Tree(Integer root, ArrayList<Tree> subtrees) {
        _root = root;
        _subtrees = subtrees;
    }

    public boolean is_empty(){
        return this._root == null;
    }

    public double average() {
        if (this.is_empty()) {
            return 0.0;
        }

        int[] result = this.average_helper();
        int total = result[0];
        int size = result[1];

        return (double) total / size;
    }

    private int[] average_helper() {
        if (this.is_empty()) {
            return new int[]{0, 0};
        }

        int total = this._root;
        int size = 1;

        for (Tree subtree : this._subtrees) {
            int[] subtreeResult = subtree.average_helper();
            total += subtreeResult[0];
            size += subtreeResult[1];
        }

        return new int[]{total, size};
    }

}
