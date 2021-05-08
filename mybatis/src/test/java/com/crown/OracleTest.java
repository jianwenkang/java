package com.crown;

import com.crown.jdbc.OracleJdbc;
import org.junit.jupiter.api.Test;

public class OracleTest {

    @Test
    public void test() throws Exception {
        OracleJdbc oracleJdbc = new OracleJdbc();
        oracleJdbc.demo1();
    }
}
