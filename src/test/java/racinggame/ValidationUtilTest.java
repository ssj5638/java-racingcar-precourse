package racinggame;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilTest {

    @Test
    void 자동차이름_길이_제한() {
        assertTrue(ValidationUtil.validCarNameLength("dobby"));
        assertFalse(ValidationUtil.validCarNameLength("helloCar"));
    }

    @Test
    void 스트림으로_자동차_길이_확인() {
        assertTrue(Arrays
                .stream("uluru,dobby,aveen".split(","))
                .allMatch(ValidationUtil::validCarNameLength));
        assertFalse(Arrays
                .stream("uluru,dobby,aveeno".split(","))
                .allMatch(ValidationUtil::validCarNameLength));
    }
}