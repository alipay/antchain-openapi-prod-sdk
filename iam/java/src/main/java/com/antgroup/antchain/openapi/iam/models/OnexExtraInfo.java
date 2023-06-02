// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class OnexExtraInfo extends TeaModel {
    // Onex接口路径
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // Onex接口的HTTP Method
    @NameInMap("method")
    @Validation(required = true)
    public String method;

    public static OnexExtraInfo build(java.util.Map<String, ?> map) throws Exception {
        OnexExtraInfo self = new OnexExtraInfo();
        return TeaModel.build(map, self);
    }

    public OnexExtraInfo setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public OnexExtraInfo setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
