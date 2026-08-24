// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ExecFundPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 资方社会统一信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户履约的期数
    @NameInMap("term_index")
    @Validation(required = true)
    public Long termIndex;

    // 签约串类型 
    // TRANSFER:转账代偿签约串 
    // WITHHOLD:代扣代偿签约串
    @NameInMap("retry_type")
    @Validation(required = true)
    public String retryType;

    public static ExecFundPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecFundPlanRequest self = new ExecFundPlanRequest();
        return TeaModel.build(map, self);
    }

    public ExecFundPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecFundPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecFundPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecFundPlanRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public ExecFundPlanRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ExecFundPlanRequest setTermIndex(Long termIndex) {
        this.termIndex = termIndex;
        return this;
    }
    public Long getTermIndex() {
        return this.termIndex;
    }

    public ExecFundPlanRequest setRetryType(String retryType) {
        this.retryType = retryType;
        return this;
    }
    public String getRetryType() {
        return this.retryType;
    }

}
