package com.baksoy.sunshine;


import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {

        JSONObject weather = new JSONObject(weatherJsonStr);
        double temperature = weather.getJSONArray("list")
                                    .getJSONObject(dayIndex)
                                    .getJSONObject("temp")
                                    .getDouble("max");
        return temperature;
    }
}
