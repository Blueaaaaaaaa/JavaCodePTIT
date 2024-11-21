import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class KhachHang {
    private String maKH; 
    private String tenKH;
    private String gioiTinh; 
    private Date ngaySinh; 
    private String diaChi;
    private static int dem = 1; 
    
    public KhachHang(String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.maKH = String.format("KH%03d", dem++);
        this.tenKH = ten;
        this.gioiTinh = gioiTinh;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy \n");
        this.ngaySinh = sdf.parse(ngaySinh);
        this.diaChi = diaChi;
    }
    
    public String getMaKH() { return maKH; }
    public String getTenKH() { return tenKH; }
    public String getDiaChi() { return diaChi; }
}

class MatHang {
    private String maMH; 
    private String tenMH; 
    private String donViTinh; 
    private int giaMua;
    private int giaBan;
    private static int dem = 1; 
    
    public MatHang(String ten, String dvt, int giaMua, int giaBan) {
        this.maMH = String.format("MH%03d \n", dem++);
        this.tenMH = ten;
        this.donViTinh = dvt;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public String getMaMH() { return maMH; }
    public String getTenMH() { return tenMH; }
    public int getGiaMua() { return giaMua; }
    public int getGiaBan() { return giaBan; }
}

class HoaDon implements Comparable<HoaDon> {
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;
    private static int dem = 1; 
    
    public HoaDon(KhachHang kh, MatHang mh, int sl) {
        this.maHD = String.format("HD%03d \n", dem++);
        this.khachHang = kh;
        this.matHang = mh;
        this.soLuong = sl;
    }
    
    public long getThanhTien() {
        return soLuong * matHang.getGiaBan();
    }
    
    public long getLoiNhuan() {
        return soLuong * (matHang.getGiaBan() - matHang.getGiaMua());
    }
    
    @Override
    public int compareTo(HoaDon o) {
        return -Long.compare(this.getLoiNhuan(), o.getLoiNhuan());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %d %d \n\n", 
            maHD, khachHang.getTenKH(), khachHang.getDiaChi(),
            matHang.getTenMH(), soLuong, getThanhTien(), getLoiNhuan());
    }
}

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        Map<String, KhachHang> mapKH = new HashMap<>();
        for(int i = 0; i < n; i++) {
            KhachHang kh = new KhachHang(sc.nextLine(), sc.nextLine(), 
                                       sc.nextLine(), sc.nextLine());
            mapKH.put(kh.getMaKH(), kh);
        }
        
        int m = Integer.parseInt(sc.nextLine());
        Map<String, MatHang> mapMH = new HashMap<>();
        for(int i = 0; i < m; i++) {
            MatHang mh = new MatHang(sc.nextLine(), sc.nextLine(),
                                   Integer.parseInt(sc.nextLine()),
                                   Integer.parseInt(sc.nextLine()));
            mapMH.put(mh.getMaMH(), mh);
        }
        
        int k = Integer.parseInt(sc.nextLine());
        List<HoaDon> dsHD = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            String[] line = sc.nextLine().split(" ");
            HoaDon hd = new HoaDon(mapKH.get(line[0]), 
                                  mapMH.get(line[1]),
                                  Integer.parseInt(line[2]));
            dsHD.add(hd);
        }
        
        Collections.sort(dsHD);
        for(HoaDon hd : dsHD) {
            System.out.println(hd);
        }
    }
}