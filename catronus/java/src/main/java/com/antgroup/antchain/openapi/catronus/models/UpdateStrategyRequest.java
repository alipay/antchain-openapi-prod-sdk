// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class UpdateStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 策略id
    @NameInMap("strategy_id")
    @Validation(required = true)
    public String strategyId;

    // 策略内容
    @NameInMap("content")
    @Validation(required = true)
    public Strategy content;

    public static UpdateStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStrategyRequest self = new UpdateStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public UpdateStrategyRequest setContent(Strategy content) {
        this.content = content;
        return this;
    }
    public Strategy getContent() {
        return this.content;
    }

}
