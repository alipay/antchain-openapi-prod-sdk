// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ListXrResourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 核销资源类型
    @NameInMap("xr_verification_type")
    @Validation(required = true)
    public String xrVerificationType;

    public static ListXrResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListXrResourceRequest self = new ListXrResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListXrResourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListXrResourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListXrResourceRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public ListXrResourceRequest setXrVerificationType(String xrVerificationType) {
        this.xrVerificationType = xrVerificationType;
        return this;
    }
    public String getXrVerificationType() {
        return this.xrVerificationType;
    }

}
