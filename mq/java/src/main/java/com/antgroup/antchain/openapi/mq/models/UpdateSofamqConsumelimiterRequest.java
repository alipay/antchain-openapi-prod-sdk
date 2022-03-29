// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UpdateSofamqConsumelimiterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例ID
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 限流类型 - UNIT：单元限流，指定单元/CELL限流
    // 
    @NameInMap("limiter_type")
    @Validation(required = true)
    public String limiterType;

    // 限流资源名，由 GROUP@TOPIC 组成
    // 
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 限流值配置，BASE 为基准限流值。
    @NameInMap("tps")
    @Validation(required = true)
    public String tps;

    public static UpdateSofamqConsumelimiterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSofamqConsumelimiterRequest self = new UpdateSofamqConsumelimiterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSofamqConsumelimiterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSofamqConsumelimiterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSofamqConsumelimiterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSofamqConsumelimiterRequest setLimiterType(String limiterType) {
        this.limiterType = limiterType;
        return this;
    }
    public String getLimiterType() {
        return this.limiterType;
    }

    public UpdateSofamqConsumelimiterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSofamqConsumelimiterRequest setTps(String tps) {
        this.tps = tps;
        return this;
    }
    public String getTps() {
        return this.tps;
    }

}
