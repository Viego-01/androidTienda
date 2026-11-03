package com.mycompany.tiendita;

public  class Producto {
    private int code;
    private String nombre;
    private int precio;

     public static Producto[] lista=new Producto[]{
        new Producto(1,"Hamburguesa",25),
        new Producto(2,"Chetos",17),
        new Producto(3,"Mazapan",5),
        new Producto(4,"Coca-Cola",25)
    };

    public int getCode() {
        return code;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public static Producto[] getLista() {
        return lista;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static void setLista(Producto[] lista) {
        Producto.lista = lista;
    }

    public Producto() {
        this.code = 0;
        this.nombre = "los";
        this.precio = 2;
    } 

    public Producto(int code, String nombre, int precio) {
        this.code = code;
        this.nombre = nombre;
        this.precio = precio;
    } 

    @Override
    public String toString() {
        return  "" + code + "," + nombre + "," + precio;
    }
   public String carrito(int a){
        switch (a) {
            case 1:
                return "pediste una Hamburguesa de 25";
            case 2:
                return "pediste unos chetos de 17";
            case 3:
                return "pediste un Mazapan de 5";
            case 4:
                return "pediste una Coca-Cola de 25";
            default:
                break;
        }
        return "";
   }

}
