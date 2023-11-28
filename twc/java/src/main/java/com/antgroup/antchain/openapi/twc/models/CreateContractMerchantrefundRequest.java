// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractMerchantrefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 退款请求对应的第三方ID（也叫退款ID），需保证同一平台方下唯一
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 订单id
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 退款金额（单位：分）
    @NameInMap("refund_amount")
    @Validation(required = true)
    public Long refundAmount;

    // 租赁宝租赁订单号
    @NameInMap("bcl_order_id")
    public String bclOrderId;

    // 租赁订单对应的租户id
    @NameInMap("bcl_tenant_id")
    public String bclTenantId;

    public static CreateContractMerchantrefundRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractMerchantrefundRequest self = new CreateContractMerchantrefundRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractMerchantrefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractMerchantrefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractMerchantrefundRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateContractMerchantrefundRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public CreateContractMerchantrefundRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public CreateContractMerchantrefundRequest setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public CreateContractMerchantrefundRequest setBclOrderId(String bclOrderId) {
        this.bclOrderId = bclOrderId;
        return this;
    }
    public String getBclOrderId() {
        return this.bclOrderId;
    }

    public CreateContractMerchantrefundRequest setBclTenantId(String bclTenantId) {
        this.bclTenantId = bclTenantId;
        return this;
    }
    public String getBclTenantId() {
        return this.bclTenantId;
    }

}
