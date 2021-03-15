// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVcStatisticsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景码，通常特定的业务场景需要与授权宝约定使用
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 返回分布数据以day为单位的数量，当前此参数保留，只返回7day的分布，后续启用此参数。
    @NameInMap("size")
    public String size;

    public static QueryAuthVcStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVcStatisticsRequest self = new QueryAuthVcStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthVcStatisticsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthVcStatisticsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthVcStatisticsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAuthVcStatisticsRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
