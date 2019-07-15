package com.example.prabin.expencessmanagement;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;



import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class LoginUITest {

    String  email, password;

    @Before
    public void setup() {
        email = "ayadi@gmail.com";
        password = "test@123";
    }

    @Rule
    public ActivityTestRule<LoginActivity> activityTestRule = new ActivityTestRule<>(
            LoginActivity.class
    );


    @Test
    public void testLogin() {
        Espresso.onView(ViewMatchers.withId(R.id.email))
                .perform(ViewActions.typeText(String.valueOf(email)), ViewActions.closeSoftKeyboard());
        Espresso.onView(withId(R.id.password))
                .perform(ViewActions.typeText(String.valueOf(password)), ViewActions.closeSoftKeyboard());

        Intents.init();
        Espresso.onView(withId(R.id.sign_in_button))
                .perform(ViewActions.click());
        Intents.release();
    }



}
