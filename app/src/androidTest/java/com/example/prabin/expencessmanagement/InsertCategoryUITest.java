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

@RunWith(AndroidJUnit4.class)
public class InsertCategoryUITest {

    String  category;

    @Before
    public void setup() {
        category = "ayadiPrabin@gmail.com";

    }

    @Rule
    public ActivityTestRule<Tab1> activityTestRule = new ActivityTestRule<>(
            Tab1.class
    );

    @Test
    public void testLogin() {
        Espresso.onView(ViewMatchers.withId(R.id.week_view_category))
                .perform(ViewActions.typeText(String.valueOf(category)), ViewActions.closeSoftKeyboard());
        Intents.init();
        Espresso.onView(withId(R.id.btnAddCategory))
                .perform(ViewActions.click());
        Intents.release();
    }
}