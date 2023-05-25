// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class DeleteImageReposcanstrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 策略ID
    @NameInMap("strategy_id")
    @Validation(required = true)
    public String strategyId;

    public static DeleteImageReposcanstrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageReposcanstrategyRequest self = new DeleteImageReposcanstrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageReposcanstrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteImageReposcanstrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
