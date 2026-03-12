// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CreateAntchainAtoSignFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户协议
    @NameInMap("sign_flow_title")
    @Validation(required = true)
    public String signFlowTitle;

    // 签署有效期毫秒时间戳，不传默认7天有效期
    @NameInMap("sign_validity")
    public Long signValidity;

    // 签署完成后的跳转链接
    @NameInMap("redirect_url")
    public String redirectUrl;

    // 业务id，可以是订单id或其他业务id
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 签署业务场景
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 签署人列表
    @NameInMap("sign_account_list")
    @Validation(required = true)
    public java.util.List<SignAccount> signAccountList;

    // 签署模板列表
    @NameInMap("template_info_list")
    @Validation(required = true)
    public java.util.List<TemplateInfo> templateInfoList;

    public static CreateAntchainAtoSignFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainAtoSignFlowRequest self = new CreateAntchainAtoSignFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntchainAtoSignFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntchainAtoSignFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntchainAtoSignFlowRequest setSignFlowTitle(String signFlowTitle) {
        this.signFlowTitle = signFlowTitle;
        return this;
    }
    public String getSignFlowTitle() {
        return this.signFlowTitle;
    }

    public CreateAntchainAtoSignFlowRequest setSignValidity(Long signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public Long getSignValidity() {
        return this.signValidity;
    }

    public CreateAntchainAtoSignFlowRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public CreateAntchainAtoSignFlowRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public CreateAntchainAtoSignFlowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public CreateAntchainAtoSignFlowRequest setSignAccountList(java.util.List<SignAccount> signAccountList) {
        this.signAccountList = signAccountList;
        return this;
    }
    public java.util.List<SignAccount> getSignAccountList() {
        return this.signAccountList;
    }

    public CreateAntchainAtoSignFlowRequest setTemplateInfoList(java.util.List<TemplateInfo> templateInfoList) {
        this.templateInfoList = templateInfoList;
        return this;
    }
    public java.util.List<TemplateInfo> getTemplateInfoList() {
        return this.templateInfoList;
    }

}
