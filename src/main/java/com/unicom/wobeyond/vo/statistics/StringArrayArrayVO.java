package com.unicom.wobeyond.vo.statistics;

public class StringArrayArrayVO {

    private String name;

    private String[] districtArray;

    private int[] countsArray;

    public StringArrayArrayVO() {
    }

    public StringArrayArrayVO(String name, String[] districtArray, int[] countsArray) {
        this.name = name;
        this.districtArray = districtArray;
        this.countsArray = countsArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDistrictArray() {
        return districtArray;
    }

    public void setDistrictArray(String[] districtArray) {
        this.districtArray = districtArray;
    }

    public int[] getCountsArray() {
        return countsArray;
    }

    public void setCountsArray(int[] countsArray) {
        this.countsArray = countsArray;
    }
}
