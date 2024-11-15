// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class GetProductSaassdkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 共享能力码
    @NameInMap("saas_code")
    @Validation(required = true)
    public String saasCode;

    public static GetProductSaassdkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductSaassdkRequest self = new GetProductSaassdkRequest();
        return TeaModel.build(map, self);
    }

    public GetProductSaassdkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetProductSaassdkRequest setSaasCode(String saasCode) {
        this.saasCode = saasCode;
        return this;
    }
    public String getSaasCode() {
        return this.saasCode;
    }

}
