class CountTheDays{
    public static void main(String[] args) {

        int bulan = 2;
        int tahun = 2024;
        int jumlahHari = 0;

        switch (bulan) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                jumlahHari = 30;
                break;
            case 2:
                if (tahun % 4 == 0)
                    jumlahHari = 29;
                else
                    jumlahHari = 28;
                break;
            default:
                System.out.println("Nilai Tersebut Bukan Bulan.");
                break;
        }
        System.out.println("Jumlah hari = " + jumlahHari);
    }
}