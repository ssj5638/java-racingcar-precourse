package racinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilTest {

    @Test
    void 자동차이름_길이_제한() {
        assertTrue(ValidationUtil.validCarNameLength("dobby"));
        assertFalse(ValidationUtil.validCarNameLength("helloCar"));
    }
}