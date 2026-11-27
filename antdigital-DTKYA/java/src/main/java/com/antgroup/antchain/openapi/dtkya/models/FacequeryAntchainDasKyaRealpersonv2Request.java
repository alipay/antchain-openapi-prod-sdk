// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class FacequeryAntchainDasKyaRealpersonv2Request extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 刷脸认证单编号
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    public static FacequeryAntchainDasKyaRealpersonv2Request build(java.util.Map<String, ?> map) throws Exception {
        FacequeryAntchainDasKyaRealpersonv2Request self = new FacequeryAntchainDasKyaRealpersonv2Request();
        return TeaModel.build(map, self);
    }

    public FacequeryAntchainDasKyaRealpersonv2Request setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FacequeryAntchainDasKyaRealpersonv2Request setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FacequeryAntchainDasKyaRealpersonv2Request setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
