// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class EmissionsCategoryStatistics extends TeaModel {
    // 排放类型编码
    /**
     * <strong>example:</strong>
     * <p>000001</p>
     */
    @NameInMap("emission_dategory_no")
    @Validation(required = true)
    public String emissionDategoryNo;

    // 排放类型名称
    /**
     * <strong>example:</strong>
     * <p>间接排放</p>
     */
    @NameInMap("emission_category_name")
    @Validation(required = true)
    public String emissionCategoryName;

    // 排放量
    /**
     * <strong>example:</strong>
     * <p>11.22</p>
     */
    @NameInMap("emission")
    @Validation(required = true)
    public String emission;

    // 排放占比，可直接换算成百分数即为百分占比
    /**
     * <strong>example:</strong>
     * <p>0.56</p>
     */
    @NameInMap("rate")
    @Validation(required = true)
    public String rate;

    // 排放量单位
    /**
     * <strong>example:</strong>
     * <p>tCO2e</p>
     */
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

    public EmissionsCategoryStatistics setEmission(String emission) {
        this.emission = emission;
        return this;
    }
    public String getEmission() {
        return this.emission;
    }

    public EmissionsCategoryStatistics setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
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
