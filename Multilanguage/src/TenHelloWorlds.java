//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Hello world!");                 // English
//        System.out.println("नमस्ते दुनिया!");                    // Hindi
//        System.out.println("ஹலோ உலகம்!");                 // Tamil
//        System.out.println("హలో వరల్డ్!");                    // Telugu
//        System.out.println("こんにちは、 世界！");             // Japanese
//        System.out.println("안녕하세요 월드입니다!");             // Korean
//        System.out.println("salve mundi!");                 // Latin
//        System.out.println("नमस्कार संसार!");                   // Nepali
//        System.out.println("ہیلو دنیا والو");               // Urdu
//        System.out.println("Hallå världen!");               // Swedish
//
//    }
//}


public class TenHelloWorlds {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            switch (count) {
                case 1:
                    System.out.println("Hello, World (English)");
                    break;
                case 2:
                    System.out.println("Hola, Mundo (Spanish)");
                    break;
                case 3:
                    System.out.println("Bonjour, Monde (French)");
                    break;
                case 4:
                    System.out.println("Ciao, Mondo (Italian)");
                    break;
                case 5:
                    System.out.println("Hallo, Welt (German)");
                    break;
                case 6:
                    System.out.println("Olá, Mundo (Portuguese)");
                    break;
                case 7:
                    System.out.println("Konnichiwa, Sekai (Japanese)");
                    break;
                case 8:
                    System.out.println("Namaste, Duniya (Hindi)");
                    break;
                case 9:
                    System.out.println("Salam, Dunia (Arabic)");
                    break;
                case 10:
                    System.out.println("Annyeonghaseyo, Sesang (Korean)");
                    break;
                default:
                    System.out.println("Invalid count");
                    break;
            }

            count++;
        }
    }
}
