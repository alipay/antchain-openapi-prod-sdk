// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetSignContractcertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("sign_no")
    @Validation(required = true)
    public String signNo;

    public static GetSignContractcertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSignContractcertificateRequest self = new GetSignContractcertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetSignContractcertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSignContractcertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetSignContractcertificateRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

}
