import java.util.Random;

public class creditcardnumber {
    public static void main(String[] args) {
        String kartNumarasi = kartNumarasiOlustur();
        System.out.println("Örnek Kredi Kartı Numarası: " + kartNumarasi);
    }

    public static String kartNumarasiOlustur() {
        // İlk 6 hanelik bir BIN  oluştururuz
        StringBuilder binNumber = new StringBuilder("4"); // Visa kartları için başlangıç rakamı 4'tür
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            binNumber.append(random.nextInt(10)); // Rastgele rakam ekle
        }

        // Kalan 10 rakamı rastgele oluştur
        for (int i = 0; i < 10; i++) {
            binNumber.append(random.nextInt(10));
        }

        return binNumber.toString();
    }
}
