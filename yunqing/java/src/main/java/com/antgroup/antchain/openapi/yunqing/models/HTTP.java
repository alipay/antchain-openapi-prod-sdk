// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class HTTP extends TeaModel {
    // 检查path
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // http schema
    @NameInMap("scheme")
    @Validation(required = true)
    public String scheme;

    // port
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    public static HTTP build(java.util.Map<String, ?> map) throws Exception {
        HTTP self = new HTTP();
        return TeaModel.build(map, self);
    }

    public HTTP setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public HTTP setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public HTTP setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

}
