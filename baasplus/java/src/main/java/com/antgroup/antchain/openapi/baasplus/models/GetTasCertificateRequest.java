// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class GetTasCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
    @NameInMap("sn")
    @Validation(required = true)
    public String sn;

    public static GetTasCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTasCertificateRequest self = new GetTasCertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetTasCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTasCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTasCertificateRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
