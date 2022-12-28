public class Main {
    public static void main(String[] args) {
        String firstTeam = " Gozo";
        int a = 5;
        int b = 7;
        int c = 9;
        int d = 11;
        int e = 13;
        String secondTeam = "Mdina";
        int f = 4;
        int g = 6;
        int h = 8;
        int i = 10;
        int j = 12;
        int firstteamFrags = (a + b + c + d + e) / 5;
        int secondteamFrags = (f + g + h + i + j) / 5;
        if (firstteamFrags == secondteamFrags) {
            System.out.println("dead heat ");


        }
        if (secondteamFrags > firstteamFrags) {
            System.out.println("Перемогла командa" + " "+  secondTeam + " " + "набрала" + " " + secondteamFrags + " " + "очків");


        } else {
            System.out.println("Перемогла командa"+ " " + firstTeam +" " + "набрала" + " " + firstteamFrags +  " " + "очків");

        }
    }
}



