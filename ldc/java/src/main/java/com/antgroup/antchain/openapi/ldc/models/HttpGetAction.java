// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HttpGetAction extends TeaModel {
    // 健康检查url地址。
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 健康检查端口。
    @NameInMap("port")
    @Validation(required = true)
    public String port;

    // 协议类型，http/https。
    @NameInMap("scheme")
    @Validation(required = true)
    public String scheme;

    public static HttpGetAction build(java.util.Map<String, ?> map) throws Exception {
        HttpGetAction self = new HttpGetAction();
        return TeaModel.build(map, self);
    }

    public HttpGetAction setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public HttpGetAction setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public HttpGetAction setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

}
