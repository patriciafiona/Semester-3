package repeatstring;

public class nama {
    String nama;
    String tampung="";
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    void repeatString (int r){
        for(int i=0; i<r; i++){
            System.out.print(this.nama);
        }
    }
}
