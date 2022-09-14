// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthSceneAuthstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝会员id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 当前场景id
    @NameInMap("scene_id")
    @Validation(required = true)
    public String sceneId;

    public static QueryAuthSceneAuthstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthSceneAuthstatusRequest self = new QueryAuthSceneAuthstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthSceneAuthstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthSceneAuthstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthSceneAuthstatusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryAuthSceneAuthstatusRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
