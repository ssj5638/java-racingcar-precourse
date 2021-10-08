package racinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilTest {

    @Test
    void 자동차_이름들_길이제한() {
        assertTrue(ValidationUtil.validCarNameLength("uluru,dobby,aveen"));
        assertFalse(ValidationUtil.validCarNameLength("uluru,aveeno,dobby"));
    }

    @Test
    void 이동횟수_입력_숫자만() {
        assertTrue(ValidationUtil.validCountOfRacing("6"));
        assertTrue(ValidationUtil.validCountOfRacing("167"));
        assertFalse(ValidationUtil.validCountOfRacing("test"));
    }
}