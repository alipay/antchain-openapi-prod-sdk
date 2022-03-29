// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqConnectorplansingletonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务名称
    @NameInMap("job")
    @Validation(required = true)
    public String job;

    public static QuerySofamqConnectorplansingletonRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqConnectorplansingletonRequest self = new QuerySofamqConnectorplansingletonRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqConnectorplansingletonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqConnectorplansingletonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqConnectorplansingletonRequest setJob(String job) {
        this.job = job;
        return this;
    }
    public String getJob() {
        return this.job;
    }

}
