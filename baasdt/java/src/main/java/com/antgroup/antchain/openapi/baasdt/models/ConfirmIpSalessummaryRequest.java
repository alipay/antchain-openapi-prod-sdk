// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ConfirmIpSalessummaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求信息
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 订单的数据ID，订单中每个数据ID唯一
    @NameInMap("sales_biz_id")
    @Validation(required = true)
    public String salesBizId;

    // 商户确认则传商户的链上ID；版权方确认或者拒绝则传版权方的链上ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 确认或者拒绝，true确认，false拒绝
    @NameInMap("accept")
    @Validation(required = true)
    public Boolean accept;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static ConfirmIpSalessummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIpSalessummaryRequest self = new ConfirmIpSalessummaryRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmIpSalessummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmIpSalessummaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmIpSalessummaryRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public ConfirmIpSalessummaryRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public ConfirmIpSalessummaryRequest setSalesBizId(String salesBizId) {
        this.salesBizId = salesBizId;
        return this;
    }
    public String getSalesBizId() {
        return this.salesBizId;
    }

    public ConfirmIpSalessummaryRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfirmIpSalessummaryRequest setAccept(Boolean accept) {
        this.accept = accept;
        return this;
    }
    public Boolean getAccept() {
        return this.accept;
    }

    public ConfirmIpSalessummaryRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
