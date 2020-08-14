package at.ac.tuwien.tiss.course.api;

import lombok.Getter;

public enum Tariff {

    A(1.0f),
    B(0.75f),
    C(0.5f),
    F(1.0f),
    T(1.0f);

    @Getter
    private float percentage;
    Tariff(float percentage) {
        this.percentage = percentage;
    }
}
