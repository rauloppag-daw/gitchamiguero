public class GitchamigueroV4 {
    static String catar(int valor){
        String resultado = valor+"";

        if(valor % 3 == 0){
            resultado = "Gacha";
        }

        if(valor % 5 == 0){
            resultado = "Miga";
        }

        if(valor % 15 == 0){
            resultado = "Gachamiga";
        }

        return resultado;
    }

}