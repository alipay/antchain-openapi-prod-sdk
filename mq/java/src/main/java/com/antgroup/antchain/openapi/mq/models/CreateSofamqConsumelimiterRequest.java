// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqConsumelimiterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 限流资源名，由 GROUP@TOPIC 组成
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 限流类型
    // - UNIT：单元限流，指定单元/CELL限流
    @NameInMap("limiter_type")
    @Validation(required = true)
    public String limiterType;

    // 限流值配置，BASE 为基准限流值。
    @NameInMap("tps")
    @Validation(required = true)
    public String tps;

    public static CreateSofamqConsumelimiterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqConsumelimiterRequest self = new CreateSofamqConsumelimiterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqConsumelimiterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqConsumelimiterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqConsumelimiterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqConsumelimiterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSofamqConsumelimiterRequest setLimiterType(String limiterType) {
        this.limiterType = limiterType;
        return this;
    }
    public String getLimiterType() {
        return this.limiterType;
    }

    public CreateSofamqConsumelimiterRequest setTps(String tps) {
        this.tps = tps;
        return this;
    }
    public String getTps() {
        return this.tps;
    }

}
