package pboif2.pkg10119079.latihan30.cakep;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:   Program melihat apakah mahasiswa mengerjakan sendiri atau tidak
 *
 */
public class PBOIF210119079Latihan30Cakep {
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    
    public static void main(String[] args) {
      
    Scanner input=new Scanner(System.in);
    System.out.println(RED+"Kamu"+GREEN+" ngerjain sendiri"+YELLOW+" latihan 17 sampe"+BLUE+" latihan 30 in?");
    System.out.print(BLUE+"Jawab"+RED+"(Yoi/Enggak) : ");
    String jawab=input.next();
    
    if("Yoi".equals(jawab)){
        System.out.println("CAKEP");
    }else{
        System.out.println(RED+"Tetap cakep sih");
        System.out.println(RED+"Sing penting paham konsep nya yee");
        System.out.println("Keep the code works dude");
    }
    } 
}
