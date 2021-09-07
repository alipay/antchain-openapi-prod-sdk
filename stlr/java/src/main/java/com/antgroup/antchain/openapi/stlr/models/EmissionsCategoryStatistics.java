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
    @NameInMap("emissions")
    @Validation(required = true)
    public Long emissions;

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

    public EmissionsCategoryStatistics setEmissions(Long emissions) {
        this.emissions = emissions;
        return this;
    }
    public Long getEmissions() {
        return this.emissions;
    }

}
