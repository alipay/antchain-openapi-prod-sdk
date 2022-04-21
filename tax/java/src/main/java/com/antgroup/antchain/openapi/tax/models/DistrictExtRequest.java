// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class DistrictExtRequest extends TeaModel {
    // 地区编码
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    public static DistrictExtRequest build(java.util.Map<String, ?> map) throws Exception {
        DistrictExtRequest self = new DistrictExtRequest();
        return TeaModel.build(map, self);
    }

    public DistrictExtRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

}
