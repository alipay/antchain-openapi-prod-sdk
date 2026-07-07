// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class SubmitEcarLcaorderwithcustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户信息
    @NameInMap("customer")
    @Validation(required = true)
    public PlatformCustomerSummary customer;

    // 产品信息
    @NameInMap("product")
    @Validation(required = true)
    public EnterpriseProductSummary product;

    // 订单时间，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("order_time")
    @Validation(required = true)
    public String orderTime;

    // 订单金额，订单金额只能为有效数字（整数不得大于10位，小数不得大于6位）
    @NameInMap("order_amount")
    @Validation(required = true)
    public String orderAmount;

    // 来源于三方平台的订单编号
    @NameInMap("source_order_no")
    @Validation(required = true)
    public String sourceOrderNo;

    public static SubmitEcarLcaorderwithcustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEcarLcaorderwithcustomerRequest self = new SubmitEcarLcaorderwithcustomerRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEcarLcaorderwithcustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitEcarLcaorderwithcustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitEcarLcaorderwithcustomerRequest setCustomer(PlatformCustomerSummary customer) {
        this.customer = customer;
        return this;
    }
    public PlatformCustomerSummary getCustomer() {
        return this.customer;
    }

    public SubmitEcarLcaorderwithcustomerRequest setProduct(EnterpriseProductSummary product) {
        this.product = product;
        return this;
    }
    public EnterpriseProductSummary getProduct() {
        return this.product;
    }

    public SubmitEcarLcaorderwithcustomerRequest setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public SubmitEcarLcaorderwithcustomerRequest setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    public String getOrderAmount() {
        return this.orderAmount;
    }

    public SubmitEcarLcaorderwithcustomerRequest setSourceOrderNo(String sourceOrderNo) {
        this.sourceOrderNo = sourceOrderNo;
        return this;
    }
    public String getSourceOrderNo() {
        return this.sourceOrderNo;
    }

}
