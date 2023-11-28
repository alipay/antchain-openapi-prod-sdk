// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateBclRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 例如：PROD202312312321301
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 32, minLength = 16)
    public String orderId;

    // 代扣成功的期数, 1,5,7,12
    @NameInMap("term_no")
    @Validation(required = true, maximum = 120, minimum = 1)
    public Long termNo;

    // 退款金额: 单位分, 最小值1, 最大值不能超过当前代扣的总金额, 如果多次退款,本次退款金额加已退款成功的金额不大于当前代扣总金额
    @NameInMap("refund_amount")
    @Validation(required = true, minimum = 1)
    public Long refundAmount;

    // 幂等号，用来保证请求幂等性.
    // 注意：
    // ● clientToken只支持ASCII字符，且不能超过64个字符；
    @NameInMap("client_token")
    @Validation(required = true, maxLength = 64, minLength = 16)
    public String clientToken;

    public static CreateBclRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBclRefundRequest self = new CreateBclRefundRequest();
        return TeaModel.build(map, self);
    }

    public CreateBclRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBclRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBclRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateBclRefundRequest setTermNo(Long termNo) {
        this.termNo = termNo;
        return this;
    }
    public Long getTermNo() {
        return this.termNo;
    }

    public CreateBclRefundRequest setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public CreateBclRefundRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
