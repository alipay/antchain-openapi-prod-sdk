// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAccountStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户编号（资产方用户唯一标记二选一）
    @NameInMap("custom_no")
    public String customNo;

    // 资产方用户唯一标识（资产方用户唯一标记二选一）
    @NameInMap("open_id")
    public String openId;

    // 查询业务
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    public static QueryDubbridgeAccountStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAccountStatusRequest self = new QueryDubbridgeAccountStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAccountStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeAccountStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeAccountStatusRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeAccountStatusRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgeAccountStatusRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
