// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorjobpartitionstatuscolumnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // connector任务执行计划Id
    // 
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    // connector任务执行计划Id
    // 
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    public static QuerySofamqConnectorjobpartitionstatuscolumnRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorjobpartitionstatuscolumnRequest self = new QuerySofamqConnectorjobpartitionstatuscolumnRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

    public QuerySofamqConnectorjobpartitionstatuscolumnRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
