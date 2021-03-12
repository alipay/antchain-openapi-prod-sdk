// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryStatisticsPortHeightRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    public static QueryStatisticsPortHeightRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsPortHeightRequest self = new QueryStatisticsPortHeightRequest();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsPortHeightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStatisticsPortHeightRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStatisticsPortHeightRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
