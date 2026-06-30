// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeUserUpgradestatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    public String openId;

    // 天枢客户编号
    @NameInMap("customer_no")
    public String customerNo;

    public static QueryDubbridgeUserUpgradestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeUserUpgradestatusRequest self = new QueryDubbridgeUserUpgradestatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeUserUpgradestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeUserUpgradestatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeUserUpgradestatusRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgeUserUpgradestatusRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

}
