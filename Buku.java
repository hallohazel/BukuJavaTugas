public class Buku {
    int id;
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor (optional)
    public Buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public static void main(String[] args) {
        // Membuat objek buku dengan data yang berbeda
        Buku buku1 = new Buku(1, "Pria sigma", "Abimanyu", 1009);
        Buku buku2 = new Buku(2, "Cara coding", "Abimanyu.S", 1999);
        Buku buku3 = new Buku(3, "Coding mudah", "SEORANG LELAKI", 2004);
        Buku buku4 = new Buku(4, "CARA CEPAT KAYA", "BRUCE MANYU", 2008);
        Buku buku5 = new Buku(5, "1984", "George Orwell", 1949);

        // Menampilkan informasi buku
        System.out.println("Buku 1: " + buku1.judul + " oleh " + buku1.pengarang + " (" + buku1.tahunTerbit + ")");
        System.out.println("Buku 2: " + buku2.judul + " oleh " + buku2.pengarang + " (" + buku2.tahunTerbit + ")");
        System.out.println("Buku 3: " + buku3.judul + " oleh " + buku3.pengarang + " (" + buku3.tahunTerbit + ")");
        System.out.println("Buku 4: " + buku4.judul + " oleh " + buku4.pengarang + " (" + buku4.tahunTerbit + ")");
        System.out.println("Buku 5: " + buku5.judul + " oleh " + buku5.pengarang + " (" + buku5.tahunTerbit + ")");
    }
}