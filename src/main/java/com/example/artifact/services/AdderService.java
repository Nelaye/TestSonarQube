package com.example.artifact.services;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

    private int num;
    private String json = "{" +
            "\"lotto\":{" +
            "\"lottoId\":5," +
            "\"winning-numbers\":[2,45,34,23,7,5,3]," +
            "\"winners\":[{ " +
                "\"winnerId\":23," +
                "\"numbers\":[2,45,34,23,3,5]" +
            "},{ " +
                "\"winnerId\":54, " +
                "\"numbers\":[52,3,12,11,18,22]" +
            "}]}}";

    public void baseNum(int base) {
        this.num = base;
    }

    public String getJson(){
        return json;
    }

    public int currentBase() {
        return num;
    }

    public int add(int adder) {
        return this.num + adder;
    }

    public int accumulate(int adder) {
        return this.num += adder;
    }
}
