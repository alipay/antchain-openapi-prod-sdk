// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commonrcsmart.models;

import com.aliyun.tea.*;

public class QueryRcApprovalImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 原审核请求ID
    @NameInMap("orig_request_id")
    @Validation(required = true)
    public String origRequestId;

    public static QueryRcApprovalImageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRcApprovalImageRequest self = new QueryRcApprovalImageRequest();
        return TeaModel.build(map, self);
    }

    public QueryRcApprovalImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRcApprovalImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRcApprovalImageRequest setOrigRequestId(String origRequestId) {
        this.origRequestId = origRequestId;
        return this;
    }
    public String getOrigRequestId() {
        return this.origRequestId;
    }

}
