// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListXrXrverificationmodelinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 资源id
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 核销类型
    @NameInMap("xr_verification_type")
    @Validation(required = true)
    public String xrVerificationType;

    public static ListXrXrverificationmodelinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListXrXrverificationmodelinstanceRequest self = new ListXrXrverificationmodelinstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListXrXrverificationmodelinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListXrXrverificationmodelinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListXrXrverificationmodelinstanceRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public ListXrXrverificationmodelinstanceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListXrXrverificationmodelinstanceRequest setXrVerificationType(String xrVerificationType) {
        this.xrVerificationType = xrVerificationType;
        return this;
    }
    public String getXrVerificationType() {
        return this.xrVerificationType;
    }

}
