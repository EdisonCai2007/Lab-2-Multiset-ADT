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

    public String __str__(){
        return this._str_indented(0);
    }

    private String _str_indented(int depth){
        if (this.is_empty()) {
            return "";
        }else {
            String s = "  ".repeat(depth) + this._root + "\n";
            for (Tree subtree : this._subtrees) {
                s += subtree._str_indented(depth + 1);
            }
            return s;
        }
    }
}
