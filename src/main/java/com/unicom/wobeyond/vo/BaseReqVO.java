package com.unicom.wobeyond.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
* @ClassName: BaseRespVO
* @Description: TODO(Controller所有输入VO父类)
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseReqVO {

    private String datebegin;

    private String dateend;

    public String getDatebegin() {
        return datebegin;
    }

    public void setDatebegin(String datebegin) {
        this.datebegin = datebegin;
    }

    public String getDateend() {
        return dateend;
    }

    public void setDateend(String dateend) {
        this.dateend = dateend;
    }
}
