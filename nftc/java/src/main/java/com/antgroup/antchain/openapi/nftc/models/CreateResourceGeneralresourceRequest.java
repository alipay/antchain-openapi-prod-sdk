// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class CreateResourceGeneralresourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小程序的APP ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 业务幂等ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 是否需要生成差量包
    @NameInMap("need_patch")
    @Validation(required = true)
    public Boolean needPatch;

    public static CreateResourceGeneralresourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGeneralresourceRequest self = new CreateResourceGeneralresourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceGeneralresourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateResourceGeneralresourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateResourceGeneralresourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateResourceGeneralresourceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateResourceGeneralresourceRequest setNeedPatch(Boolean needPatch) {
        this.needPatch = needPatch;
        return this;
    }
    public Boolean getNeedPatch() {
        return this.needPatch;
    }

}
