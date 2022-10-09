package com.laioffer.jupiter.entity.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(builder = Game.Builder.class)

public class Game {

    private Game(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.boxArtUrl = builder.boxArtUrl;
    }

    @JsonProperty("id")
    private final String id;

    @JsonProperty("name")
    private final String name;

    @JsonProperty("box_art_url")
    private final String boxArtUrl;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBoxArtUrl() {
        return boxArtUrl;
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Builder {
        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("box_art_url")
        private String boxArtUrl;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder boxArtUrl(String boxArtUrl) {
            this.boxArtUrl = boxArtUrl;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }
}


//    @JsonProperty("name")
//    public String name;
//
//    @JsonProperty("developer")
//    public String developer;
//
//    @JsonProperty("release_time")
//    public String releaseTime;
//
//    @JsonProperty("website")
//    public String website;
//
//    @JsonProperty("price")
//    public double price;
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDeveloper() {
//        return developer;
//    }
//
//    public String getReleaseTime() {
//        return releaseTime;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public Game(Builder builder) {
//        this.name = builder.name;
//        this.developer = builder.developer;
//        this.releaseTime = builder.releaseTime;
//        this.website = builder.website;
//        this.price = builder.price;
//    }
//
//    public static class Builder {
//        private String name;
//        private String developer;
//        private String releaseTime;
//        private String website;
//        private double price;
//
//        public Builder setName(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Builder setDeveloper(String developer) {
//            this.developer = developer;
//            return this;
//        }
//
//        public Builder setReleaseTime(String releaseTime) {
//            this.releaseTime = releaseTime;
//            return this;
//        }
//
//        public Builder setWebsite(String website) {
//            this.website = website;
//            return this;
//        }
//
//        public Builder setPrice(double price) {
//            this.price = price;
//            return this;
//        }
//
//        public Game build() {
//            return new Game(this);
//        }
//    }


