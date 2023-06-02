// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class DeleteDepartmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部门唯一码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static DeleteDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDepartmentRequest self = new DeleteDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDepartmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDepartmentRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
