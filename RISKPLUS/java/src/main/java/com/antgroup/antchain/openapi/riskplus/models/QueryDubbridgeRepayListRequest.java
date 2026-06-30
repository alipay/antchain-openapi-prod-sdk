// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepayListRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 用信申请订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 贴息比例
    @NameInMap("interest_subsidy_ratio")
    public String interestSubsidyRatio;

    // 参考定价
    @NameInMap("reference_ratio")
    public String referenceRatio;

    public static QueryDubbridgeRepayListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepayListRequest self = new QueryDubbridgeRepayListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepayListRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRepayListRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRepayListRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeRepayListRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public QueryDubbridgeRepayListRequest setInterestSubsidyRatio(String interestSubsidyRatio) {
        this.interestSubsidyRatio = interestSubsidyRatio;
        return this;
    }
    public String getInterestSubsidyRatio() {
        return this.interestSubsidyRatio;
    }

    public QueryDubbridgeRepayListRequest setReferenceRatio(String referenceRatio) {
        this.referenceRatio = referenceRatio;
        return this;
    }
    public String getReferenceRatio() {
        return this.referenceRatio;
    }

}
