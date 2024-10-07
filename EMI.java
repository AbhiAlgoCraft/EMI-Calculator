package Emiapp;

 class EMI {
   
    public static void main(String argd[]){
        Model m = new Model(0, 0, 0);
        View v = new View();
        Controller c = new Controller(m, v);
        c.setResult();
    }
}
