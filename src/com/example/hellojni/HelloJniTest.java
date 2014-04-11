package com.example.hellojni;

import android.test.ActivityInstrumentationTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.HelloJni.HelloJniTest \
 * com.example.HelloJni.tests/android.test.InstrumentationTestRunner
 * Testing 1,2,3...
 * This is a branch!!! (after clone and new remote.origin.url)
 */
@SuppressWarnings("deprecation")
public class HelloJniTest extends ActivityInstrumentationTestCase<HelloJni> {

    public HelloJniTest() {
        super("com.example.HelloJni", HelloJni.class);
    }

}
