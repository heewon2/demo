package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ResultVO{
  private int Result;
  private String Msg;

    public ResultVO() {
    }

    public ResultVO(int result, String msg) {
        Result = result;
        Msg = msg;
    }

    public int getResult() {
        return Result;
    }

    public void setResult(int result) {
        Result = result;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }
}


