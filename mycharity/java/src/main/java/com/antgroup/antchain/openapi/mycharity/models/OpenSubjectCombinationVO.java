// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class OpenSubjectCombinationVO extends TeaModel {
    // 实施内容id
    @NameInMap("id")
    public String id;

    // 实施内容名称
    @NameInMap("name")
    public String name;

    // 实施内容类型
    @NameInMap("type")
    public Long type;

    // 单位
    @NameInMap("unit")
    public String unit;

    // 说明
    @NameInMap("note")
    public String note;

    // 单价是否固定，0:不固定，1:固定
    @NameInMap("price_determined_flag")
    public Long priceDeterminedFlag;

    // 单价
    @NameInMap("price")
    public Long price;

    // 预估发放个数
    @NameInMap("total_num")
    public Long totalNum;

    public static OpenSubjectCombinationVO build(java.util.Map<String, ?> map) throws Exception {
        OpenSubjectCombinationVO self = new OpenSubjectCombinationVO();
        return TeaModel.build(map, self);
    }

    public OpenSubjectCombinationVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpenSubjectCombinationVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenSubjectCombinationVO setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public OpenSubjectCombinationVO setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public OpenSubjectCombinationVO setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public OpenSubjectCombinationVO setPriceDeterminedFlag(Long priceDeterminedFlag) {
        this.priceDeterminedFlag = priceDeterminedFlag;
        return this;
    }
    public Long getPriceDeterminedFlag() {
        return this.priceDeterminedFlag;
    }

    public OpenSubjectCombinationVO setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public OpenSubjectCombinationVO setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

}
