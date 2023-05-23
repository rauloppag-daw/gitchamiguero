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

    @Test
    public void Testfor7(){
        String resultado = GitchamigueroV2.doGitchamiga(7);
        Assert.assertEquals("7",resultado);
    }

    @Test
    public void Testfor8(){
        String resultado = GitchamigueroV2.doGitchamiga(8);
        Assert.assertEquals("8",resultado);
    }

    @Test
    public void Testfor9(){
        String resultado = GitchamigueroV2.doGitchamiga(9);
        Assert.assertEquals("Gacha",resultado);
    }
    @Test
    public void Testfor10(){
        String resultado = GitchamigueroV2.doGitchamiga(10);
        Assert.assertEquals("Miga",resultado);
    }
}
