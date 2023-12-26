// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 标签列表
    @NameInMap("tag_code_list")
    @Validation(required = true)
    public java.util.List<String> tagCodeList;

    public static QueryAuthTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthTaskRequest self = new QueryAuthTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthTaskRequest setTagCodeList(java.util.List<String> tagCodeList) {
        this.tagCodeList = tagCodeList;
        return this;
    }
    public java.util.List<String> getTagCodeList() {
        return this.tagCodeList;
    }

}
