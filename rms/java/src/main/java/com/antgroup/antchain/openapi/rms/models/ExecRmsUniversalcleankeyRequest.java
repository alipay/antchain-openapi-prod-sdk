// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ExecRmsUniversalcleankeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // req_params
    @NameInMap("req_params")
    @Validation(required = true)
    public java.util.List<KeySet> reqParams;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static ExecRmsUniversalcleankeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRmsUniversalcleankeyRequest self = new ExecRmsUniversalcleankeyRequest();
        return TeaModel.build(map, self);
    }

    public ExecRmsUniversalcleankeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRmsUniversalcleankeyRequest setReqParams(java.util.List<KeySet> reqParams) {
        this.reqParams = reqParams;
        return this;
    }
    public java.util.List<KeySet> getReqParams() {
        return this.reqParams;
    }

    public ExecRmsUniversalcleankeyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
