// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CancelDigitalkeyPreauthpayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对本次撤销操作的附言描述
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // 商户的授权资金操作流水号
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 商户的授权资金订单号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    public static CancelDigitalkeyPreauthpayRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDigitalkeyPreauthpayRequest self = new CancelDigitalkeyPreauthpayRequest();
        return TeaModel.build(map, self);
    }

    public CancelDigitalkeyPreauthpayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelDigitalkeyPreauthpayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelDigitalkeyPreauthpayRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CancelDigitalkeyPreauthpayRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public CancelDigitalkeyPreauthpayRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

}
