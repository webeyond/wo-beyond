package com.unicom.wobeyond.vo.statistics;

public class StringArrayArrayVO {

    private String name;

    private String[] featureNameArray;

    private int[] countsArray;

    public StringArrayArrayVO() {
    }

    public StringArrayArrayVO(String name, String[] featureNameArray, int[] countsArray) {
        this.name = name;
        this.featureNameArray = featureNameArray;
        this.countsArray = countsArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFeatureNameArray() {
        return featureNameArray;
    }

    public void setFeatureNameArray(String[] featureNameArray) {
        this.featureNameArray = featureNameArray;
    }

    public int[] getCountsArray() {
        return countsArray;
    }

    public void setCountsArray(int[] countsArray) {
        this.countsArray = countsArray;
    }
}
