// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SyncQuotaInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // quota_instance_ids，从quota.instance.query返回
    @NameInMap("quota_instance_ids")
    @Validation(required = true)
    public java.util.List<String> quotaInstanceIds;

    public static SyncQuotaInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncQuotaInstanceRequest self = new SyncQuotaInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SyncQuotaInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncQuotaInstanceRequest setQuotaInstanceIds(java.util.List<String> quotaInstanceIds) {
        this.quotaInstanceIds = quotaInstanceIds;
        return this;
    }
    public java.util.List<String> getQuotaInstanceIds() {
        return this.quotaInstanceIds;
    }

}
