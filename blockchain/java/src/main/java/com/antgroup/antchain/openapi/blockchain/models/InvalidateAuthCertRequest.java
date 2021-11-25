// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InvalidateAuthCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证书id
    @NameInMap("cert_id")
    @Validation(required = true)
    public String certId;

    public static InvalidateAuthCertRequest build(java.util.Map<String, ?> map) throws Exception {
        InvalidateAuthCertRequest self = new InvalidateAuthCertRequest();
        return TeaModel.build(map, self);
    }

    public InvalidateAuthCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InvalidateAuthCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InvalidateAuthCertRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

}
