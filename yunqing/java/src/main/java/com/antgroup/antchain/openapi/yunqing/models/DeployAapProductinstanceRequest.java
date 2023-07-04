// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class DeployAapProductinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 站点code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // 产品部署参数
    @NameInMap("product_deploy_init_options")
    @Validation(required = true)
    public java.util.List<ProductDeployInitOption> productDeployInitOptions;

    public static DeployAapProductinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployAapProductinstanceRequest self = new DeployAapProductinstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeployAapProductinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeployAapProductinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeployAapProductinstanceRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public DeployAapProductinstanceRequest setProductDeployInitOptions(java.util.List<ProductDeployInitOption> productDeployInitOptions) {
        this.productDeployInitOptions = productDeployInitOptions;
        return this;
    }
    public java.util.List<ProductDeployInitOption> getProductDeployInitOptions() {
        return this.productDeployInitOptions;
    }

}
