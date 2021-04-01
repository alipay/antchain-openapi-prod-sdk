// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVcRealtimeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询目标业务的实时凭证颁发情况
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 最新实时颁发的凭证查看数目，可以不设定，默认返回10个结果，如果整体结果少于10，则按情况返回。
    @NameInMap("size")
    public Long size;

    public static QueryAuthVcRealtimeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVcRealtimeRequest self = new QueryAuthVcRealtimeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthVcRealtimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthVcRealtimeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthVcRealtimeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAuthVcRealtimeRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
