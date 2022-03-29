// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorjobdelayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务名称
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    // connector任务执行计划Id
    // 
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    public static QuerySofamqConnectorjobdelayRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorjobdelayRequest self = new QuerySofamqConnectorjobdelayRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorjobdelayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConnectorjobdelayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConnectorjobdelayRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

    public QuerySofamqConnectorjobdelayRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
