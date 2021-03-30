// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CancelInsurancepolicyUniversalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 投保订单号
    @NameInMap("apply_trade_no")
    @Validation(required = true, maxLength = 50)
    public String applyTradeNo;

    // 保司, 01-华泰, 03-亚太
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 2)
    public String externalChannelCode;

    // 险种, 01-承运人平台责任险
    // 
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 2)
    public String externalProductCode;

    // 保单号
    @NameInMap("pol_no")
    @Validation(required = true, maxLength = 50)
    public String polNo;

    // 退保全局唯一流水号
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    public static CancelInsurancepolicyUniversalRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelInsurancepolicyUniversalRequest self = new CancelInsurancepolicyUniversalRequest();
        return TeaModel.build(map, self);
    }

    public CancelInsurancepolicyUniversalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelInsurancepolicyUniversalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelInsurancepolicyUniversalRequest setApplyTradeNo(String applyTradeNo) {
        this.applyTradeNo = applyTradeNo;
        return this;
    }
    public String getApplyTradeNo() {
        return this.applyTradeNo;
    }

    public CancelInsurancepolicyUniversalRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public CancelInsurancepolicyUniversalRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public CancelInsurancepolicyUniversalRequest setPolNo(String polNo) {
        this.polNo = polNo;
        return this;
    }
    public String getPolNo() {
        return this.polNo;
    }

    public CancelInsurancepolicyUniversalRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
