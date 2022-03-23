public class Person {
  public static void main(String[] args) {

    String firstName, lastName, domisil;
    int tahunLahir, usia;

    firstName = "Oh";
    lastName = "Sehun";
    domisil = "Seoul";
    tahunLahir = 1994;
    usia = 2022 - tahunLahir;

    System.out.println("Nama Lengkap : " + firstName + " " + lastName);
    System.out.println("Domisil : " + domisil);
    System.out.println("Usia : " + usia);
  }
}
