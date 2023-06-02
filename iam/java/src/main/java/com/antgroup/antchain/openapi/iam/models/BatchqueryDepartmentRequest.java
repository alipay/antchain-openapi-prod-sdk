// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class BatchqueryDepartmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部门唯一码
    @NameInMap("codes")
    public java.util.List<String> codes;

    public static BatchqueryDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryDepartmentRequest self = new BatchqueryDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryDepartmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryDepartmentRequest setCodes(java.util.List<String> codes) {
        this.codes = codes;
        return this;
    }
    public java.util.List<String> getCodes() {
        return this.codes;
    }

}
