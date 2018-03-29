class NhanVienChinhThuc:NhanVien(){
    override fun tinhLuong(ngayCong: Int): Double {
        if(ngayCong>=22)
            return 10000000.0
        return 10000000.0-500000*(22-ngayCong)
    }

}