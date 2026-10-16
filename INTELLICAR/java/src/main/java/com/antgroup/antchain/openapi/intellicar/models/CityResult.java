// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class CityResult extends TeaModel {
    // 城市Id
    /**
     * <strong>example:</strong>
     * <p>110000</p>
     */
    @NameInMap("city_id")
    @Validation(required = true)
    public String cityId;

    // 城市名称
    /**
     * <strong>example:</strong>
     * <p>北京</p>
     */
    @NameInMap("city_name")
    @Validation(required = true)
    public String cityName;

    public static CityResult build(java.util.Map<String, ?> map) throws Exception {
        CityResult self = new CityResult();
        return TeaModel.build(map, self);
    }

    public CityResult setCityId(String cityId) {
        this.cityId = cityId;
        return this;
    }
    public String getCityId() {
        return this.cityId;
    }

    public CityResult setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

}
