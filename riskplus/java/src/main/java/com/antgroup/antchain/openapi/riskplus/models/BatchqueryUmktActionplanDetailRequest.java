// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktActionplanDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public java.util.List<Long> sceneStrategyId;

    public static BatchqueryUmktActionplanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktActionplanDetailRequest self = new BatchqueryUmktActionplanDetailRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktActionplanDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryUmktActionplanDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryUmktActionplanDetailRequest setSceneStrategyId(java.util.List<Long> sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public java.util.List<Long> getSceneStrategyId() {
        return this.sceneStrategyId;
    }

}
