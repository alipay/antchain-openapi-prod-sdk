// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class Address extends TeaModel {
    // 市级
    /**
     * <strong>example:</strong>
     * <p>110100</p>
     */
    @NameInMap("city")
    @Validation(required = true, maxLength = 6, minLength = 6)
    public String city;

    // 区、县级
    /**
     * <strong>example:</strong>
     * <p>110101</p>
     */
    @NameInMap("district")
    @Validation(maxLength = 6, minLength = 6)
    public String district;

    public static Address build(java.util.Map<String, ?> map) throws Exception {
        Address self = new Address();
        return TeaModel.build(map, self);
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public Address setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

}
