// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExecUnireleasespiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求方法
    @NameInMap("request_method")
    @Validation(required = true)
    public String requestMethod;

    // 请求参数的 JSON 字符串
    @NameInMap("request_param")
    @Validation(required = true)
    public String requestParam;

    public static ExecUnireleasespiRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecUnireleasespiRequest self = new ExecUnireleasespiRequest();
        return TeaModel.build(map, self);
    }

    public ExecUnireleasespiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecUnireleasespiRequest setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public String getRequestMethod() {
        return this.requestMethod;
    }

    public ExecUnireleasespiRequest setRequestParam(String requestParam) {
        this.requestParam = requestParam;
        return this;
    }
    public String getRequestParam() {
        return this.requestParam;
    }

}
