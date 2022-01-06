package chuanbi;
/*==========================Câu 1, 2==========================*/


/* Khởi tạo các bảng

DefaultTableModel modelMH, modelSV;
String fMH = "src/de2/controller/.dat";
String fSV = "src/de2/controller/.dat";
List<MonHoc> listMH;
List<SinhVien> listSV;
  
public Main() {
    initComponents();
    String[] mh = {"Mã môn học", "Tên môn học", "Tổng số tiết", "Loại môn học"};
    String[] sv = {"Mã sinh viên", "Tên sinh viên", "Địa chỉ", "SDT"};
    modelMH = new DefaultTableModel(mh, 0);
    modelSV = new DefaultTableModel(sv, 0);
    jTable1.setModel(modelMH);
    jTable2.setModel(modelSV);
    loadMH();
    loadSV();
}
*/

/* Hàm load câu 1, 2

    private void loadMH() {
        File f = new File(fMH);
        if (f.exists()) {
            listMH = IOFile.doc(fMH);
        } else {
            listMH = new ArrayList<>();
        }
        modelMH.setRowCount(0);
        for (MonHoc i : listMH) {
            modelMH.addRow(i.toObject());
        }
    }

    private void loadSV() {
        File f = new File(fSV);
        if (f.exists()) {
            listSV = IOFile.doc(fSV);
        } else {
            listSV = new ArrayList<>();
        }
        modelSV.setRowCount(0);
        for (SinhVien i : listSV) {
            modelSV.addRow(i.toObject());
        }
    }
*/


/* Hàm thêm

    int n = listMH.size();
    if (n > 0) {
        MonHoc.setSma(listMH.get(n - 1).getMa() + 1);
    }
    jTextField1.setText(MonHoc.getSma() + "");
    int ma = Integer.parseInt(jTextField1.getText());

    String ten;
    int tongso;
    try {
        ten = jTextField2.getText();
        if (ten.isEmpty()) {
            throw new TrongException();
        }
        tongso = Integer.parseInt(jTextField3.getText());
        if (tongso < 0) {
            throw new DuongException();
        }
        String loaiMH = jComboBox1.getSelectedItem().toString();
        MonHoc m = new MonHoc(ten, loaiMH, ma, tongso);
        modelMH.addRow(m.toObject());
        listMH.add(m);
    } catch (TrongException e) {
        JOptionPane.showMessageDialog(this, "Tên không để trống!");
        jTextField2.requestFocus();
        return;
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Nhập số!");
        jTextField3.requestFocus();
        return;
    } catch (DuongException e) {
        JOptionPane.showMessageDialog(this, "Nhập số dương!");
        jTextField3.requestFocus();
        return;
    }
*/


/*  Hàm lưu
    IOFile.viet(fMH, listMH);

    Hàm hiển thị
    loadMH();
*/    

/*  Hàm xóa
    int row = jTable1.getSelectedRow();
    if (row >= 0 && row < jTable1.getRowCount()) {
        modelMH.removeRow(row);
        listMH.remove(row);
    } else {
        JOptionPane.showMessageDialog(this, "Chọn hàng cần xóa");
        return;
    }
*/


/*   mouseclick (Cho phần sửa câu 2)

    int row = jTable2.getSelectedRow();
    jTextField4.setText(modelSV.getValueAt(row, 0).toString());
    jTextField5.setText(modelSV.getValueAt(row, 1).toString());
    jTextField6.setText(modelSV.getValueAt(row, 2).toString());
    jTextField7.setText(modelSV.getValueAt(row, 3).toString());
*/    

/*  Hàm sửa
  
    int row = jTable2.getSelectedRow();
    if (row >= 0 && row < jTable2.getRowCount()) {
        try {
            String ten = jTextField5.getText();
            String diachi = jTextField6.getText();
            if (ten.isEmpty()) {
                throw new TrongException();
            }
            String sdt = jTextField7.getText();

            if (!sdt.matches("\\d+")) {
                throw new SDTException();
            }
            SinhVien nv = new SinhVien(Integer.parseInt(jTextField4.getText()), ten, diachi, sdt);
            modelSV.setValueAt(ten, row, 1);
            modelSV.setValueAt(diachi, row, 2);
            modelSV.setValueAt(sdt, row, 3);
            listSV.set(row, nv);
        } catch (SDTException e) {
            JOptionPane.showMessageDialog(this, "Nhập lại sdt");
            jTextField7.requestFocus();
            return;
        } catch (TrongException e) {
            JOptionPane.showMessageDialog(this, "Không để trống");
            jTextField5.requestFocus();
            return;
        }
    }else{
        JOptionPane.showMessageDialog(this, "Chọn sinh viên để sửa");
        return;
    }
*/    


/*  Hàm tìm kiếm

    String key = jTextField8.getText().trim().toLowerCase();
    List<MonHoc> list = new ArrayList<>();
    for (MonHoc d : listMH) {
        if (d.getTen().toLowerCase().contains(key)) {
            list.add(d);
        }
    }
    modelMH.setRowCount(0);
    for (MonHoc i : list){
        modelMH.addRow(i.toObject());
    }
*/

/*==========================Câu 3==========================*/

// Tạo sẵn hàm get cho câu thống kê
// List<QLBH> listQLBH;
// String fQLBH="src/controller/.dat";

/* Trong hàm main:    

    String[] qlbh = {"", "", "", "", ""};
    modelQLBH = new DefaultTableModel(qlbh, 0);
    jTable3.setModel(modelQLBH);

    loadQL();
    //loadDV(); cau 1
    //loadNV(); cau 2
    loadMa();
*/    

/* Hàm bổ trợ

    private void loadQL() {
        File f = new File(fQLBH);
        if (f.exists()) {
            listQLBH = IOFile.doc(fQLBH);
        } else {
            listQLBH = new ArrayList<>();
        }
        modelQLBH.setRowCount(0);
        for (QLBanHang i : listQLBH) {
            modelQLBH.addRow(i.toObject());
        }
    }

    private boolean trungMa(int maDV, int maNV) {
        for (QLBanHang i : listQLBH) {
            if (i.getDv().getMa() == maDV && i.getNv().getMa() == maNV) {
                return true;
            }
        }
        return false;
    }

    private void loadMa() {
        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();
        listDV = IOFile.doc(fDV);
        for (DichVu i : listDV) {
            jComboBox2.addItem(i.getMa() + "");
        }
        listNV = IOFile.doc(fNV);
        for (NhanVien i : listNV) {
            jComboBox3.addItem(i.getMa() + "");
        }
    }

    private DichVu getDichVuTheoMa(int ma) {
        for (DichVu i : listDV) {
            if (i.getMa() == ma) {
                return i;
            }
        }
        return null;
    }

    private NhanVien getNhanVienTheoMa(int ma) {
        for (NhanVien i : listNV) {
            if (i.getMa() == ma) {
                return i;
            }
        }
        return null;
    }
*/


/* Hàm thêm

    int madv = Integer.parseInt(jComboBox2.getSelectedItem().toString());
    int manv = Integer.parseInt(jComboBox3.getSelectedItem().toString());
    if (trungMa(madv, manv)) {
        JOptionPane.showMessageDialog(this, "Trùng mã!");
        jComboBox2.requestFocus();
        return;
    }
    int soluong = 0;
    try {
        soluong = Integer.parseInt(jTextField12.getText());
        if (soluong <= 0) {
            throw new SoDuongException();
        }
        QLBanHang ql = new QLBanHang(getDichVuTheoMa(madv), getNhanVienTheoMa(manv), soluong);
        modelQLBH.addRow(ql.toObject());
        listQLBH.add(ql);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Nhập số!");
        jTextField12.requestFocus();
        return;
    } catch (SoDuongException e) {
        JOptionPane.showMessageDialog(this, "Nhập số dương!");
        jTextField12.requestFocus();
        return;
    }
*/

/* Hàm lưu
    IOFile.viet(fQLBH, listQLBH);

   Nút refresh
    loadMa();

   Hàm hiển thị
    File f = new File(fQLBH);
    if(f.exists()){
        listQLBH = IOFile.doc(fQLBH);
        modelQLBH.setRowCount(0);
        for(QLBanHang i: listQLBH)
            modelQLBH.addRow(i.toObject());
    }
*/
 
/*  Hàm sắp xếp
    if(jRadioButton1.isSelected()){
        Comparator<QLBanHang> mysort = (o1, o2) -> {
            String[] ten1 = o1.getNv().getTen().split("\\s+");
            String[] ten2 = o2.getNv().getTen().split("\\s+");
            if(ten1[ten1.length-1].equalsIgnoreCase(ten2[ten2.length-1])){
                return o1.getNv().getTen().compareToIgnoreCase(o2.getNv().getTen());
            }
            return ten1[ten1.length-1].compareToIgnoreCase(ten2[ten2.length-1]);
        };

        Collections.sort(listQLBH, mysort);
        modelQLBH.setRowCount(0);
        for(QLBanHang i: listQLBH)
            modelQLBH.addRow(i.toObject());
    }
*/

/* Hàm thống kê
    Map<String,Double> m = listQLBH.stream().collect(Collectors.groupingBy(QLBanHang::getMaTen,Collectors.summingDouble(QLBanHang::getLoiNhuan)));
    jTextArea1.setText("Mã\tHọ và tên\tLợi nhuận\n");
    m.forEach((K,V)->{
        jTextArea1.append(K + "\t" + V + "\n");
    });
*/


/*Thống kê*/

//System.out.println("Đếm theo giới tính");
//        Map<Boolean, Long> count = l.stream().collect(Collectors.groupingBy(
//                SinhVien::getGioiTinh, Collectors.counting()
//        ));
//        // In Map
//        for (Boolean i : count.keySet()) {
//            System.out.println(((i) ? "Nam" : "Nữ") + ":" + count.get(i));
//        }
//
//        // Điểm cao nhất theo từng tháng
//        System.out.println("Điểm cao nhất theo từng tháng");
//        Map<Integer, SinhVien> Max = l.stream().collect(Collectors.groupingBy(
//                SinhVien::getThangSinh, Collectors.collectingAndThen(Collectors.reducing(
//                        (SinhVien p1, SinhVien p2) -> p1.getDiem() > p2.getDiem() ? p1 : p2),
//                        Optional::get)
//        ));
//        for (Integer i: Max.keySet()){
//            System.out.println(i + ":" + Max.get(i));
//        }
//        
//        // Điểm cao nhất
//        Optional<SinhVien> max = l.stream().collect.(Collectors.maxBy(Comparator.comparing(SinhVien::getDiem)));
//        System.out.println(max.isPresent()?max.get():"DS rong");

/* Đếm số lần mượn, xuất hiện, ... của thành viên trong bảng quản lý 
    private int demSoLuongSachMuon(int mabandoc) {
        int count = 0;
        for (QLMuon i : lqlmuon) {
            if (i.getBandoc().getMa() == mabandoc) {
                count++;
            }
        }
        return count;
    }

   Xử lý nếu yêu cầu không mượn quá số lần 
        (Trong hàm thêm)

        int sltv = getSachTheoMa(masach).getSoLuong();
        try {
            soluong = Integer.parseInt(jTextField1.getText());
            if (soluong > sltv) {
                JOptionPane.showMessageDialog(this, "Không đủ sách!");
                jTextField1.requestFocus();
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nhập số!");
            jTextField1.requestFocus();
            return;
        }
        String ttrang = jTextField2.getText();
        QLMuon q = new QLMuon(getBanDocTheoMa(mabandoc), getSachTheoMa(masach), soluong, ttrang);
        model.addRow(q.toObject());
        lqlmuon.add(q);
        getSachTheoMa(masach).setSoLuong(sltv - soluong);
        IOFile.viet(fsach, lsach); 
*/