package com.stfx.distantatthisinstant;

public enum CityData {
    // All the data assigned to each city
    AJAX("Ajax", 43.8509, -79.0204),
    AURORA("Aurora",44.0065,-79.4504),
    BRAMPTON("Brampton",43.7315,-79.7624),
    BROCK("Brock",44.3376,-79.0954),
    BURLINGTON("Burlington",43.3255,-79.7990),
    CALEDON("Caledon",43.8363,-79.8745),
    CLARINGTON("Clarington",43.9345,-78.6000),
    EAST_GWILLIMBURY("East Gwillimbury",44.1011,-79.4418),
    GEORGINA("Georgina",44.2963,-79.4362),
    HALTON_HILLS("Halton Hills",43.6470,-80.0177),
    KING("King",43.9632,-79.6053),
    MARKHAM("Markham",43.8561,-79.3370),
    MILTON("Milton",43.5183,-79.8774),
    MISSISSAUGA("Mississauga",43.5890,-79.6441),
    NEWMARKET("Newmarket",44.0592,-79.4613),
    OAKVILLE("Oakville",43.4675,-79.6877),
    OSHAWA("Oshawa",43.8971,-78.8658),
    PICKERING("Pickering",43.8384,-79.0868),
    RICHMOND_HILL("Richmond Hill",43.8828,-79.4403),
    SCUGOG("Scugog",44.1294,-78.9741),
    TORONTO("Toronto",43.6532,-79.3832),
    UXBRIDGE("Uxbridge",44.1094,-79.1205),
    VAUGHN("Vaughn",43.8563,-79.5085),
    WHITBY("Whitby",43.8975,-78.9429),
    WHITCHURCH_STOUFFVILLE("Whitchurch-Stouffville",43.9706,-79.2443);

    // Variables
    String name;
    double lat;
    double lon;

    // Constructor
    private CityData (String name, double lat, double lon) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    public String getName() {
        return this.name;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLon() {
        return this.lon;
    }

    // Find by name behaviour
    public static CityData findByName(String name) {
        for (CityData c: CityData.values()) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
}
