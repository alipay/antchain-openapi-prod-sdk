// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class GetProviderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    public static GetProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProviderRequest self = new GetProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetProviderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetProviderRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

}
