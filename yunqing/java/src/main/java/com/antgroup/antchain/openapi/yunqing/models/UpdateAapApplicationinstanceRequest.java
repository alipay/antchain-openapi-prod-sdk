// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class UpdateAapApplicationinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 站点code
    @NameInMap("site_code")
    @Validation(required = true)
    public String siteCode;

    // 应用实例
    @NameInMap("application_instance")
    @Validation(required = true)
    public ApplicationInstance applicationInstance;

    public static UpdateAapApplicationinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAapApplicationinstanceRequest self = new UpdateAapApplicationinstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAapApplicationinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAapApplicationinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAapApplicationinstanceRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public UpdateAapApplicationinstanceRequest setApplicationInstance(ApplicationInstance applicationInstance) {
        this.applicationInstance = applicationInstance;
        return this;
    }
    public ApplicationInstance getApplicationInstance() {
        return this.applicationInstance;
    }

}
