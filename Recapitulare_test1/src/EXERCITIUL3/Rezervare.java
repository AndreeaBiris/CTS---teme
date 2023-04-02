package EXERCITIUL3;

public interface Rezervare extends Cloneable{
    void setNume(String nume);
    void setData(String data);
    void generateRezervare();
    Rezervare clone() throws CloneNotSupportedException;
}
