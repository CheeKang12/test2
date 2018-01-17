import java.util.Scanner;
public class gaji_pekerja {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan nama:");
        String nama=scan.next();
        System.out.print("Masukkan Bilangan Jam Sehari:");
        int bil_jam_sehari=scan.nextInt();
    
    if(bil_jam_sehari>9)
    {
        System.out.print("Bilangan Jam tidak boleh melebihi 9 jam.Sila isi bilangan jam yang betul\n");
        System.out.print("Masukkan Bilangan Jam Sehari:");
        int bil_jam=scan.nextInt();
    }
        System.out.print("Masukkan hari:");
        int bil_hari=scan.nextInt();
    if(bil_hari>30)
    {
        System.out.print("Bilangan hari tidak boleh melebihi 30 hari.Sila isi bilanagan hari yang betul\n");
        System.out.print("Masukkan bilangan hari :");
        int hari=scan.nextInt();
    }
        System.out.print("Masukan Bilangan Jam OT:");
        int bil_jam_ot=scan.nextInt();
    if (bil_jam_ot>50)
    {
        System.out.print("Bilangan Jam OT tidak boleh melebihi 50 jam.Sila isi bilangan jam ot yang betul\n");
        System.out.print("Masukan Bilangan Jam OT:");
        int jam_ot=scan.nextInt();
    }
    int gaji=(bil_jam_sehari*bil_hari*20)+(bil_jam_ot*15);
        System.out.println("Rumusan gaji bekerja:"+nama);
        System.out.println("Jumlah jam bekerja:"+bil_jam_sehari+"jam");
        System.out.println("Jumlah bilangan hari bekerja:"+bil_hari+"hari");
        System.out.println("Jumlah bilangan jam ot:"+bil_jam_ot+"jam");
        System.out.println("Jumlah gaji:RM"+gaji);
    }}
