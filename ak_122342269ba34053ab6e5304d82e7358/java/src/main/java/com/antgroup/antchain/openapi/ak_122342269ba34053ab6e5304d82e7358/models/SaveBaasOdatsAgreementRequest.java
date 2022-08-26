// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class SaveBaasOdatsAgreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户是否同意服务协议
    @NameInMap("status")
    public String status;

    public static SaveBaasOdatsAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBaasOdatsAgreementRequest self = new SaveBaasOdatsAgreementRequest();
        return TeaModel.build(map, self);
    }

    public SaveBaasOdatsAgreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBaasOdatsAgreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBaasOdatsAgreementRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
