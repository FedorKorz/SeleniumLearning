package org.example;

import org.testng.annotations.Test;

public class SecondTest {
    @Test(groups = ("Smoke"))
    public void Demo() {
        System.out.println("Test#2 has started");
    }
}
