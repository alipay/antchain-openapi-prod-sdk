// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryOrderSettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分账请求单号
    @NameInMap("settle_no")
    @Validation(required = true)
    public String settleNo;

    public static QueryOrderSettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderSettlementRequest self = new QueryOrderSettlementRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderSettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOrderSettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOrderSettlementRequest setSettleNo(String settleNo) {
        this.settleNo = settleNo;
        return this;
    }
    public String getSettleNo() {
        return this.settleNo;
    }

}
