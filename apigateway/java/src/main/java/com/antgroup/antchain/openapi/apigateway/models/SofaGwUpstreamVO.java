// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SofaGwUpstreamVO extends TeaModel {
    // GET/POST/PUT/DELETE
    @NameInMap("method")
    public String method;

    // 协议
    @NameInMap("schema")
    public String schema;

    // timeout
    @NameInMap("timeout")
    public Long timeout;

    // url
    @NameInMap("url")
    public String url;

    // 是否签名
    @NameInMap("verify")
    public Boolean verify;

    public static SofaGwUpstreamVO build(java.util.Map<String, ?> map) throws Exception {
        SofaGwUpstreamVO self = new SofaGwUpstreamVO();
        return TeaModel.build(map, self);
    }

    public SofaGwUpstreamVO setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public SofaGwUpstreamVO setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public SofaGwUpstreamVO setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public SofaGwUpstreamVO setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SofaGwUpstreamVO setVerify(Boolean verify) {
        this.verify = verify;
        return this;
    }
    public Boolean getVerify() {
        return this.verify;
    }

}
