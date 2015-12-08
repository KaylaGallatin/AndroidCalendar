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
public class WeeklyTest {

    //Instantiate ActivityTestRule - > with weekly_view
    @Rule
    public ActivityTestRule<weekly_view> mActivityRule = new ActivityTestRule(weekly_view.class);


    //TEST Menu Button
    @Test
    public void testMenuButton() {
        onView(withId(R.id.menu))
                .perform(click());
    }

    //TEST add event button
    @Test
    public void testEventButton() {
        onView(withId(R.id.addEvent))
                .perform(click());
    }

    //TEST previous week button
    @Test
    public void testPrevWeekButton() {
        onView(withId(R.id.prevWeek))
                .perform(click());
    }

    //TEST next week button
    @Test
    public void testNextWeekButton() {
        onView(withId(R.id.nextWeek))
                .perform(click());
    }

    //TEST the location of this week
    @Test
    public void testCurrentWeekLocation() {
        onView(withId(R.id.currentWeek))
                .check(isLeftOf(withId(R.id.nextWeek)));
    }

    //TEST To FAIL
    @Test
    public void testFailureByID() {
        onView(withId(23545))
                .check(doesNotExist());
    }
}

