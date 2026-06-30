// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeLoanUpgradestatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用信申请订单号(资产方)
    @NameInMap("original_order_no")
    public String originalOrderNo;

    // 借据编号
    @NameInMap("receipt_no")
    public String receiptNo;

    public static QueryDubbridgeLoanUpgradestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeLoanUpgradestatusRequest self = new QueryDubbridgeLoanUpgradestatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeLoanUpgradestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeLoanUpgradestatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeLoanUpgradestatusRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public QueryDubbridgeLoanUpgradestatusRequest setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

}
