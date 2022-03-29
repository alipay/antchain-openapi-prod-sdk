// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiPair extends TeaModel {
    // api名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // api版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static ApiPair build(java.util.Map<String, ?> map) throws Exception {
        ApiPair self = new ApiPair();
        return TeaModel.build(map, self);
    }

    public ApiPair setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiPair setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
