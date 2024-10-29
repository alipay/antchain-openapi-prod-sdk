// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户的订单号，后续用作和保单结果交互
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 风控业务流水号
    @NameInMap("risk_flow_id")
    @Validation(required = true)
    public String riskFlowId;

    // 保险公司枚举，PA：平安保险
    @NameInMap("insure_company_type")
    @Validation(required = true)
    public String insureCompanyType;

    // 保险类型枚举，PERFORMANCE：履约
    @NameInMap("insure_product_type")
    @Validation(required = true)
    public String insureProductType;

    // 投保商品信息列表
    @NameInMap("product_info_list")
    @Validation(required = true)
    public java.util.List<InsureProductInfo> productInfoList;

    // 发货方式枚举，可选值：
    // EXPRESS-物流发货
    // OFFLINE-线下交易
    @NameInMap("delivery_type")
    @Validation(required = true, maxLength = 64)
    public String deliveryType;

    // 公司联系人姓名，RSA 加密传输
    @NameInMap("contact_name")
    @Validation(required = true, maxLength = 1024)
    public String contactName;

    // 公司联系人手机号，RSA 加密传输
    @NameInMap("contact_mobile")
    @Validation(required = true, maxLength = 1024)
    public String contactMobile;

    // 实人认证业务流水号
    @NameInMap("facevrf_flow_id")
    public String facevrfFlowId;

    // 物流单号，非必填参数。如果选择的物流发货方式为 EXPRESS（物流发货），则该字段必填。
    @NameInMap("logistics_number")
    @Validation(maxLength = 64)
    public String logisticsNumber;

    // 交易时间，非必填参数。如果发货方式为 OFFLINE（线下交易），则该字段必填。
    @NameInMap("trade_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tradeTime;

    public static CreateInsureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInsureRequest self = new CreateInsureRequest();
        return TeaModel.build(map, self);
    }

    public CreateInsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInsureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInsureRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateInsureRequest setRiskFlowId(String riskFlowId) {
        this.riskFlowId = riskFlowId;
        return this;
    }
    public String getRiskFlowId() {
        return this.riskFlowId;
    }

    public CreateInsureRequest setInsureCompanyType(String insureCompanyType) {
        this.insureCompanyType = insureCompanyType;
        return this;
    }
    public String getInsureCompanyType() {
        return this.insureCompanyType;
    }

    public CreateInsureRequest setInsureProductType(String insureProductType) {
        this.insureProductType = insureProductType;
        return this;
    }
    public String getInsureProductType() {
        return this.insureProductType;
    }

    public CreateInsureRequest setProductInfoList(java.util.List<InsureProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
        return this;
    }
    public java.util.List<InsureProductInfo> getProductInfoList() {
        return this.productInfoList;
    }

    public CreateInsureRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public CreateInsureRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateInsureRequest setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public CreateInsureRequest setFacevrfFlowId(String facevrfFlowId) {
        this.facevrfFlowId = facevrfFlowId;
        return this;
    }
    public String getFacevrfFlowId() {
        return this.facevrfFlowId;
    }

    public CreateInsureRequest setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber;
        return this;
    }
    public String getLogisticsNumber() {
        return this.logisticsNumber;
    }

    public CreateInsureRequest setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }
    public String getTradeTime() {
        return this.tradeTime;
    }

}
