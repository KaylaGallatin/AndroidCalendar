package com.calendarapp.kaylagallatin.calendar;

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
 * Created by Sriven on 12/3/2015.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    //Instantiate ActivityTestRule - > with MainActivity
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);
    /*
        @Test
        public void listGoesOverTheFold() {
            onView(withText("Wed")).check(matches(isDisplayed()));
        }
    */
    // TEST THE DAYS OF THE MONTH AND IF IT IS CLICKABLE
    @Test
    public void testIFDayIsClickable1() {
        onView(withText("5"))
                .perform(click());
    }

    // TEST THE DAYS OF THE MONTH AND IF IT IS CLICKABLE
    @Test
    public void testIFDayIsClickable2() {
        onView(withText("26"))
                .perform(click());              // click() is a ViewAction
    }

    //TEST Menu Button
    @Test
    public void testMenuButton() {
        onView(withId(R.id.menu))                // withId(R.id.menu) is a ViewMatcher
                .perform(click());              // click() is a ViewAction
    }

    //TEST add event
    @Test
    public void testEventButton() {
        onView(withId(R.id.addEvent))            // withId(R.id.addEvent) is a ViewMatcher
                .perform(click());              // click() is a ViewAction
    }

    //TEST previous month button
    @Test
    public void testPrevMonthButton() {
        onView(withId(R.id.prevMonth))            // withId(R.id.prevMonth) is a ViewMatcher
                .perform(click());              // click() is a ViewAction
    }

    //TEST next month button
    @Test
    public void testNextMonthButton() {
        onView(withId(R.id.nextMonth))            // withId(R.id.nextMonth) is a ViewMatcher
                .perform(click());              // click() is a ViewAction
    }

    //TEST Current Month Location
    @Test
    public void testCurrentMonthLocation() {
        onView(withId(R.id.currentMonth))               // withId(R.id.menu) is a ViewMatcher
                .check(isLeftOf(withId(R.id.nextMonth)));
    }

    //TEST To FAIL
    @Test
    public void testFailureByID() {
        onView(withId(23545))
                .check(doesNotExist());
    }
}





