// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetDepartmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部门唯一代码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static GetDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentRequest self = new GetDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public GetDepartmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDepartmentRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
