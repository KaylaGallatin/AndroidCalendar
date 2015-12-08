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
import static android.support.test.espresso.assertion.PositionAssertions.isLeftOf;
import static android.support.test.espresso.assertion.PositionAssertions.isRightOf;
import static android.support.test.espresso.assertion.PositionAssertions.isTopAlignedWith;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Sriven on 12/5/2015.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AddEventTest {

    //Instantiate ActivityTestRule - > with add_event
    @Rule
    public ActivityTestRule<add_event> mActivityRule = new ActivityTestRule(add_event.class);



    //TEST end date button
    @Test
    public void testEndDateButton() {
        onView(withId(R.id.selectedEndDate))
                .perform(click());
    }

    //TEST start time  button
    @Test
    public void testStartTimeButton() {
        onView(withId(R.id.selectedStartTime))
                .perform(click());
    }

    //TEST end time button
    @Test
    public void testEndTimeButton() {
        onView(withId(R.id.selectedEndTime))
                .perform(click());
    }

    //TEST if "Date: " is displayed
    @Test
    public void testDateDisplay() {
        onView(withText("Date:"))
                .check(matches(isDisplayed()));
    }

    //TEST if "Time: " is displayed
    @Test
    public void testTimeDisplay() {
        onView(withText("Time:"))
                .check(matches(isDisplayed()));
    }

    //TEST if "Save: " is displayed
    @Test
    public void testSaveDisplay() {
        onView(withText("Save"))
                .check(matches(isDisplayed()));
    }

    //TEST To FAIL
    @Test
    public void testFailureByID() {
        onView(withId(23545))
                .check(doesNotExist());
    }
}

