// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitechguard.models;

import com.aliyun.tea.*;

public class QueryAicoguardAdbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 查询向量库的内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 向量库的表名
    @NameInMap("collection_name")
    @Validation(required = true)
    public String collectionName;

    public static QueryAicoguardAdbRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAicoguardAdbRequest self = new QueryAicoguardAdbRequest();
        return TeaModel.build(map, self);
    }

    public QueryAicoguardAdbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAicoguardAdbRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryAicoguardAdbRequest setCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }
    public String getCollectionName() {
        return this.collectionName;
    }

}
