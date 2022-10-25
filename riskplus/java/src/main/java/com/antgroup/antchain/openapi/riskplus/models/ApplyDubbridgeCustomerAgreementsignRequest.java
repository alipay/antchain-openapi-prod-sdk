// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeCustomerAgreementsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 客户编号
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 张三
    @NameInMap("custom_name")
    @Validation(required = true)
    public String customName;

    // 110101xxxxxxxx
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 证件类型
    @NameInMap("id_type")
    public String idType;

    // 资金方编号
    @NameInMap("fund_code")
    public String fundCode;

    public static ApplyDubbridgeCustomerAgreementsignRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeCustomerAgreementsignRequest self = new ApplyDubbridgeCustomerAgreementsignRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeCustomerAgreementsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeCustomerAgreementsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeCustomerAgreementsignRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ApplyDubbridgeCustomerAgreementsignRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public ApplyDubbridgeCustomerAgreementsignRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public ApplyDubbridgeCustomerAgreementsignRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public ApplyDubbridgeCustomerAgreementsignRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public ApplyDubbridgeCustomerAgreementsignRequest setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

}
