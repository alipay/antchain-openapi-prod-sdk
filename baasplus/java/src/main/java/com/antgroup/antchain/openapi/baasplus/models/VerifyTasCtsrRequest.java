// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class VerifyTasCtsrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求时间凭证接口返回的ctsr参数
    @NameInMap("ctsr")
    @Validation(required = true)
    public String ctsr;

    public static VerifyTasCtsrRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyTasCtsrRequest self = new VerifyTasCtsrRequest();
        return TeaModel.build(map, self);
    }

    public VerifyTasCtsrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyTasCtsrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyTasCtsrRequest setCtsr(String ctsr) {
        this.ctsr = ctsr;
        return this;
    }
    public String getCtsr() {
        return this.ctsr;
    }

}
