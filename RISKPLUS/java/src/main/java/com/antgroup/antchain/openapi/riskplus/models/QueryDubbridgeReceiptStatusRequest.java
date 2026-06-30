// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeReceiptStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // open_id
    @NameInMap("open_id")
    public String openId;

    // 客户号
    @NameInMap("custom_no")
    public String customNo;

    public static QueryDubbridgeReceiptStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeReceiptStatusRequest self = new QueryDubbridgeReceiptStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeReceiptStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeReceiptStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeReceiptStatusRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgeReceiptStatusRequest setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

}
