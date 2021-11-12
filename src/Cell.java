public class Cell {
    private String  value;
    private Cell reference;
    public Cell(){


    }
    public Cell(String value, Cell c){
        this.value=value;
        this.reference=c;
    }

    public String getValue(){
        return this.value;
    }
    public Cell next(){
        return this.reference;
    }
    public void setReference(Cell reference){
        this.reference=reference;
    }
    public void setValue(String value){
        this.value=value;
    }

    public String toString(){
        return " "+this.value;
    }

}
