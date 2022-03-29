// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class RetrySofamqConnectorplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // connector任务执行计划
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // Connector任务
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    public static RetrySofamqConnectorplanRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrySofamqConnectorplanRequest self = new RetrySofamqConnectorplanRequest();
        return TeaModel.build(map, self);
    }

    public RetrySofamqConnectorplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetrySofamqConnectorplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RetrySofamqConnectorplanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public RetrySofamqConnectorplanRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

}
