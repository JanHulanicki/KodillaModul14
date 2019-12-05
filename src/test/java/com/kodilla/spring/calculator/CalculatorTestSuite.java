package com.kodilla.spring.calculator;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class )
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double valueAdd = calculator.add(1,1);
        double valueDiv = calculator.div(1,1);
        double valueMul = calculator.mul(1,1);
        double valueSub = calculator.sub(1,1);
        //Then
        Assert.assertEquals(2, valueAdd,0);
        Assert.assertEquals(1, valueDiv,0);
        Assert.assertEquals(1, valueMul,0);
        Assert.assertEquals(0, valueSub,0);

    }
}
