// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2d01ff274c3448c2b919937512c80f91.models;

import com.aliyun.tea.*;

public class BindAntcloudCatHuanyuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // huanyu
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static BindAntcloudCatHuanyuRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAntcloudCatHuanyuRequest self = new BindAntcloudCatHuanyuRequest();
        return TeaModel.build(map, self);
    }

    public BindAntcloudCatHuanyuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAntcloudCatHuanyuRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
