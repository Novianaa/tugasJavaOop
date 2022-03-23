import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String firstName, lastName, domisil, sd, smp, smk;
    int tahunLahir, usia;
    String valid = "";

    for (valid = "t"; valid.equals("t") || valid.equals("T");) {
      System.out.print("Input nama depan = ");
      firstName = input.nextLine();
      System.out.print("Input nama belakang = ");
      lastName = input.nextLine();
      System.out.print("Input domisil = ");
      domisil = input.nextLine();
      System.out.print("Input tahun lahir = ");
      tahunLahir = input.nextInt();
      input.nextLine();
      System.out.print("Input SD = ");
      sd = input.nextLine();
      System.out.print("Input SMP = ");
      smp = input.nextLine();
      System.out.print("Input SMK = ");
      smk = input.nextLine();

      usia = 2022 - tahunLahir;

      System.out.print("Apakah Anda Sudah Yakin Dengan Data? (Y/T) ");
      valid = input.nextLine();

      System.out.println("======= BIODATA =======");
      System.out.println("Nama Lengkap = " + firstName + " " + lastName);
      System.out.println("Domisil = " + domisil);
      System.out.println("Usia = " + usia);
      System.out.println("SD = " + sd);
      System.out.println("SMP = " + smp);
      System.out.println("SMK = " + smk);

    }
  }
}
