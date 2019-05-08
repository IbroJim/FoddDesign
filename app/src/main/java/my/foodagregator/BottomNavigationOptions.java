package my.foodagregator;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationOptions {

    public static void setupBottomNavigatiomViewEx(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
        bottomNavigationViewEx.enableAnimation(false);
    }
}
