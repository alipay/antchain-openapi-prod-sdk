// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ResumeSofamqConnectorplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // connector任务执行计划Id
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // Connector任务名
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    public static ResumeSofamqConnectorplanRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeSofamqConnectorplanRequest self = new ResumeSofamqConnectorplanRequest();
        return TeaModel.build(map, self);
    }

    public ResumeSofamqConnectorplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResumeSofamqConnectorplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResumeSofamqConnectorplanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ResumeSofamqConnectorplanRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

}
