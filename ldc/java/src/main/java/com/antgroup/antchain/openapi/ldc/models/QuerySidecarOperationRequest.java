// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySidecarOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运维单号
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 是否带运维单执行详情
    @NameInMap("with_detail")
    public Boolean withDetail;

    public static QuerySidecarOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySidecarOperationRequest self = new QuerySidecarOperationRequest();
        return TeaModel.build(map, self);
    }

    public QuerySidecarOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySidecarOperationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public QuerySidecarOperationRequest setWithDetail(Boolean withDetail) {
        this.withDetail = withDetail;
        return this;
    }
    public Boolean getWithDetail() {
        return this.withDetail;
    }

}
