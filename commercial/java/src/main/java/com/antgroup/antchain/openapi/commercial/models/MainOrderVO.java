// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class MainOrderVO extends TeaModel {
    // order_no
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // buyer
    @NameInMap("buyer")
    @Validation(required = true)
    public String buyer;

    // seller
    @NameInMap("seller")
    @Validation(required = true)
    public String seller;

    // sp_id
    @NameInMap("sp_id")
    @Validation(required = true)
    public String spId;

    // login_account
    @NameInMap("login_account")
    @Validation(required = true)
    public String loginAccount;

    // product_name
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // money
    @NameInMap("money")
    @Validation(required = true)
    public MultiCurrencyMoneyVO money;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // gmt_close
    @NameInMap("gmt_close")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtClose;

    // gmt_pay_success
    @NameInMap("gmt_pay_success")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtPaySuccess;

    // order_status
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // order_type
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // order_origin
    @NameInMap("order_origin")
    @Validation(required = true)
    public String orderOrigin;

    // order_level
    @NameInMap("order_level")
    @Validation(required = true)
    public String orderLevel;

    // pay_method
    @NameInMap("pay_method")
    @Validation(required = true)
    public String payMethod;

    // orde_duration
    @NameInMap("order_duration")
    @Validation(required = true)
    public String orderDuration;

    // parent_order_no
    @NameInMap("parent_order_no")
    @Validation(required = true)
    public String parentOrderNo;

    // commodity_name
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // spec_code
    @NameInMap("spec_code")
    @Validation(required = true)
    public String specCode;

    // spec_name
    @NameInMap("spec_name")
    @Validation(required = true)
    public String specName;

    // spec_desc
    @NameInMap("spec_desc")
    @Validation(required = true)
    public String specDesc;

    // order_detail
    @NameInMap("order_detail")
    @Validation(required = true)
    public String orderDetail;

    // sub_order_include
    @NameInMap("sub_order_include")
    @Validation(required = true)
    public Boolean subOrderInclude;

    // spec_props
    @NameInMap("spec_props")
    @Validation(required = true)
    public java.util.List<Pair> specProps;

    // ext_params
    @NameInMap("ext_params")
    @Validation(required = true)
    public java.util.List<Pair> extParams;

    public static MainOrderVO build(java.util.Map<String, ?> map) throws Exception {
        MainOrderVO self = new MainOrderVO();
        return TeaModel.build(map, self);
    }

    public MainOrderVO setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public MainOrderVO setBuyer(String buyer) {
        this.buyer = buyer;
        return this;
    }
    public String getBuyer() {
        return this.buyer;
    }

    public MainOrderVO setSeller(String seller) {
        this.seller = seller;
        return this;
    }
    public String getSeller() {
        return this.seller;
    }

    public MainOrderVO setSpId(String spId) {
        this.spId = spId;
        return this;
    }
    public String getSpId() {
        return this.spId;
    }

    public MainOrderVO setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
        return this;
    }
    public String getLoginAccount() {
        return this.loginAccount;
    }

    public MainOrderVO setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public MainOrderVO setMoney(MultiCurrencyMoneyVO money) {
        this.money = money;
        return this;
    }
    public MultiCurrencyMoneyVO getMoney() {
        return this.money;
    }

    public MainOrderVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MainOrderVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MainOrderVO setGmtClose(String gmtClose) {
        this.gmtClose = gmtClose;
        return this;
    }
    public String getGmtClose() {
        return this.gmtClose;
    }

    public MainOrderVO setGmtPaySuccess(String gmtPaySuccess) {
        this.gmtPaySuccess = gmtPaySuccess;
        return this;
    }
    public String getGmtPaySuccess() {
        return this.gmtPaySuccess;
    }

    public MainOrderVO setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public MainOrderVO setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public MainOrderVO setOrderOrigin(String orderOrigin) {
        this.orderOrigin = orderOrigin;
        return this;
    }
    public String getOrderOrigin() {
        return this.orderOrigin;
    }

    public MainOrderVO setOrderLevel(String orderLevel) {
        this.orderLevel = orderLevel;
        return this;
    }
    public String getOrderLevel() {
        return this.orderLevel;
    }

    public MainOrderVO setPayMethod(String payMethod) {
        this.payMethod = payMethod;
        return this;
    }
    public String getPayMethod() {
        return this.payMethod;
    }

    public MainOrderVO setOrderDuration(String orderDuration) {
        this.orderDuration = orderDuration;
        return this;
    }
    public String getOrderDuration() {
        return this.orderDuration;
    }

    public MainOrderVO setParentOrderNo(String parentOrderNo) {
        this.parentOrderNo = parentOrderNo;
        return this;
    }
    public String getParentOrderNo() {
        return this.parentOrderNo;
    }

    public MainOrderVO setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public MainOrderVO setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public MainOrderVO setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public MainOrderVO setSpecDesc(String specDesc) {
        this.specDesc = specDesc;
        return this;
    }
    public String getSpecDesc() {
        return this.specDesc;
    }

    public MainOrderVO setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
        return this;
    }
    public String getOrderDetail() {
        return this.orderDetail;
    }

    public MainOrderVO setSubOrderInclude(Boolean subOrderInclude) {
        this.subOrderInclude = subOrderInclude;
        return this;
    }
    public Boolean getSubOrderInclude() {
        return this.subOrderInclude;
    }

    public MainOrderVO setSpecProps(java.util.List<Pair> specProps) {
        this.specProps = specProps;
        return this;
    }
    public java.util.List<Pair> getSpecProps() {
        return this.specProps;
    }

    public MainOrderVO setExtParams(java.util.List<Pair> extParams) {
        this.extParams = extParams;
        return this;
    }
    public java.util.List<Pair> getExtParams() {
        return this.extParams;
    }

}
