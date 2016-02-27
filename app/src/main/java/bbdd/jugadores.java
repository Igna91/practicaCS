package bbdd;
import com.ps.grupo2.comunio.Futbolista;

public class jugadores {


    public static boolean saveJugador( Futbolista f){
        return true;
    }

    public static boolean existeJugador(int id){
        return (id>0)?true:false;
    }


}
