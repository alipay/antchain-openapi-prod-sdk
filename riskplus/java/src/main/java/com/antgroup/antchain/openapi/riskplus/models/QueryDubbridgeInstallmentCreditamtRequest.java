// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeInstallmentCreditamtRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号：request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 1：现金贷、2：分期付
    @NameInMap("prod_type")
    @Validation(required = true)
    public String prodType;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 项目编号
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 交易金额，单位：元，如199.88（用于筛选额度充足的机构）
    @NameInMap("trade_amount")
    @Validation(required = true)
    public String tradeAmount;

    // 身份证号
    @NameInMap("card_no")
    public String cardNo;

    // 客户姓名
    @NameInMap("customer_name")
    public String customerName;

    public static QueryDubbridgeInstallmentCreditamtRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeInstallmentCreditamtRequest self = new QueryDubbridgeInstallmentCreditamtRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeInstallmentCreditamtRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

}
