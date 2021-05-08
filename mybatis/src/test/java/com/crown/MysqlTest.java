package com.crown;

import com.crown.jdbc.MysqlJdbc;
import org.junit.jupiter.api.Test;

public class MysqlTest {

    @Test
    public void test() throws Exception {
        MysqlJdbc mysqlJdbc = new MysqlJdbc();
        mysqlJdbc.demo1();
    }

}
