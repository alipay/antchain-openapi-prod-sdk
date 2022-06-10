// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 保司编码
    @NameInMap("mechanism_code")
    @Validation(required = true)
    public String mechanismCode;

    public static QueryInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceRequest self = new QueryInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInsuranceRequest setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
        return this;
    }
    public String getMechanismCode() {
        return this.mechanismCode;
    }

}
