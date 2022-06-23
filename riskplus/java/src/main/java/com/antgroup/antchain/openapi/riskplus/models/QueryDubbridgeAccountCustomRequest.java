// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAccountCustomRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道号
    @NameInMap("channel_code")
    public String channelCode;

    // 客户编码
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    public static QueryDubbridgeAccountCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAccountCustomRequest self = new QueryDubbridgeAccountCustomRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAccountCustomRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeAccountCustomRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeAccountCustomRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryDubbridgeAccountCustomRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

}
