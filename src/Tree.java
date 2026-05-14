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
    public int len() {
        int size;
        if (this.is_empty()) {
            return 0;
        } else {
            size = 1;
            for (Tree subtree : this._subtrees) {
                size += subtree.len();
                return size;
            }

        }
    }
    }
}

