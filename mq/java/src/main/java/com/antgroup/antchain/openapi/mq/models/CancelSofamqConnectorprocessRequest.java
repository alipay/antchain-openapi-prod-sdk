// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CancelSofamqConnectorprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务名称
    @NameInMap("job_name")
    @Validation(required = true)
    public String jobName;

    public static CancelSofamqConnectorprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSofamqConnectorprocessRequest self = new CancelSofamqConnectorprocessRequest();
        return TeaModel.build(map, self);
    }

    public CancelSofamqConnectorprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelSofamqConnectorprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelSofamqConnectorprocessRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

}
