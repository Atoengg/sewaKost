package utama;

import java.io.*;
import sewa.penyewa;
import sewa.katagori;

public class Utama {
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        int pil;
        int kost;
        double diskon;
        int jml_diskon, masuk, lama, bayar, tarif = 0, transaksi, kurang, total ,kembali;
        try{
            System.out.println("===============================================");
            System.out.println("         PENYEWAAN KOST AREA KAMPUS UTM        ");
            System.out.println("           Telang, Jl. Raya Telang             ");
            System.out.println("===============================================");
            System.out.println("===============================================");
            do{
                System.out.println("================== MENU UTAMA =================");
                System.out.printf("%-10s %-10s %-10s %-10s\n", "| == kd kost == |", "| == jml.kamar == |", "| == fasilitas == |", "|            == harga ==           |");
                System.out.printf("%-10s %-10s %-10s %-10s\n", "|      1        |", "|       6         |", "|       VIP       |", "| Rp.50.000/hari, Rp.500.000/bulan |");
                System.out.printf("%-10s %-10s %-10s %-10s\n", "|      2        |", "|       4         |", "|      MEDIUM     |", "| Rp.25.000/hari, Rp.250.000/bulan |");
                System.out.printf("%-10s %-10s %-10s %-10s\n", "|      3        |", "|       2         |", "|      BIASA      |", "| Rp.10.000/hari, Rp.150.000/bulan |");
                System.out.printf("%-10s %-10s %-10s %-10s\n", "|================",  "===================", "===================", "===================================|");
                System.out.println("| 1. sewa kost");
                System.out.println("| 9. keluar dari aplikasi");
                System.out.print("masukan pilihan[1/9]: ");
                kost=Integer.parseInt(input.readLine());
                
                switch(kost){
                    case 1 :
                        System.out.println("=== PENYEWAAN KOST ======");
                        System.out.print("masukan kd kost\t: ");
                        String kdkost = input.readLine();
                        System.out.println("==========================");
                        
                        switch(kdkost){
                            case "1":
                            {
                                System.out.println("====== informasi penyewa ======");
                                System.out.print("masukan nama\t\t: ");
                                String nama = input.readLine();
                                System.out.print("No.Hp\t\t\t: ");
                                String nohp = input.readLine();
                                System.out.print("E-mail\t\t\t: ");
                                String email = input.readLine();
                                System.out.print("masukan Alamat\t\t: ");
                                String alamat = input.readLine();
                                System.out.println("1.harian\n2.bulanan");
                                System.out.print("masukan katagori\t: ");
                                String katagori = input.readLine();
                                
                                
                                if ("1".equals(katagori)){
                                    System.out.print("lama menginap\t\t:");
                                    lama = Integer.parseInt(input.readLine());
                                    if (lama > 5){
                                        System.out.println("selamat anda mendapat diskon 25%");
                                        diskon = 0.25;
                                        tarif = lama*50000;
                                        jml_diskon = (int) (diskon*tarif);
                                        total = (int) (tarif - jml_diskon);
                                        System.out.println("Tarif Normal\t\t:Rp."+tarif);
                                        System.out.println("Setelah mendapat diskon:Rp."+total);
                                    } else {
                                        tarif = lama*50000;
                                        total = tarif;
                                        System.out.println("Tarif Normal\t\t:Rp."+total);
                                    }
                                        
                                    System.out.print("Transaksi\t\t:Rp.");
                                    transaksi = Integer.parseInt(input.readLine());
                                    do{
                                        kurang = total - transaksi;
                                        System.err.println("maaf pembayaran anda kurang Rp."+kurang);
                                        System.out.print("Transaksi\t\t:Rp.");
                                        transaksi = Integer.parseInt(input.readLine());
                                    }while(transaksi<total);
                                    
                                    kembali = transaksi-total;
                                    
                                    System.out.println("===============================================");
                                    System.out.println("                STRUK PEMBAYARAN               ");
                                    System.out.println("         PENYEWAAN KOST AREA KAMPUS UTM        ");
                                    System.out.println("           Telang, Jl. Raya Telang             ");
                                    System.out.println("===============================================");
                                    System.out.println("===============================================");
                                    
                                    penyewa a = new penyewa();
                                    a.setNama(nama);
                                    a.setNohp(nohp);
                                    a.setEmail(email);
                                    a.setAlamat(alamat);
                                    
                                    katagori k = new katagori();
                                    k.setkatagori(katagori);
                                    System.out.println("  Nama\t\t\t\t:"+a.getNama());
                                    System.out.println("  No Hp\t\t\t\t:"+a.getNohp());
                                    System.out.println("  Alamat\t\t\t:"+a.getAlamat());
                                    System.out.println("  E-mail\t\t\t:"+a.getEmail());
                                    System.out.println("  Kode Kost\t\t\t:"+kdkost);
                                    System.out.println("  Lama menginap\t\t\t:"+lama+" hari");
                                    System.out.println("===============================================");
                                    System.out.println("  Total Semua\t\t\t:"+total);
                                    System.out.println("  Bayar\t\t\t\t:"+transaksi);
                                    System.out.println("  Kembali\t\t\t:"+kembali);
                                    System.out.println("===============================================");
                                    System.out.println("                     TERIMAKASIH               ");
                                    
                                //bulanan    
                                    
                                } else if("2".equals(katagori)){ 
                                    System.out.print("lama menginap\t\t:");
                                    lama = Integer.parseInt(input.readLine());
                                    if (lama > 6){
                                        System.out.println("selamat anda mendapat diskon 50%");
                                        diskon = 0.5;
                                        tarif = lama*500000;
                                        jml_diskon = (int) (diskon*tarif);
                                        total = (int) (tarif - jml_diskon);
                                        System.out.println("Tarif Normal\t\t:Rp."+tarif);
                                        System.out.println("Setelah mendapat diskon:Rp."+total);
                                    } else{
                                        tarif = lama*500000;
                                        total=tarif;
                                        System.out.println("Tarif Normal\t\t:Rp."+total);
                                    }
                                    System.out.print("Transaksi\t\t:Rp.");
                                    transaksi = Integer.parseInt(input.readLine());
                                    do{
                                        kurang = total - transaksi;
                                        System.err.println("maaf pembayaran anda kurang Rp."+kurang);
                                        System.out.print("Transaksi\t\t:Rp.");
                                        transaksi = Integer.parseInt(input.readLine());
                                    }while(transaksi<total);
                                    
                                    kembali = transaksi-total;
                                    
                                    System.out.println("===============================================");
                                    System.out.println("                STRUK PEMBAYARAN               ");
                                    System.out.println("         PENYEWAAN KOST AREA KAMPUS UTM        ");
                                    System.out.println("           Telang, Jl. Raya Telang             ");
                                    System.out.println("===============================================");
                                    System.out.println("===============================================");
                                    penyewa s = new penyewa();
                                    s.setNama(nama);
                                    s.setNohp(nohp);
                                    s.setEmail(email);
                                    s.setAlamat(alamat);
                                    
                                    katagori k = new katagori();
                                    k.setkatagori(katagori);
                                    System.out.println("  Nama\t\t\t\t:"+s.getNama());              
                                    System.out.println("  No Hp\t\t\t\t:"+s.getNohp());
                                    System.out.println("  Alamat\t\t\t:"+s.getAlamat());
                                    System.out.println("  E-mail\t\t\t:"+s.getEmail());
                                    System.out.println("  Kode Kost\t\t\t:"+kdkost);
                                    System.out.println("  Lama menginap\t\t\t:"+lama+" bulan");
                                    System.out.println("===============================================");
                                    System.out.println("  Total Semua\t\t\t:"+total);
                                    System.out.println("  Bayar\t\t\t\t:"+transaksi);
                                    System.out.println("  Kembali\t\t\t:"+kembali);
                                    System.out.println("===============================================");
                                    System.out.println("                     TERIMAKASIH               ");    
                                } else{
                                    System.err.println("maaf pilihan anda salah");
                                }
                                break;
                            
                            }
                        case "2":
                            {
                                System.out.println("====== informasi penyewa ======");
                                System.out.print("masukan nama\t\t: ");
                                String nama = input.readLine();
                                System.out.print("No.Hp\t\t\t: ");
                                String nohp = input.readLine();
                                System.out.print("E-mail\t\t\t: ");
                                String email = input.readLine();
                                System.out.print("masukan Alamat\t\t: ");
                                String alamat = input.readLine();
                                System.out.println("1.harian\n2.bulanan");
                                System.out.print("masukan katagori\t: ");
                                String katagori = input.readLine();
                                
                                if ("1".equals(katagori)){
                                    System.out.print("lama menginap\t\t:");
                                    lama = Integer.parseInt(input.readLine());
                                    if (lama > 5){
                                        System.out.println("selamat anda mendapat diskon 10%");
                                        diskon = 0.1;
                                        tarif = lama*25000;
                                        jml_diskon = (int) (diskon*tarif);
                                        total = (int) (tarif - jml_diskon);
                                        System.out.println("Tarif Normal\t\t:Rp."+tarif);
                                        System.out.println("Setelah mendapat diskon:Rp."+total);
                                    } else {
                                        tarif = lama*25000;
                                        total = tarif;
                                        System.out.println("Tarif Normal\t\t:Rp."+total);
                                    }
                                        
                                    System.out.print("Transaksi\t\t:Rp.");
                                    transaksi = Integer.parseInt(input.readLine());
                                    do{
                                        kurang = total - transaksi;
                                        System.err.println("maaf pembayaran anda kurang Rp."+kurang);
                                        System.out.print("Transaksi\t\t:Rp.");
                                        transaksi = Integer.parseInt(input.readLine());
                                    }while(transaksi<total);
                                    
                                    kembali = transaksi-total;
                                    
                                    
                                    System.out.println("===============================================");
                                    System.out.println("                STRUK PEMBAYARAN               ");
                                    System.out.println("         PENYEWAAN KOST AREA KAMPUS UTM        ");
                                    System.out.println("           Telang, Jl. Raya Telang             ");
                                    System.out.println("===============================================");
                                    System.out.println("===============================================");
                                    penyewa b = new penyewa();
                                    b.setNama(nama);
                                    b.setNohp(nohp);
                                    b.setEmail(email);
                                    b.setAlamat(alamat);
                                    
                                    katagori k = new katagori();
                                    k.setkatagori(katagori);
                                    System.out.println("  Nama\t\t\t\t:"+b.getNama());                
                                    System.out.println("  No Hp\t\t\t\t:"+b.getNohp());
                                    System.out.println("  Alamat\t\t\t:"+b.getAlamat());
                                    System.out.println("  E-mail\t\t\t:"+b.getEmail());
                                    System.out.println("  Kode Kost\t\t\t:"+kdkost);
                                    System.out.println("  Lama menginap\t\t\t:"+lama+" hari");
                                    System.out.println("===============================================");
                                    System.out.println("  Total Semua\t\t\t:"+total);
                                    System.out.println("  Bayar\t\t\t\t:"+transaksi);
                                    System.out.println("  Kembali\t\t\t:"+kembali);
                                    System.out.println("===============================================");
                                    System.out.println("                     TERIMAKASIH               ");
                                    
                                    
                                } else if("2".equals(katagori)){ 
                                    System.out.print("lama menginap\t\t:");
                                    lama = Integer.parseInt(input.readLine());
                                    if (lama > 6){
                                        System.out.println("selamat anda mendapat diskon 20%");
                                        diskon = 0.2;
                                        tarif = lama*250000;
                                        jml_diskon = (int) (diskon*tarif);
                                        total = (int) (tarif - jml_diskon);
                                        System.out.println("Tarif Normal\t\t:Rp."+tarif);
                                        System.out.println("Setelah mendapat diskon:Rp."+total);
                                    } else{
                                        tarif = lama*250000;
                                        total=tarif;
                                        System.out.println("Tarif Normal\t\t:Rp."+total);
                                    }
                                        
                                        
                                    System.out.print("Transaksi\t\t:Rp.");
                                    transaksi = Integer.parseInt(input.readLine());
                                    do{
                                        kurang = total - transaksi;
                                        System.err.println("maaf pembayaran anda kurang Rp."+kurang);
                                        System.out.print("Transaksi\t\t:Rp.");
                                        transaksi = Integer.parseInt(input.readLine());
                                    }while(transaksi<total);
                                    
                                    kembali = transaksi-total;
                                    
                                    System.out.println("===============================================");
                                    System.out.println("                STRUK PEMBAYARAN               ");
                                    System.out.println("         PENYEWAAN KOST AREA KAMPUS UTM        ");
                                    System.out.println("           Telang, Jl. Raya Telang             ");
                                    System.out.println("===============================================");
                                    System.out.println("===============================================");
                                    penyewa c = new penyewa();
                                    c.setNama(nama);
                                    c.setNohp(nohp);
                                    c.setEmail(email);
                                    c.setAlamat(alamat);
                                    
                                    katagori k = new katagori();
                                    k.setkatagori(katagori);
                                    System.out.println("  Nama\t\t\t\t:"+c.getNama());               
                                    System.out.println("  No Hp\t\t\t\t:"+c.getNohp());
                                    System.out.println("  Alamat\t\t\t:"+c.getAlamat());
                                    System.out.println("  E-mail\t\t\t:"+c.getEmail());
                                    System.out.println("  Kode Kost\t\t\t:"+kdkost);
                                    System.out.println("  Lama menginap\t\t\t:"+lama+" bulan");
                                    System.out.println("===============================================");
                                    System.out.println("  Total Semua\t\t\t:"+total);
                                    System.out.println("  Bayar\t\t\t\t:"+transaksi);
                                    System.out.println("  Kembali\t\t\t:"+kembali);
                                    System.out.println("===============================================");
                                    System.out.println("                     TERIMAKASIH               ");
                                } else{
                                    System.err.println("maaf pilihan anda salah");
                                }
                                break;
                            }
                        case "3":
                            {
                                System.out.println("====== informasi penyewa ======");
                                System.out.print("masukan nama\t\t: ");
                                String nama = input.readLine();
                                System.out.print("No.Hp\t\t\t: ");
                                String nohp = input.readLine();
                                System.out.print("E-mail\t\t\t: ");
                                String email = input.readLine();
                                System.out.print("masukan Alamat\t\t: ");
                                String alamat = input.readLine();
                                System.out.println("1.harian\n2.bulanan");
                                System.out.print("masukan katagori\t: ");
                                String katagori = input.readLine();
                                
                                if ("1".equals(katagori)){
                                    System.out.print("lama menginap\t\t:");
                                    lama = Integer.parseInt(input.readLine());
                                    if (lama > 5){
                                        System.out.println("selamat anda mendapat diskon 5%");
                                        diskon = 0.05;
                                        tarif = lama*10000;
                                        jml_diskon = (int) (diskon*tarif);
                                        total = (int) (tarif - jml_diskon);
                                        System.out.println("Tarif Normal\t\t:Rp."+tarif);
                                        System.out.println("Setelah mendapat diskon:Rp."+total);
                                    } else {
                                        tarif = lama*10000;
                                        total = tarif;
                                        System.out.println("Tarif Normal\t\t:Rp."+total);
                                    }
                                        
                                    System.out.print("Transaksi\t\t:Rp.");
                                    transaksi = Integer.parseInt(input.readLine());
                                    do{
                                        kurang = total - transaksi;
                                        System.err.println("maaf pembayaran anda kurang Rp."+kurang);
                                        System.out.print("Transaksi\t\t:Rp.");
                                        transaksi = Integer.parseInt(input.readLine());
                                    }while(transaksi<total);
                                    
                                    kembali = transaksi-total;
                                    
                                    System.out.println("===============================================");
                                    System.out.println("                STRUK PEMBAYARAN               ");
                                    System.out.println("         PENYEWAAN KOST AREA KAMPUS UTM        ");
                                    System.out.println("           Telang, Jl. Raya Telang             ");
                                    System.out.println("===============================================");
                                    System.out.println("===============================================");
                                    penyewa d = new penyewa();
                                    d.setNama(nama);
                                    d.setNohp(nohp);
                                    d.setEmail(email);
                                    d.setAlamat(alamat);
                                    
                                    katagori k = new katagori();
                                    k.setkatagori(katagori);
                                    System.out.println("  Nama\t\t\t\t:"+d.getNama()); 
                                    System.out.println("  No Hp\t\t\t\t:"+d.getNohp());
                                    System.out.println("  Alamat\t\t\t:"+d.getAlamat());
                                    System.out.println("  E-mail\t\t\t:"+d.getEmail());
                                    System.out.println("  Kode Kost\t\t\t:"+kdkost);
                                    System.out.println("  Lama menginap\t\t\t:"+lama+" hari");
                                    System.out.println("===============================================");
                                    System.out.println("  Total Semua\t\t\t:"+total);
                                    System.out.println("  Bayar\t\t\t\t:"+transaksi);
                                    System.out.println("  Kembali\t\t\t:"+kembali);
                                    System.out.println("===============================================");
                                    System.out.println("                     TERIMAKASIH               ");
                                    
                                } else if("2".equals(katagori)){ 
                                    System.out.print("lama menginap\t\t:");
                                    lama = Integer.parseInt(input.readLine());
                                    if (lama > 6){
                                        System.out.println("selamat anda mendapat diskon 10%");
                                        diskon = 0.1;
                                        tarif = lama*150000;
                                        jml_diskon = (int) (diskon*tarif);
                                        total = (int) (tarif - jml_diskon);
                                        System.out.println("Tarif Normal\t\t:Rp."+tarif);
                                        System.out.println("Setelah mendapat diskon:Rp."+total);
                                    } else{
                                        tarif = lama*150000;
                                        total=tarif;
                                        System.out.println("Tarif Normal\t\t:Rp."+total);
                                    }
                                    
                                    System.out.print("Transaksi\t\t:Rp.");
                                    transaksi = Integer.parseInt(input.readLine());
                                    do{
                                        kurang = total - transaksi;
                                        System.err.println("maaf pembayaran anda kurang Rp."+kurang);
                                        System.out.print("Transaksi\t\t:Rp.");
                                        transaksi = Integer.parseInt(input.readLine());
                                    }while(transaksi<total);
                                    
                                    kembali = transaksi-total;
                                    
                                    System.out.println("===============================================");
                                    System.out.println("                STRUK PEMBAYARAN               ");
                                    System.out.println("         PENYEWAAN KOST AREA KAMPUS UTM        ");
                                    System.out.println("           Telang, Jl. Raya Telang             ");
                                    System.out.println("===============================================");
                                    System.out.println("===============================================");
                                    penyewa e = new penyewa();
                                    e.setNama(nama);
                                    e.setNohp(nohp);
                                    e.setEmail(email);
                                    e.setAlamat(alamat);
                                    
                                    katagori k = new katagori();
                                    k.setkatagori(katagori);
                                    System.out.println("  Nama\t\t\t\t:"+e.getNama());         
                                    System.out.println("  No Hp\t\t\t\t:"+e.getNohp());
                                    System.out.println("  Alamat\t\t\t:"+e.getAlamat());
                                    System.out.println("  Kode Kost\t\t\t:"+kdkost);
                                    System.out.println("  Lama menginap\t\t\t:"+lama+" bulan");
                                    System.out.println("===============================================");
                                    System.out.println("  Total Semua\t\t\t:"+total);
                                    System.out.println("  Bayar\t\t\t\t:"+transaksi);
                                    System.out.println("  Kembali\t\t\t:"+kembali);
                                    System.out.println("===============================================");
                                    System.out.println("                     TERIMAKASIH               ");
                                } else{
                                    System.err.println("maaf pilihan anda salah");
                                }
                                break;
                            }
                        default:
                            System.err.println("maaf kdkost tidak tersedia");
                            break;
                }
                        break;
                    default :
                        System.err.println("pilihan tidak tersedia");
                        return;
                }
                System.out.println("| 0. menu utama");
                System.out.println("| 9. keluar dari aplikasi");
                pil=Integer.parseInt(input.readLine());
            } while (pil < 9);
        } catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
    } 
}