// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class Province extends TeaModel {
    // 省份名称
    @NameInMap("province_name")
    @Validation(required = true)
    public String provinceName;

    public static Province build(java.util.Map<String, ?> map) throws Exception {
        Province self = new Province();
        return TeaModel.build(map, self);
    }

    public Province setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }
    public String getProvinceName() {
        return this.provinceName;
    }

}
