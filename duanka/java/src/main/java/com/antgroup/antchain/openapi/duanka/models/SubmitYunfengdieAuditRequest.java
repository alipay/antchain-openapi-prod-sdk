// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class SubmitYunfengdieAuditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 接口调用参数
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 请求头参数
    @NameInMap("headers")
    @Validation(required = true)
    public String headers;

    public static SubmitYunfengdieAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYunfengdieAuditRequest self = new SubmitYunfengdieAuditRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYunfengdieAuditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitYunfengdieAuditRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitYunfengdieAuditRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

}
