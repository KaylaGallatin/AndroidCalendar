package com.calendarapp.kaylagallatin.calendar;

/**
 * Created by Sriven on 12/3/2015.
 */
import android.support.test.espresso.ViewAssertion;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeDown;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.assertion.PositionAssertions.isLeftOf;
import static android.support.test.espresso.assertion.PositionAssertions.isRightOf;
import static android.support.test.espresso.assertion.PositionAssertions.isTopAlignedWith;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Sriven on 12/5/2015.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class setTimeTest {

    //Instantiate ActivityTestRule - > with set_time
    @Rule
    public ActivityTestRule<set_time> mActivityRule = new ActivityTestRule(set_time.class);



    //TEST save button
    @Test
    public void testSaveTimeButton() {
        onView(withId(R.id.saveTimeButton))
                .perform(click());
    }

    //TEST cancel Button
    @Test
    public void testCancelTimeButton() {
        onView(withId(R.id.cancelTimeButton))
                .perform(click());
    }

    //TEST time picker is scrollable ( scroll up test )
    @Test
    public void testScrollUpTest() {
        onView(withId(R.id.timePicker))
                .perform(swipeUp());
    }

    //TEST time picker is scrollable ( scroll down test )
    @Test
    public void testScrollDownTest() {
        onView(withId(R.id.timePicker))
                .perform(swipeDown());
    }

    //TEST if "Set Time:" is displayed
    @Test
    public void testSetTimeDisplayed() {
        onView(withText("Set Time"))
                .check(matches(isDisplayed()));
    }

    //TEST if "Save:" is displayed
    @Test
    public void testSaveDisplayed() {
        onView(withText("Save"))
                .check(matches(isDisplayed()));
    }

    //TEST if "Cancel: " is displayed
    @Test
    public void testCancelDisplayed() {
        onView(withText("Cancel"))
                .check(matches(isDisplayed()));
    }

    //TEST To FAIL
    @Test
    public void testFailureByID() {
        onView(withId(23545))
                .check(doesNotExist());
    }
}

