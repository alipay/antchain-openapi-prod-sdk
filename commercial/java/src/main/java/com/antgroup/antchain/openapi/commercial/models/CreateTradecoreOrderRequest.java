// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CreateTradecoreOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // seller
    @NameInMap("seller")
    @Validation(required = true)
    public String seller;

    // 开发环境可以用：0016010039
    @NameInMap("sp_id")
    @Validation(required = true)
    public String spId;

    // product_name
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 开发环境可以用：3000.00  单位是元
    @NameInMap("amt")
    @Validation(required = true)
    public String amt;

    // ccy
    @NameInMap("ccy")
    public String ccy;

    // 固定填写OFFICIAL_SITE
    @NameInMap("order_origin")
    @Validation(required = true)
    public String orderOrigin;

    // LICENSE(软件许可),RENEW(软件许可更新和技术支持),SUBSCRIBE(软件订阅),PRE(包年包月),POST(按量付费),SERVICE(服务型)
    @NameInMap("pay_method")
    @Validation(required = true)
    public String payMethod;

    // order_duration
    @NameInMap("order_duration")
    @Validation(required = true)
    public String orderDuration;

    // commodity_name
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // 开发环境可以用：10007
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // spec_name
    @NameInMap("spec_name")
    @Validation(required = true)
    public String specName;

    // spec_desc
    @NameInMap("spec_desc")
    public String specDesc;

    // order_detail
    @NameInMap("order_detail")
    public String orderDetail;

    // spec_props
    @NameInMap("spec_props")
    @Validation(required = true)
    public java.util.List<Pair> specProps;

    // ext_params
    @NameInMap("ext_params")
    public java.util.List<Pair> extParams;

    public static CreateTradecoreOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTradecoreOrderRequest self = new CreateTradecoreOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateTradecoreOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTradecoreOrderRequest setSeller(String seller) {
        this.seller = seller;
        return this;
    }
    public String getSeller() {
        return this.seller;
    }

    public CreateTradecoreOrderRequest setSpId(String spId) {
        this.spId = spId;
        return this;
    }
    public String getSpId() {
        return this.spId;
    }

    public CreateTradecoreOrderRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateTradecoreOrderRequest setAmt(String amt) {
        this.amt = amt;
        return this;
    }
    public String getAmt() {
        return this.amt;
    }

    public CreateTradecoreOrderRequest setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public CreateTradecoreOrderRequest setOrderOrigin(String orderOrigin) {
        this.orderOrigin = orderOrigin;
        return this;
    }
    public String getOrderOrigin() {
        return this.orderOrigin;
    }

    public CreateTradecoreOrderRequest setPayMethod(String payMethod) {
        this.payMethod = payMethod;
        return this;
    }
    public String getPayMethod() {
        return this.payMethod;
    }

    public CreateTradecoreOrderRequest setOrderDuration(String orderDuration) {
        this.orderDuration = orderDuration;
        return this;
    }
    public String getOrderDuration() {
        return this.orderDuration;
    }

    public CreateTradecoreOrderRequest setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public CreateTradecoreOrderRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public CreateTradecoreOrderRequest setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public CreateTradecoreOrderRequest setSpecDesc(String specDesc) {
        this.specDesc = specDesc;
        return this;
    }
    public String getSpecDesc() {
        return this.specDesc;
    }

    public CreateTradecoreOrderRequest setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
        return this;
    }
    public String getOrderDetail() {
        return this.orderDetail;
    }

    public CreateTradecoreOrderRequest setSpecProps(java.util.List<Pair> specProps) {
        this.specProps = specProps;
        return this;
    }
    public java.util.List<Pair> getSpecProps() {
        return this.specProps;
    }

    public CreateTradecoreOrderRequest setExtParams(java.util.List<Pair> extParams) {
        this.extParams = extParams;
        return this;
    }
    public java.util.List<Pair> getExtParams() {
        return this.extParams;
    }

}
