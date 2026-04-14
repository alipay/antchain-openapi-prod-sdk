// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CancelUmktCampaignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务唯一id
    @NameInMap("task_uuid")
    @Validation(required = true)
    public String taskUuid;

    public static CancelUmktCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUmktCampaignRequest self = new CancelUmktCampaignRequest();
        return TeaModel.build(map, self);
    }

    public CancelUmktCampaignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelUmktCampaignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelUmktCampaignRequest setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
        return this;
    }
    public String getTaskUuid() {
        return this.taskUuid;
    }

}
