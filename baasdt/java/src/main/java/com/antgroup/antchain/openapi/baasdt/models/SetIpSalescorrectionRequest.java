// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetIpSalescorrectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 基础请求信息
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 订单的数据ID，订单中每个数据ID唯一
    @NameInMap("sales_biz_id")
    @Validation(required = true)
    public String salesBizId;

    // 数量校正，负数表示减少本次销售数量，但减少后宗销售数量不能小于0。不校正数量则填0.
    @NameInMap("correct_amount")
    @Validation(required = true)
    public Long correctAmount;

    // 销售金额校正，单位元，负数表示减少本次销售金额，但减少后销售金额不能小于0。不校正数量则填0.00。
    @NameInMap("correct_sales")
    @Validation(required = true)
    public String correctSales;

    public static SetIpSalescorrectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIpSalescorrectionRequest self = new SetIpSalescorrectionRequest();
        return TeaModel.build(map, self);
    }

    public SetIpSalescorrectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetIpSalescorrectionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetIpSalescorrectionRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public SetIpSalescorrectionRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public SetIpSalescorrectionRequest setSalesBizId(String salesBizId) {
        this.salesBizId = salesBizId;
        return this;
    }
    public String getSalesBizId() {
        return this.salesBizId;
    }

    public SetIpSalescorrectionRequest setCorrectAmount(Long correctAmount) {
        this.correctAmount = correctAmount;
        return this;
    }
    public Long getCorrectAmount() {
        return this.correctAmount;
    }

    public SetIpSalescorrectionRequest setCorrectSales(String correctSales) {
        this.correctSales = correctSales;
        return this;
    }
    public String getCorrectSales() {
        return this.correctSales;
    }

}
