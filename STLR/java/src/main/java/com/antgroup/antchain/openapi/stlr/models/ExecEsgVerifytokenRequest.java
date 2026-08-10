// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ExecEsgVerifytokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 碳矩阵签发的一次性凭证。
    @NameInMap("carbon_token")
    @Validation(required = true)
    public String carbonToken;

    public static ExecEsgVerifytokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecEsgVerifytokenRequest self = new ExecEsgVerifytokenRequest();
        return TeaModel.build(map, self);
    }

    public ExecEsgVerifytokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecEsgVerifytokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecEsgVerifytokenRequest setCarbonToken(String carbonToken) {
        this.carbonToken = carbonToken;
        return this;
    }
    public String getCarbonToken() {
        return this.carbonToken;
    }

}
