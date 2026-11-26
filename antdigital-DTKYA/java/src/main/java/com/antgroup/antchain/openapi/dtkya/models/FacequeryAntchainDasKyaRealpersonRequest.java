// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class FacequeryAntchainDasKyaRealpersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 刷脸认证单编号
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    public static FacequeryAntchainDasKyaRealpersonRequest build(java.util.Map<String, ?> map) throws Exception {
        FacequeryAntchainDasKyaRealpersonRequest self = new FacequeryAntchainDasKyaRealpersonRequest();
        return TeaModel.build(map, self);
    }

    public FacequeryAntchainDasKyaRealpersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FacequeryAntchainDasKyaRealpersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FacequeryAntchainDasKyaRealpersonRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
