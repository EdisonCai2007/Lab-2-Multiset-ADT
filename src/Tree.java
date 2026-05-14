import java.util.ArrayList;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    private int _root;
    private ArrayList<Tree> _subtrees;

    Tree(int root, ArrayList<Tree> subtrees) {
        _root = root;
        _subtrees = subtrees;
    }
}
