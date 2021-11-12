// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Tenant extends TeaModel {
    // 租户名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 租户id
    @NameInMap("tanent_id")
    public String tanentId;

    public static Tenant build(java.util.Map<String, ?> map) throws Exception {
        Tenant self = new Tenant();
        return TeaModel.build(map, self);
    }

    public Tenant setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Tenant setTanentId(String tanentId) {
        this.tanentId = tanentId;
        return this;
    }
    public String getTanentId() {
        return this.tanentId;
    }

}
