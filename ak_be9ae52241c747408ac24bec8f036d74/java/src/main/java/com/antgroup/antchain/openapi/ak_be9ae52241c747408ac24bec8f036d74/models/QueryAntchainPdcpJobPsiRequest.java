// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class QueryAntchainPdcpJobPsiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("job_id")
    @Validation(required = true, minLength = 1)
    public String jobId;

    public static QueryAntchainPdcpJobPsiRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainPdcpJobPsiRequest self = new QueryAntchainPdcpJobPsiRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainPdcpJobPsiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainPdcpJobPsiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainPdcpJobPsiRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
