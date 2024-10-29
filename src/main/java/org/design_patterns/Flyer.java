package org.design_patterns;

public class Flyer extends MarketingMaterial implements CloneableMarketingMaterial{

    public Flyer(String layout, String content, String color) {
        super(layout, content, color);
    }

    @Override
    public Flyer clone() {
        return new Flyer(this.getLayout(), this.getContent(), this.getColor());
    }
}
