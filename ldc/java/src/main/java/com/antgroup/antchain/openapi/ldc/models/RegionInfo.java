// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RegionInfo extends TeaModel {
    // region name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static RegionInfo build(java.util.Map<String, ?> map) throws Exception {
        RegionInfo self = new RegionInfo();
        return TeaModel.build(map, self);
    }

    public RegionInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
