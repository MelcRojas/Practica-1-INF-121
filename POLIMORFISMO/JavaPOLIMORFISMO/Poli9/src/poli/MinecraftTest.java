package poli;

//Clase principal
public class MinecraftTest {
public static void main(String[] args) {
   BloqueCofre cofre1 = new BloqueCofre("Cofre", 20, 10);
   BloqueCofre cofre2 = new BloqueCofre("Cofre", 30, 15);

   BloqueTnt tnt1 = new BloqueTnt("TNT", 100);
   BloqueTnt tnt2 = new BloqueTnt("TNT", 200);

   BloqueHorno horno1 = new BloqueHorno("Horno", "Gris", 3);
   BloqueHorno horno2 = new BloqueHorno("Horno", "Negro", 5);

   cofre1.accion();
   cofre2.colocar("pared");
   cofre2.romper();

   tnt1.accion();
   tnt2.colocar("suelo");
   tnt2.romper();

   horno1.accion();
   horno2.colocar("pared");
   horno2.romper();
}
}

