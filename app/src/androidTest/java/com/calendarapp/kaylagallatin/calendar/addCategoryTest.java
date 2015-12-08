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
 * Created by Sriven on 12/3/2015.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class addCategoryTest {

    //Instantiate ActivityTestRule - > with add_category
    @Rule
    public ActivityTestRule<add_category> mActivityRule = new ActivityTestRule(add_category.class);

    // Tests if "Add Category" is displayed
    @Test
    public void testAddCategoryIsDisplayed() {
        onView(withText("Add Category"))
                .check(matches(isDisplayed()));
    }

    // Tests if "Category Name to Add: " is displayed
    @Test
    public void testCategoryNameToAddIsDisplayed() {
        onView(withText("Category Name to Add: ")) // space needed to work
                .check(matches(isDisplayed()));
    }

    //Tests if "Category Color: " is displayed
    @Test
    public void testCategoryColorIsDisplayed() {
        onView(withText("Category Color: ")) // space needed to work
                .check(matches(isDisplayed()));
    }

    /* // Error with this test... because of ASCII characters
    @Test
    public void testDiscription4() {
        onView(withText("Category Color Options:<br><font color = 'Maroon'>maroon </font><font color = 'magenta'>magenta </font>\" +\n" +
                "                \"<font color = 'purple'>purple </font><font color = 'red'>red</font> "))
                .check(matches(isDisplayed()));
    }
*/
    //Tests saveAddCategoryButton
    @Test
    public void testSaveAddCategoryButtonWorks() {
        onView(withId(R.id.saveAddCategoryButton))
                .perform(click());
    }

    //TEST To FAIL
    @Test
    public void testFailureByID() {
        onView(withId(23545))
                .check(doesNotExist());
    }
}

