// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class City extends TeaModel {
    // 城市名称
    @NameInMap("city_name")
    @Validation(required = true)
    public String cityName;

    public static City build(java.util.Map<String, ?> map) throws Exception {
        City self = new City();
        return TeaModel.build(map, self);
    }

    public City setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }
    public String getCityName() {
        return this.cityName;
    }

}
