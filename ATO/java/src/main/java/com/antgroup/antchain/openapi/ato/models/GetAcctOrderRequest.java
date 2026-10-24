// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetAcctOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 签约单号，长度大于6小于50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 平台商统一社会信用代码，长度大于0小于等于32
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    public static GetAcctOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAcctOrderRequest self = new GetAcctOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetAcctOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAcctOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAcctOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAcctOrderRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

}
