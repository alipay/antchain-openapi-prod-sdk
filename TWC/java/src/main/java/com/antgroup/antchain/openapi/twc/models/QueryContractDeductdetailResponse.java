// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractDeductdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 用户支付宝uid
    @NameInMap("alipay_user_id")
    public String alipayUserId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 订单创建时间
    @NameInMap("order_create_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderCreateDate;

    // 订单状态
    @NameInMap("order_status_code")
    public String orderStatusCode;

    // 订单子状态
    @NameInMap("order_sub_status_code")
    public String orderSubStatusCode;

    // 总金额，单位为分
    @NameInMap("total_rent_money")
    public Long totalRentMoney;

    // 商户smid
    @NameInMap("alipay_smid")
    public String alipaySmid;

    // 商户名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 用户支付宝代扣签约协议号
    @NameInMap("alipay_agreement_no")
    public String alipayAgreementNo;

    // 履约记录
    @NameInMap("fulfillment_list")
    public java.util.List<String> fulfillmentList;

    public static QueryContractDeductdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractDeductdetailResponse self = new QueryContractDeductdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractDeductdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractDeductdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractDeductdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractDeductdetailResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryContractDeductdetailResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryContractDeductdetailResponse setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public QueryContractDeductdetailResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryContractDeductdetailResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryContractDeductdetailResponse setOrderCreateDate(String orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
        return this;
    }
    public String getOrderCreateDate() {
        return this.orderCreateDate;
    }

    public QueryContractDeductdetailResponse setOrderStatusCode(String orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
        return this;
    }
    public String getOrderStatusCode() {
        return this.orderStatusCode;
    }

    public QueryContractDeductdetailResponse setOrderSubStatusCode(String orderSubStatusCode) {
        this.orderSubStatusCode = orderSubStatusCode;
        return this;
    }
    public String getOrderSubStatusCode() {
        return this.orderSubStatusCode;
    }

    public QueryContractDeductdetailResponse setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public QueryContractDeductdetailResponse setAlipaySmid(String alipaySmid) {
        this.alipaySmid = alipaySmid;
        return this;
    }
    public String getAlipaySmid() {
        return this.alipaySmid;
    }

    public QueryContractDeductdetailResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QueryContractDeductdetailResponse setAlipayAgreementNo(String alipayAgreementNo) {
        this.alipayAgreementNo = alipayAgreementNo;
        return this;
    }
    public String getAlipayAgreementNo() {
        return this.alipayAgreementNo;
    }

    public QueryContractDeductdetailResponse setFulfillmentList(java.util.List<String> fulfillmentList) {
        this.fulfillmentList = fulfillmentList;
        return this;
    }
    public java.util.List<String> getFulfillmentList() {
        return this.fulfillmentList;
    }

}
