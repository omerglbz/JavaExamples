public class MonkeyInTheIsland {
    /*
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
        Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
        int MuzSayısı =165, hayatta kalmaDays = 0;
        boolean maymunAlive = true;
        */
    //Maymunun kac gun hayatta kalacagini gosteren kod
    //Hayatta kaldigi suerece muz vermelisin(DO While)
    //eger 4 ten az muz kalirsa maymunlar olur
    public static void main(String[] args) {
        int banana = 165, surviveDays = 0;
        boolean maymunAlive = true;
        do {
            banana -= 4;
            surviveDays++;
            if (banana < 4){
                maymunAlive = false;
            }
        }while (maymunAlive);
        System.out.println("Banana is over. Survive days " + surviveDays);
    }

}
