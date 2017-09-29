package com.example.dd.retrofit1;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("_links")
    private Links Links;
    @SerializedName("id")
    private int id;
    @SerializedName("caption")
    private String caption;
    @SerializedName("league")
    private String league;
    @SerializedName("year")
    private String year;
    @SerializedName("currentMatchday")
    private int currentmatchday;
    @SerializedName("numberOfMatchdays")
    private int numberofmatchdays;
    @SerializedName("numberOfTeams")
    private int numberofteams;
    @SerializedName("numberOfGames")
    private int numberofgames;
    @SerializedName("lastUpdated")
    private String lastupdated;

    public Links getLinks() {
        return Links;
    }

    public void setLinks(Links Links) {
        this.Links = Links;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCurrentmatchday() {
        return currentmatchday;
    }

    public void setCurrentmatchday(int currentmatchday) {
        this.currentmatchday = currentmatchday;
    }

    public int getNumberofmatchdays() {
        return numberofmatchdays;
    }

    public void setNumberofmatchdays(int numberofmatchdays) {
        this.numberofmatchdays = numberofmatchdays;
    }

    public int getNumberofteams() {
        return numberofteams;
    }

    public void setNumberofteams(int numberofteams) {
        this.numberofteams = numberofteams;
    }

    public int getNumberofgames() {
        return numberofgames;
    }

    public void setNumberofgames(int numberofgames) {
        this.numberofgames = numberofgames;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    public static class Self {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class Teams {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class Fixtures {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class Leaguetable {
        @SerializedName("href")
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public static class Links {
        @SerializedName("self")
        private Self self;
        @SerializedName("teams")
        private Teams teams;
        @SerializedName("fixtures")
        private Fixtures fixtures;
        @SerializedName("leagueTable")
        private Leaguetable leaguetable;

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public Teams getTeams() {
            return teams;
        }

        public void setTeams(Teams teams) {
            this.teams = teams;
        }

        public Fixtures getFixtures() {
            return fixtures;
        }

        public void setFixtures(Fixtures fixtures) {
            this.fixtures = fixtures;
        }

        public Leaguetable getLeaguetable() {
            return leaguetable;
        }

        public void setLeaguetable(Leaguetable leaguetable) {
            this.leaguetable = leaguetable;
        }
    }
}
