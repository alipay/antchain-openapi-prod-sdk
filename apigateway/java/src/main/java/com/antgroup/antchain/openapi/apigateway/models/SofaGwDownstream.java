// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SofaGwDownstream extends TeaModel {
    // 认证信息
    @NameInMap("auth")
    public java.util.List<SofaGwAuthenticationVO> auth;

    // GET/POST/PUT/DELETE
    @NameInMap("method")
    public String method;

    // 协议
    @NameInMap("schema")
    public String schema;

    // url
    @NameInMap("url")
    public String url;

    // 是否签名
    @NameInMap("verify")
    public Boolean verify;

    public static SofaGwDownstream build(java.util.Map<String, ?> map) throws Exception {
        SofaGwDownstream self = new SofaGwDownstream();
        return TeaModel.build(map, self);
    }

    public SofaGwDownstream setAuth(java.util.List<SofaGwAuthenticationVO> auth) {
        this.auth = auth;
        return this;
    }
    public java.util.List<SofaGwAuthenticationVO> getAuth() {
        return this.auth;
    }

    public SofaGwDownstream setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public SofaGwDownstream setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public SofaGwDownstream setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SofaGwDownstream setVerify(Boolean verify) {
        this.verify = verify;
        return this;
    }
    public Boolean getVerify() {
        return this.verify;
    }

}
