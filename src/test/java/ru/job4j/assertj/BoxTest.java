package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {
    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere");
    }

    @Test
    void isThisTetrahedron() {
        Box box = new Box(4, 8);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Tetrahedron");
    }

    @Test
    void isThisIntegerSphere() {
        Box box = new Box(0, 10);
        int number = box.getNumberOfVertices();
        assertThat(number).isEqualTo(0)
                .isNotEqualTo(-1);
    }

    @Test
    void isThisIntegerTetrahedron() {
        Box box = new Box(4, 8);
        int number = box.getNumberOfVertices();
        assertThat(number).isEqualTo(4)
                .isNotEqualTo(-1);
    }

    @Test
    void isThisBooleanSphere() {
        Box box = new Box(0, 10);
        boolean logical = box.isExist();
        assertThat(logical).isTrue()
                .isNotEqualTo(false);
    }

    @Test
    void isThisBooleanTetrahedron() {
        Box box = new Box(4, 8);
        boolean logical = box.isExist();
        assertThat(logical).isTrue()
                .isNotEqualTo(false);
    }

    @Test
    void isThisAreaSphere() {
        Box box = new Box(0, 10);
        double area = box.getArea();
        assertThat(area).isGreaterThan(1256.63)
                .isLessThan(1257.00);
    }

    @Test
    void isThisAreaTetrahedron() {
        Box box = new Box(4, 8);
        double area = box.getArea();
        assertThat(area).isGreaterThan(110.85125)
                .isLessThan(110.86);
    }
}