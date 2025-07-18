// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class RiskEvaluationDistrictExtRequest extends TeaModel {
    // 地区编码
    /**
     * <strong>example:</strong>
     * <p> 4301000</p>
     */
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    // 省级编码
    /**
     * <strong>example:</strong>
     * <p>510000</p>
     */
    @NameInMap("prov_code")
    @Validation(required = true)
    public String provCode;

    public static RiskEvaluationDistrictExtRequest build(java.util.Map<String, ?> map) throws Exception {
        RiskEvaluationDistrictExtRequest self = new RiskEvaluationDistrictExtRequest();
        return TeaModel.build(map, self);
    }

    public RiskEvaluationDistrictExtRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public RiskEvaluationDistrictExtRequest setProvCode(String provCode) {
        this.provCode = provCode;
        return this;
    }
    public String getProvCode() {
        return this.provCode;
    }

}
