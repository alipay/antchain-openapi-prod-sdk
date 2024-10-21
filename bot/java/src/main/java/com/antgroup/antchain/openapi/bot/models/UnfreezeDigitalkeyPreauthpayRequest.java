// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UnfreezeDigitalkeyPreauthpayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对本次解冻操作的附言描述
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // 商户的授权资金订单号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 解冻请求流水号。
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    public static UnfreezeDigitalkeyPreauthpayRequest build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeDigitalkeyPreauthpayRequest self = new UnfreezeDigitalkeyPreauthpayRequest();
        return TeaModel.build(map, self);
    }

    public UnfreezeDigitalkeyPreauthpayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnfreezeDigitalkeyPreauthpayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnfreezeDigitalkeyPreauthpayRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UnfreezeDigitalkeyPreauthpayRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public UnfreezeDigitalkeyPreauthpayRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

}
