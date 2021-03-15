// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthOrgStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务类型说明，当前查询的业务类型，不同业务的机构列表不同。
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    public static QueryAuthOrgStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthOrgStatusRequest self = new QueryAuthOrgStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthOrgStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthOrgStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthOrgStatusRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
