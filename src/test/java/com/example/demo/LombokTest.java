package com.example.demo;

import com.example.demo.domain.ResultVO;
import lombok.Data;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by eastflag on 2016-11-04.
 */
public class LombokTest {

    @Ignore
    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO();
        result.setResult(0);
        result.setMsg("hong");
        System.out.println(result);
    }
}