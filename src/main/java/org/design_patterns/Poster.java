package org.design_patterns;

public class Poster extends MarketingMaterial implements CloneableMarketingMaterial{

    public Poster(String layout, String content, String color) {
        super(layout, content, color);
    }

    @Override
    public Poster clone() {
        return new Poster(this.getLayout(), this.getContent(), this.getColor());
    }
}
