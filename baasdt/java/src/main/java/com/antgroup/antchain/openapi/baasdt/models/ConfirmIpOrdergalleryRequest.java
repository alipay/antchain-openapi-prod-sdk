// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmIpOrdergalleryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 版权方账户链上ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 授权订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    public static ConfirmIpOrdergalleryRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIpOrdergalleryRequest self = new ConfirmIpOrdergalleryRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIpOrdergalleryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmIpOrdergalleryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmIpOrdergalleryRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmIpOrdergalleryRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfirmIpOrdergalleryRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

}
