package se.magnus.microservices.core.product.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataMongoTest
public class ProductServiceImplTest {
    @Test
    public void test(){
        assertEquals(1, 1);
    }
}