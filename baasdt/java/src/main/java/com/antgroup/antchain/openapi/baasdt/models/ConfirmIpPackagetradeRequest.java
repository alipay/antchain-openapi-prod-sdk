// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmIpPackagetradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 审核账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 授权订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 是否同意授权
    // 
    @NameInMap("confirm_result")
    @Validation(required = true)
    public Boolean confirmResult;

    public static ConfirmIpPackagetradeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIpPackagetradeRequest self = new ConfirmIpPackagetradeRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIpPackagetradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmIpPackagetradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmIpPackagetradeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmIpPackagetradeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfirmIpPackagetradeRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public ConfirmIpPackagetradeRequest setConfirmResult(Boolean confirmResult) {
        this.confirmResult = confirmResult;
        return this;
    }
    public Boolean getConfirmResult() {
        return this.confirmResult;
    }

}
