fun main(args: Array<String>){
    var an=NhanVienChinhThuc()
    var binh=NhanVienThoiVu()
    var luongAn=an.tinhLuong(20)
    println("Luong cua Anh="+luongAn)
    var luongBinh=binh.tinhLuong(3)
    println("Luong cua Binh="+luongBinh)
}
