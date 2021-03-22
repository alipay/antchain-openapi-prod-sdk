// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpGoodsdetailwithchannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础结构
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // ip的链上id
    @NameInMap("ip_ids")
    @Validation(required = true)
    public java.util.List<String> ipIds;

    // 查询的渠道名字
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    public static QueryIpGoodsdetailwithchannelRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpGoodsdetailwithchannelRequest self = new QueryIpGoodsdetailwithchannelRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpGoodsdetailwithchannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpGoodsdetailwithchannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpGoodsdetailwithchannelRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpGoodsdetailwithchannelRequest setIpIds(java.util.List<String> ipIds) {
        this.ipIds = ipIds;
        return this;
    }
    public java.util.List<String> getIpIds() {
        return this.ipIds;
    }

    public QueryIpGoodsdetailwithchannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
