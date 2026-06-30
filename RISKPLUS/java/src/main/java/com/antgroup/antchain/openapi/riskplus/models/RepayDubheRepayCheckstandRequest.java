// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayDubheRepayCheckstandRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用信申请订单号
    @NameInMap("original_order_no")
    @Validation(required = true)
    public String originalOrderNo;

    // 还款类型1:当期结清，2：正常还款3：全部结清
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    public static RepayDubheRepayCheckstandRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayDubheRepayCheckstandRequest self = new RepayDubheRepayCheckstandRequest();
        return TeaModel.build(map, self);
    }

    public RepayDubheRepayCheckstandRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayDubheRepayCheckstandRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayDubheRepayCheckstandRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public RepayDubheRepayCheckstandRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public RepayDubheRepayCheckstandRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
