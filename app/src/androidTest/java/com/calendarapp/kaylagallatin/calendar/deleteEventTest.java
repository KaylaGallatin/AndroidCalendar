package com.calendarapp.kaylagallatin.calendar;

/**
 * Created by Sriven on 12/3/2015.
 */
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
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
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Sriven on 12/5/2015.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class deleteEventTest {

    //Instantiate ActivityTestRule - > with delete_event
    @Rule
    public ActivityTestRule<delete_event> mActivityRule = new ActivityTestRule(delete_event.class);

    //TEST if "Delete Event:" is displayed
    @Test
    public void testDeleteEventDisplayed() {
        onView(withText("Delete Event"))
                .check(matches(isDisplayed()));
    }

    //TEST if "Event Name to Remove: " is displayed
    @Test
    public void testEventNameToRemoveDisplayed() {
        onView(withText("Event Name to Remove: ")) // space needed to work
                .check(matches(isDisplayed()));
    }

    //TEST save delete event button
    @Test
    public void testSaveDeleteEventButton() {
        onView(withId(R.id.saveDeleteEventButton))            // withId(R.id.prevMonth) is a ViewMatcher
                .perform(click());              // click() is a ViewAction
    }

    //TEST To FAIL
    @Test
    public void testFailureByID() {
        onView(withId(23545))
                .check(doesNotExist());
    }
}

