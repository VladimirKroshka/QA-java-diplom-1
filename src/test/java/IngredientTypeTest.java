import praktikum.IngredientType;
import org.junit.Assert;
import org.junit.Test;

public class IngredientTypeTest {

    @Test
    public void testIngredientType() {
        Assert.assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
        Assert.assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }
}
