package com.isil.sol_ep.entities;

public class Alumno {
    private long codigo;
    private String nombre;
    private String apellido;
    private double pc1, pc2, pc3, pc4;
    private double ep, ef;

    public Alumno(long codigo, String nombre, String apellido, double pc1, double pc2, double pc3, double pc4, double ep, double ef) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.pc4 = pc4;
        this.ep = ep;
        this.ef = ef;
    }

    private double CalcularPromPC(){
        double menor = pc1;
        if(pc2<menor) menor = pc2;
        if(pc3<menor) menor = pc3;
        if(pc4<menor) menor = pc4;

        return Math.round((pc1+pc2+pc3+pc4-menor)/3.0);
    }

    private double CalcularPromFinal(){
        return Math.round(CalcularPromPC()*0.5+ep*0.2+ef*0.3);
    }

    public String MostrarInfoCompleta(){
        return "Código: "+codigo+"\n"+
                "Nombre: "+nombre+"\n"+
                "Apellido: "+apellido+"\n"+
                "Prom.PC: "+CalcularPromPC()+"\n"+
                "Ex.Parc: "+ep+"\n"+
                "Ex.Final: "+ef+"\n"+
                "Prom.Final: "+CalcularPromFinal()+"\n";
    }
}
