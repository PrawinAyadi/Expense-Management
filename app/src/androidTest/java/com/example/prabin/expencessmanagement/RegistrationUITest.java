package com.example.prabin.expencessmanagement;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static java.util.EnumSet.allOf;

@RunWith(AndroidJUnit4.class)
public class RegistrationUITest {


    String name, email, password, phone, address;

    @Before
    public void setup() {
        name = "prabin";
        phone="854555";
        address="854555";
        email = "prabin@gmail.com";
        password = "test@123";

    }

    @Rule
    public ActivityTestRule<RegisterActivity> activityTestRule = new ActivityTestRule<>(
            RegisterActivity.class
    );


    @Test
    public void testRegistration() {
        Espresso.onView(withId(R.id.fullname))
                .perform(ViewActions.typeText(String.valueOf(name)), ViewActions.closeSoftKeyboard());
        Espresso.onView(withId(R.id.phonenum))
                .perform(ViewActions.typeText(String.valueOf(email)), ViewActions.closeSoftKeyboard());
        Espresso.onView(withId(R.id.address))
                .perform(ViewActions.typeText(String.valueOf(password)), ViewActions.closeSoftKeyboard());
        Espresso.onView(withId(R.id.email))
                .perform(ViewActions.typeText(String.valueOf(email)), ViewActions.closeSoftKeyboard());
        Espresso.onView(withId(R.id.password))
                .perform(ViewActions.typeText(String.valueOf(password)), ViewActions.closeSoftKeyboard());


        Intents.init();
        Espresso.onView(withId(R.id.sign_up_button))
                .perform(ViewActions.click());
        Intents.release();

    }




}
