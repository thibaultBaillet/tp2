package question1;

public class PileAdaptor implements PileI {
    public StackImpl stack;
    public PileAdaptor(){

    }
    public PileAdaptor(StackImpl p_StackImpl){
        this.stack = p_StackImpl;
    }

    public void empiler(Object o) {
        this.stack.push(o);
    }

    public Object depiler() {
        return this.stack.pop();
    }

    public boolean estVide() {
        return this.stack.isEmpty();
    }
}
