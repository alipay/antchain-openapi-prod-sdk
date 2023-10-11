// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_aafd16538edd4fc0ab50acd01355adb6.models;

import com.aliyun.tea.*;

public class RiskEvaluationDistrictExtRequest extends TeaModel {
    // 地区编码
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

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

}
