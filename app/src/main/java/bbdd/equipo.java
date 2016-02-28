package bbdd;
import com.ps.grupo2.comunio.Futbolista;
import com.ps.grupo2.comunio.Team;

import java.util.ArrayList;

public class equipo {

    public static boolean saveEquipo(Team t){
        return true;
    }

    public static boolean existeEquipo(int id){ return (id>0)?true:false; }


    public static ArrayList<Futbolista> getFutbolistasBD(){
        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        Futbolista futbolista1 = new Futbolista("Pepin", "Defensa", 5, 3, 2, false, false, null, 1);
        futbolistas.add(futbolista1);
        return futbolistas;
    }
}
