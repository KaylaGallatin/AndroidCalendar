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
public class setDateTest {

    //Instantiate ActivityTestRule - > with set_date
    @Rule
    public ActivityTestRule<set_date> mActivityRule = new ActivityTestRule(set_date.class);



    //TEST save button
    @Test
    public void testSaveDateButton() {
        onView(withId(R.id.saveDateButton))
                .perform(click());
    }

    //TEST cancel date button
    @Test
    public void testCancelDateButton() {
        onView(withId(R.id.cancelDateButton))
                .perform(click());
    }

    //TEST if "Set Date" is displayed
    @Test
    public void testSetDateDisplayed() {
        onView(withText("Set Date"))
                .check(matches(isDisplayed()));
    }

    //TEST if "Save" is displayed
    @Test
    public void testSaveDisplayed() {
        onView(withText("Save"))
                .check(matches(isDisplayed()));
    }

    //TEST if "Cancel" is displayed
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

