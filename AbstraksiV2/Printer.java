package AbstraksiV2;

public class Printer implements Cetak{
    @Override
    public void print (){
        System.out.println("Mencetak Dokumen.....");
    }

    @Override
    public void scam(){
        System.out.println("Memindai Dokumen......");
    }
}
