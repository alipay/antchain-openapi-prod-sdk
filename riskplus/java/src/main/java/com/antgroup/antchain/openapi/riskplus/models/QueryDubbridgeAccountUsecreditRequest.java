// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAccountUsecreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道号
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 客户编码
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    public static QueryDubbridgeAccountUsecreditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAccountUsecreditRequest self = new QueryDubbridgeAccountUsecreditRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAccountUsecreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeAccountUsecreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeAccountUsecreditRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryDubbridgeAccountUsecreditRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeAccountUsecreditRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

}
