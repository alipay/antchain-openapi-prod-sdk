// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class InitAapReleaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要升级的产品实例
    @NameInMap("product_deploy_init_option_request")
    @Validation(required = true)
    public ProductDeployInitOptionRequest productDeployInitOptionRequest;

    // 站点code
    @NameInMap("site_code")
    public String siteCode;

    public static InitAapReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAapReleaseRequest self = new InitAapReleaseRequest();
        return TeaModel.build(map, self);
    }

    public InitAapReleaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAapReleaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAapReleaseRequest setProductDeployInitOptionRequest(ProductDeployInitOptionRequest productDeployInitOptionRequest) {
        this.productDeployInitOptionRequest = productDeployInitOptionRequest;
        return this;
    }
    public ProductDeployInitOptionRequest getProductDeployInitOptionRequest() {
        return this.productDeployInitOptionRequest;
    }

    public InitAapReleaseRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

}
