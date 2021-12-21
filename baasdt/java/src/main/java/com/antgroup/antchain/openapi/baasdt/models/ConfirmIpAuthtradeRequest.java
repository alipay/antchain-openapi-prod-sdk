// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmIpAuthtradeRequest extends TeaModel {
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
    @NameInMap("confirm_result")
    @Validation(required = true)
    public Boolean confirmResult;

    // 审批信息备注，通过或不通过原因
    @NameInMap("memo")
    public String memo;

    public static ConfirmIpAuthtradeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIpAuthtradeRequest self = new ConfirmIpAuthtradeRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIpAuthtradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmIpAuthtradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmIpAuthtradeRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmIpAuthtradeRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfirmIpAuthtradeRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public ConfirmIpAuthtradeRequest setConfirmResult(Boolean confirmResult) {
        this.confirmResult = confirmResult;
        return this;
    }
    public Boolean getConfirmResult() {
        return this.confirmResult;
    }

    public ConfirmIpAuthtradeRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
