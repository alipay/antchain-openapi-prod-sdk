// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryPromoteActivityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 助力活动的活动规则编码
    @NameInMap("promote_id")
    @Validation(required = true)
    public String promoteId;

    // 用户授权token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    public static QueryPromoteActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPromoteActivityRequest self = new QueryPromoteActivityRequest();
        return TeaModel.build(map, self);
    }

    public QueryPromoteActivityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPromoteActivityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPromoteActivityRequest setPromoteId(String promoteId) {
        this.promoteId = promoteId;
        return this;
    }
    public String getPromoteId() {
        return this.promoteId;
    }

    public QueryPromoteActivityRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
