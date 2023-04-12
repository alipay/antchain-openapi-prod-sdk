// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJusticeRightsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件维权记录编号
    @NameInMap("record_id")
    @Validation(required = true)
    public Long recordId;

    public static QueryJusticeRightsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJusticeRightsRequest self = new QueryJusticeRightsRequest();
        return TeaModel.build(map, self);
    }

    public QueryJusticeRightsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryJusticeRightsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryJusticeRightsRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
