// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionsCategoryStatistics extends TeaModel {
    // 排放类型编码
    @NameInMap("emission_dategory_no")
    @Validation(required = true)
    public String emissionDategoryNo;

    // 排放类型名称
    @NameInMap("emission_category_name")
    @Validation(required = true)
    public String emissionCategoryName;

    // 排放量
    @NameInMap("emission")
    @Validation(required = true)
    public Long emission;

    // 排放占比，可直接换算成百分数即为百分占比
    @NameInMap("rate")
    @Validation(required = true)
    public Long rate;

    // 排放量单位
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static EmissionsCategoryStatistics build(java.util.Map<String, ?> map) throws Exception {
        EmissionsCategoryStatistics self = new EmissionsCategoryStatistics();
        return TeaModel.build(map, self);
    }

    public EmissionsCategoryStatistics setEmissionDategoryNo(String emissionDategoryNo) {
        this.emissionDategoryNo = emissionDategoryNo;
        return this;
    }
    public String getEmissionDategoryNo() {
        return this.emissionDategoryNo;
    }

    public EmissionsCategoryStatistics setEmissionCategoryName(String emissionCategoryName) {
        this.emissionCategoryName = emissionCategoryName;
        return this;
    }
    public String getEmissionCategoryName() {
        return this.emissionCategoryName;
    }

    public EmissionsCategoryStatistics setEmission(Long emission) {
        this.emission = emission;
        return this;
    }
    public Long getEmission() {
        return this.emission;
    }

    public EmissionsCategoryStatistics setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public EmissionsCategoryStatistics setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
