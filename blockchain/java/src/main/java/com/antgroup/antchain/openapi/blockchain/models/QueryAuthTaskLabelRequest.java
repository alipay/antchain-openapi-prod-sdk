// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthTaskLabelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 人群标签
    @NameInMap("tag_code_list")
    @Validation(required = true)
    public java.util.List<String> tagCodeList;

    public static QueryAuthTaskLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthTaskLabelRequest self = new QueryAuthTaskLabelRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthTaskLabelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthTaskLabelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthTaskLabelRequest setTagCodeList(java.util.List<String> tagCodeList) {
        this.tagCodeList = tagCodeList;
        return this;
    }
    public java.util.List<String> getTagCodeList() {
        return this.tagCodeList;
    }

}
