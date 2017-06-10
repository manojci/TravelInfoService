package com.bfs.lookup;

import java.util.HashMap;
import java.util.Map;

public enum City {

    /** CHENNAI **/
    CHENNAI("MAA"),
    /** MADURAI **/
    MADURAI("IXM"),
    /** TUTICORIN **/
    TUTICORIN("TCR"),
    /** COIMBATORE **/
    COIMBATORE("CJB"),
    /** GOA **/
    GOA("GOI"),
    /** KOCHI **/
    KOCHI("COK");

    /** value **/
    private final String value;

    /**
     * Constructor
     * @param val enum value
     **/
    private City(String val) {
        this.value = val;
    }

    /**
     * gets value
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * getCityList
     * @return cityMap
     */
    public static Map<String, String> getCityList() {
        Map<String, String> cityMap = new HashMap<String, String>();
        for (City city :City.values()) {
            cityMap.put(city.toString(), city.value);
        }
        return cityMap;
    }
}
