// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateSignFlowRequest extends TeaModel {
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

    public static CreateSignFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSignFlowRequest self = new CreateSignFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateSignFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSignFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSignFlowRequest setSignFlowTitle(String signFlowTitle) {
        this.signFlowTitle = signFlowTitle;
        return this;
    }
    public String getSignFlowTitle() {
        return this.signFlowTitle;
    }

    public CreateSignFlowRequest setSignValidity(Long signValidity) {
        this.signValidity = signValidity;
        return this;
    }
    public Long getSignValidity() {
        return this.signValidity;
    }

    public CreateSignFlowRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public CreateSignFlowRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public CreateSignFlowRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public CreateSignFlowRequest setSignAccountList(java.util.List<SignAccount> signAccountList) {
        this.signAccountList = signAccountList;
        return this;
    }
    public java.util.List<SignAccount> getSignAccountList() {
        return this.signAccountList;
    }

    public CreateSignFlowRequest setTemplateInfoList(java.util.List<TemplateInfo> templateInfoList) {
        this.templateInfoList = templateInfoList;
        return this;
    }
    public java.util.List<TemplateInfo> getTemplateInfoList() {
        return this.templateInfoList;
    }

}
