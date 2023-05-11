// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciSimilarfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件下载凭证
    @NameInMap("work_file_id")
    @Validation(required = true)
    public String workFileId;

    public static QueryDciSimilarfileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDciSimilarfileRequest self = new QueryDciSimilarfileRequest();
        return TeaModel.build(map, self);
    }

    public QueryDciSimilarfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDciSimilarfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDciSimilarfileRequest setWorkFileId(String workFileId) {
        this.workFileId = workFileId;
        return this;
    }
    public String getWorkFileId() {
        return this.workFileId;
    }

}
