// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class AddStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 策略id
    @NameInMap("strategy_id")
    public String strategyId;

    // 策略内容
    @NameInMap("content")
    @Validation(required = true)
    public Strategy content;

    // 绑定的集群id
    @NameInMap("cluster_id")
    public java.util.List<String> clusterId;

    public static AddStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStrategyRequest self = new AddStrategyRequest();
        return TeaModel.build(map, self);
    }

    public AddStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public AddStrategyRequest setContent(Strategy content) {
        this.content = content;
        return this;
    }
    public Strategy getContent() {
        return this.content;
    }

    public AddStrategyRequest setClusterId(java.util.List<String> clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public java.util.List<String> getClusterId() {
        return this.clusterId;
    }

}
