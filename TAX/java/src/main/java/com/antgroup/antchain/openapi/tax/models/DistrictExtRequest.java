// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class DistrictExtRequest extends TeaModel {
    // 地区编码
    /**
     * <strong>example:</strong>
     * <p>340909</p>
     */
    @NameInMap("city_code")
    public String cityCode;

    // 省或者直辖市代码
    /**
     * <strong>example:</strong>
     * <p>340000</p>
     */
    @NameInMap("prov_code")
    public String provCode;

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

    public DistrictExtRequest setProvCode(String provCode) {
        this.provCode = provCode;
        return this;
    }
    public String getProvCode() {
        return this.provCode;
    }

}
