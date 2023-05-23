import org.junit.Assert;
import org.junit.Test;

public class GitchamigueroV2Test {
    @Test
    public void Testfor1(){
        String resultado = GitchamigueroV2.doGitchamiga(1);
        Assert.assertEquals("1",resultado);
    }
}
