package org.example;

import org.testng.annotations.*;

public class ThirdTest {
    @Parameters({"URL"})
    @Test
    public void DesktopOne(String urlName) {
        System.out.println("Mobile has started");
        System.out.println(urlName);
    }

    @Test
    public void DesktopSecond() {
        System.out.println("Mobile has started");
    }

    @Test
    public void DesktopThird() {
        System.out.println("Mobile has started");
    }

    @Test
    public void DesktopForth() {
        System.out.println("Mobile has started");
    }

    @Test
    public void DesktopFifth() {
        System.out.println("Mobile has started");
    }

    @Test
    public void DesktopSix() {
        System.out.println("Mobile has started");
    }


    @Test
    public void DesktopSeven() {
        System.out.println("Mobile has started");
    }

    @Test
    public void DesktopEight() {
        System.out.println("Mobile has started");
    }

    @Test
    public void DesktopNine() {
        System.out.println("Mobile has started");
    }

    @Test
    public void DesktopTen() {
        System.out.println("Mobile has started");
    }

    @Test
    public void ScreenOne() {
        System.out.println("Screen has started");
    }

    @Test(groups = ("Smoke"))
    public void ScreenTwo() {
        System.out.println("Screen has started");
    }

    @Test(groups = ("Smoke"))
    public void ScreenThree() {
        System.out.println("Screen has started");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("I've started before class");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("I've started after class");
    }

}
