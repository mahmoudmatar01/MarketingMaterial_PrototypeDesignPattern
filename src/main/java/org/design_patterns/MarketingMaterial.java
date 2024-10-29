package org.design_patterns;

public class MarketingMaterial {

    private String layout;
    private String content;
    private String color;

    public MarketingMaterial(String layout, String content, String color) {
        this.layout = layout;
        this.content = content;
        this.color = color;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MarketingMaterial{" +
                "layout='" + layout + '\'' +
                ", content='" + content + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
