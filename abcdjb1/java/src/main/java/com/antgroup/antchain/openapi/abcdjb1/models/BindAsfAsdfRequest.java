// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abcdjb1.models;

import com.aliyun.tea.*;

public class BindAsfAsdfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // asf
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static BindAsfAsdfRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAsfAsdfRequest self = new BindAsfAsdfRequest();
        return TeaModel.build(map, self);
    }

    public BindAsfAsdfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAsfAsdfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindAsfAsdfRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
