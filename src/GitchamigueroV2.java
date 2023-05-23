public class GitchamigueroV2 {
    static String doGitchamiga(int valor){

        if(valor % 3 == 0 && valor % 5 == 0){
            return "Gachamiga";
        }

        if(valor % 3 == 0){
            return "Gacha";
        }

        if(valor % 5 == 0){
            return "Miga";
        }

        return valor+"";
    }

}