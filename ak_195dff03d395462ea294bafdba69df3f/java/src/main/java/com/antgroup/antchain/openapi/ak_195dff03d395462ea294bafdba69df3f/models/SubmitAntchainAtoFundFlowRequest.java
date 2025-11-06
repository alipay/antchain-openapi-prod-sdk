// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SubmitAntchainAtoFundFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户id
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商家签署tag
    @NameInMap("merchant_sign_tag")
    @Validation(required = true)
    public String merchantSignTag;

    // 资方id
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 资方签署tag
    @NameInMap("fund_sign_tag")
    @Validation(required = true)
    public String fundSignTag;

    // 资方是否自动签署，true则会在商户签署完成后自动归档，false则需要资方调用auth接口后完成归档
    @NameInMap("fund_auto_sign")
    @Validation(required = true)
    public Boolean fundAutoSign;

    // 模板参数列表，需要传入模板id和对应的渲染参数，如果有多个文件则传入多个值
    @NameInMap("template_list")
    @Validation(required = true)
    public java.util.List<TemplateArgs> templateList;

    public static SubmitAntchainAtoFundFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainAtoFundFlowRequest self = new SubmitAntchainAtoFundFlowRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainAtoFundFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntchainAtoFundFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAntchainAtoFundFlowRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitAntchainAtoFundFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SubmitAntchainAtoFundFlowRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SubmitAntchainAtoFundFlowRequest setMerchantSignTag(String merchantSignTag) {
        this.merchantSignTag = merchantSignTag;
        return this;
    }
    public String getMerchantSignTag() {
        return this.merchantSignTag;
    }

    public SubmitAntchainAtoFundFlowRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SubmitAntchainAtoFundFlowRequest setFundSignTag(String fundSignTag) {
        this.fundSignTag = fundSignTag;
        return this;
    }
    public String getFundSignTag() {
        return this.fundSignTag;
    }

    public SubmitAntchainAtoFundFlowRequest setFundAutoSign(Boolean fundAutoSign) {
        this.fundAutoSign = fundAutoSign;
        return this;
    }
    public Boolean getFundAutoSign() {
        return this.fundAutoSign;
    }

    public SubmitAntchainAtoFundFlowRequest setTemplateList(java.util.List<TemplateArgs> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<TemplateArgs> getTemplateList() {
        return this.templateList;
    }

}
