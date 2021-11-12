// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class OpenAPI extends TeaModel {
    // API方法
    @NameInMap("method")
    @Validation(required = true)
    public String method;

    // API版本号
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static OpenAPI build(java.util.Map<String, ?> map) throws Exception {
        OpenAPI self = new OpenAPI();
        return TeaModel.build(map, self);
    }

    public OpenAPI setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public OpenAPI setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
