// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class RequestHead extends TeaModel {
    // 请求唯一标识
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 客户身份标识ID
    @NameInMap("secret_id")
    @Validation(required = true)
    public String secretId;

    // 客户签约产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static RequestHead build(java.util.Map<String, ?> map) throws Exception {
        RequestHead self = new RequestHead();
        return TeaModel.build(map, self);
    }

    public RequestHead setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestHead setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public RequestHead setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
