import org.junit.Assert;
import org.junit.Test;

public class GitchamigueroV2Test {
    @Test
    public void Testfor1(){
        String resultado = GitchamigueroV2.doGitchamiga(1);
        Assert.assertEquals("1",resultado);
    }

    @Test
    public void Testfor2(){
        String resultado = GitchamigueroV2.doGitchamiga(2);
        Assert.assertEquals("2",resultado);
    }

    @Test
    public void Testfor3(){
        String resultado = GitchamigueroV2.doGitchamiga(3);
        Assert.assertEquals("Gacha",resultado);
    }

    @Test
    public void Testfor4(){
        String resultado = GitchamigueroV2.doGitchamiga(4);
        Assert.assertEquals("4",resultado);
    }

    @Test
    public void Testfor5(){
        String resultado = GitchamigueroV2.doGitchamiga(5);
        Assert.assertEquals("Miga",resultado);
    }
    @Test
    public void Testfor6(){
        String resultado = GitchamigueroV2.doGitchamiga(6);
        Assert.assertEquals("Gacha",resultado);
    }
}
