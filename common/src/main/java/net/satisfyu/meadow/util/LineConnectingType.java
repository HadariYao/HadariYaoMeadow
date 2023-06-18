package net.satisfyu.meadow.util;

import net.minecraft.util.StringIdentifiable;

public enum LineConnectingType implements StringIdentifiable {
    NONE("none"),
    MIDDLE("middle"),
    LEFT("left"),
    RIGHT("right");

    private final String name;

    LineConnectingType(String type) {
        this.name = type;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
