// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtajobdetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // OTA任务ID
    @NameInMap("job_id")
    @Validation(required = true)
    public String jobId;

    public static QueryElectrocarOtajobdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtajobdetailRequest self = new QueryElectrocarOtajobdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtajobdetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarOtajobdetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarOtajobdetailRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
