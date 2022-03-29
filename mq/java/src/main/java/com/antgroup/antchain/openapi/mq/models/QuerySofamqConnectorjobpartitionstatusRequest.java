// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorjobpartitionstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 作业名称
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    // 实例id
    @NameInMap("plan_id")
    public String planId;

    public static QuerySofamqConnectorjobpartitionstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorjobpartitionstatusRequest self = new QuerySofamqConnectorjobpartitionstatusRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorjobpartitionstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConnectorjobpartitionstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConnectorjobpartitionstatusRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QuerySofamqConnectorjobpartitionstatusRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySofamqConnectorjobpartitionstatusRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

    public QuerySofamqConnectorjobpartitionstatusRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
