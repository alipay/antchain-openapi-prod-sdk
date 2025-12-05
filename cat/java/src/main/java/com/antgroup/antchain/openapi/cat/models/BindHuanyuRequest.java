// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cat.models;

import com.aliyun.tea.*;

public class BindHuanyuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // huanyu
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static BindHuanyuRequest build(java.util.Map<String, ?> map) throws Exception {
        BindHuanyuRequest self = new BindHuanyuRequest();
        return TeaModel.build(map, self);
    }

    public BindHuanyuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindHuanyuRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
