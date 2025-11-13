// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitFundFlowRequest extends TeaModel {
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

    // 资方是否自动签署
    @NameInMap("fund_auto_sign")
    public Boolean fundAutoSign;

    // 模板参数列表，需要传入模板id和对应的渲染参数，如果有多个文件则传入多个值
    @NameInMap("template_list")
    @Validation(required = true)
    public java.util.List<TemplateArgs> templateList;

    // xxx合同
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    public static SubmitFundFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFundFlowRequest self = new SubmitFundFlowRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFundFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitFundFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitFundFlowRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitFundFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SubmitFundFlowRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SubmitFundFlowRequest setMerchantSignTag(String merchantSignTag) {
        this.merchantSignTag = merchantSignTag;
        return this;
    }
    public String getMerchantSignTag() {
        return this.merchantSignTag;
    }

    public SubmitFundFlowRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SubmitFundFlowRequest setFundSignTag(String fundSignTag) {
        this.fundSignTag = fundSignTag;
        return this;
    }
    public String getFundSignTag() {
        return this.fundSignTag;
    }

    public SubmitFundFlowRequest setFundAutoSign(Boolean fundAutoSign) {
        this.fundAutoSign = fundAutoSign;
        return this;
    }
    public Boolean getFundAutoSign() {
        return this.fundAutoSign;
    }

    public SubmitFundFlowRequest setTemplateList(java.util.List<TemplateArgs> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<TemplateArgs> getTemplateList() {
        return this.templateList;
    }

    public SubmitFundFlowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

}
