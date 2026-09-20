// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeJumpresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求唯一id
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 跳端申请唯一流水号，一个流水号对应一个URL
    @NameInMap("jump_no")
    @Validation(required = true)
    public String jumpNo;

    // 合作方渠道标示,用于区分产品
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    // 拓展信息,json格式字符串
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryDubbridgeJumpresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeJumpresultRequest self = new QueryDubbridgeJumpresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeJumpresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeJumpresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeJumpresultRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeJumpresultRequest setJumpNo(String jumpNo) {
        this.jumpNo = jumpNo;
        return this;
    }
    public String getJumpNo() {
        return this.jumpNo;
    }

    public QueryDubbridgeJumpresultRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryDubbridgeJumpresultRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
