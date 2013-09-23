package com.tpcstld.jetris;

import android.content.SharedPreferences;

public class Constants {

	public final static String LIGHT_THEME = "light";
	public final static String DARK_THEME = "dark";
	
	public static int getTheme(SharedPreferences settings) {
		String theme = settings.getString("theme", Constants.LIGHT_THEME);
		if (theme.equals(Constants.LIGHT_THEME)) {
			return R.style.LightTheme;
		} else if (theme.equals(Constants.DARK_THEME)) {
			return R.style.DarkTheme;
		}
		return 0;
	}
}