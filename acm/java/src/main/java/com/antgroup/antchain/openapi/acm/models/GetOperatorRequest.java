// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作员登录名
    @NameInMap("login_name")
    public String loginName;

    // 金融云操作员id
    @NameInMap("operator_id")
    public String operatorId;

    public static GetOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperatorRequest self = new GetOperatorRequest();
        return TeaModel.build(map, self);
    }

    public GetOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOperatorRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetOperatorRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
