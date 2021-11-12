public class MyList {
    private Cell premierElement;

    public MyList(Cell n) {
        this.premierElement = n;
    }

    public MyList() {
        this.premierElement = null;
    }


    public void add(String element) {
        premierElement = new Cell(element, premierElement);
    }

    int size() {
        Cell it = premierElement;
        int cpt = 0;
        while (it.next() != null) {
            cpt++;
            it = it.next();
        }
        return cpt;
    }

         public void addLast(String s) {
        if (premierElement == null) {
            premierElement = new Cell(s, null);
        } else {
            Cell it = premierElement;
            while (it.next() != null) {
                it = it.next();
            }
            Cell last = new Cell(s, null);
            it.setReference(last);
        }
    }

       public void add(String s, int i){
            Cell it= premierElement;
            int cpt=0;
            while(it.next()!=null && cpt!=i){
                System.out.println(i);
                it= it.next();
                cpt++;
            }
            Cell nouv = new Cell(s,it.next());
            it.setReference(nouv);
        }
        public String toString(){
            Cell it= premierElement;
            String res=premierElement.toString()+ " \n";
            while(it.next()!=null){
                it=it.next();
                res+=it.toString()+" \n";

            }
            return res;
        }
        int sumLetters(){
            int cpt=0;
            Cell it= premierElement;
            int res=it.toString().length();
            while(it.next()!=null){
                it=it.next();
                res+=it.toString().length();
            }
            return res;
        }
        String get(int indice){
            if(indice>size())
                return "Invalid";
            Cell it= premierElement;
            int cpt=0;
            while(it.next()!=null && cpt!=indice){
                it= it.next();
                cpt++;
            }
            return it.toString();
        }

    }



