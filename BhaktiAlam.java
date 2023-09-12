import java.util.Scanner;

public class BhaktiAlam {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("===== Bhakti Alam Cottage =====");
        System.out.println("1.Duku");
        System.out.println("2.Jeruk");
        System.out.println("3.Alpukat");
        System.out.println("4.Jambu Air");
        System.out.println("5.Durian");
        System.out.println("6.Melon");
        System.out.println("7.Belimbing");
        System.out.println("8.Mangga");
        System.out.println("9.Kedondong");
        System.out.println("Pilih Tipe Kamarmu: ");
        int PilihanKamar = input.nextInt();
        System.out.println("\n1.Weekday");
        System.out.println("2.Weekend");
        System.out.println("3.Holiday");
        System.out.println("Mau nginep di kapan nih? ");
        int PilihanJadwal = input.nextInt();
        System.out.println("Mau Menginap Berapa Malam? ");
        int LamaMenginap = input.nextInt();

        double DukuWeekday = 915000;
        double DukuWeekend = 1025000;
        double DukuHoliday = 1225000;

        double JerukWeekday = 915000;
        double JerukWeekend = 1025000;
        double JerukHoliday = 1225000;

        double AlpukatWeekday = 575000;
        double AlpukatWeekend = 695000;
        double AlpukatHoliday = 895000;

        double JambuWeekday = 575000;
        double JambuWeekend = 695000;
        double JambuHoliday = 895000;

        double DurianWeekday = 595000;
        double DurianWeekend = 715000;
        double DurianHoliday = 915000;

        double MelonWeekday = 595000;
        double MelonWeekend = 715000;
        double MelonHoliday = 915000;

        double BelimbingWeekday = 495000;
        double BelimbingWeekend = 575000;
        double BelimbingHoliday = 755000;

        double ManggaWeekday = 495000;
        double ManggaWeekend = 575000;
        double ManggaHoliday = 755000;

        double KedondongWeekday = 495000;
        double KedondongWeekend = 575000;
        double KedondongHoliday = 755000;

        double Harga;

        switch(PilihanKamar){
            case (1):
                switch(PilihanJadwal){
                    case (1):
                        Harga= DukuWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
            
        }

        switch(PilihanKamar){
            case (1):
                switch(PilihanJadwal){
                    case (2):
                        Harga= DukuWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (1):
                switch(PilihanJadwal){
                    case (3):
                        Harga= DukuHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: "+Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (2):
                switch(PilihanJadwal){
                    case (1):
                        Harga = JerukWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (2):
                switch(PilihanJadwal){
                    case (2):
                        Harga = JerukWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (2):
                switch(PilihanJadwal){
                    case (3):
                        Harga = JerukHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (3):
                switch(PilihanJadwal){
                    case (1):
                        Harga = AlpukatWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (3):
                switch(PilihanJadwal){
                    case (2):
                        Harga = AlpukatWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (3):
                switch(PilihanJadwal){
                    case (3):
                        Harga = AlpukatHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (4):
                switch(PilihanJadwal){
                    case (1):
                        Harga = JambuWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (4):
                switch(PilihanJadwal){
                    case (2):
                        Harga = JambuWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (4):
                switch(PilihanJadwal){
                    case (3):
                        Harga = JambuHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (5):
                switch(PilihanJadwal){
                    case (1):
                        Harga = DurianWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (5):
                switch(PilihanJadwal){
                    case (2):
                        Harga = DurianWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (5):
                switch(PilihanJadwal){
                    case (3):
                        Harga = DurianHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (6):
                switch(PilihanJadwal){
                    case (1):
                        Harga =  MelonWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (6):
                switch(PilihanJadwal){
                    case (2):
                        Harga = MelonWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (6):
                switch(PilihanJadwal){
                    case (3):
                        Harga = MelonHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (7):
                switch(PilihanJadwal){
                    case (1):
                        Harga = BelimbingWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (7):
                switch(PilihanJadwal){
                    case (2):
                        Harga = BelimbingWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (7):
                switch(PilihanJadwal){
                    case (3):
                        Harga = BelimbingHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (8):
                switch(PilihanJadwal){
                    case (1):
                        Harga = ManggaWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (8):
                switch(PilihanJadwal){
                    case (2):
                        Harga = ManggaWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (8):
                switch(PilihanJadwal){
                    case (3):
                        Harga = ManggaHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (9):
                switch(PilihanJadwal){
                    case (1):
                        Harga = KedondongWeekday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (9):
                switch(PilihanJadwal){
                    case (2):
                        Harga = KedondongWeekend * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }

        switch(PilihanKamar){
            case (9):
                switch(PilihanJadwal){
                    case (3):
                        Harga = KedondongHoliday * LamaMenginap;
                        System.out.println("Harga Menginap: " +Harga);
                break;
                }
        }
        
    }
}