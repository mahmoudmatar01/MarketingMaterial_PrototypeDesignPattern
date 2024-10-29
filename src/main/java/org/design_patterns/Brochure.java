package org.design_patterns;

public class Brochure extends MarketingMaterial implements CloneableMarketingMaterial{

    public Brochure(String layout, String content, String color) {
        super(layout, content, color);
    }

    @Override
    public Brochure clone() {
        return new Brochure(this.getLayout(), this.getContent(), this.getColor());
    }
}
