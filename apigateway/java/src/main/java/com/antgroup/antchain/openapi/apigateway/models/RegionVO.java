// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RegionVO extends TeaModel {
    // region_id
    @NameInMap("id")
    public String id;

    // region名称
    @NameInMap("name")
    public String name;

    public static RegionVO build(java.util.Map<String, ?> map) throws Exception {
        RegionVO self = new RegionVO();
        return TeaModel.build(map, self);
    }

    public RegionVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RegionVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
