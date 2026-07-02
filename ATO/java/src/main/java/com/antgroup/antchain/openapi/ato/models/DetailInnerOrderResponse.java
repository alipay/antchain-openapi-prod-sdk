// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 支付宝代扣协议号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 商品总数量
    @NameInMap("product_total_count")
    public Long productTotalCount;

    // 订单基础信息
    @NameInMap("order_info")
    public OrderInfo orderInfo;

    // 用户信息
    @NameInMap("order_user_info")
    public OrderUserInfo orderUserInfo;

    // 订单履约
    @NameInMap("order_fulfillment_info_list")
    public java.util.List<OrderFulfillmentInfo> orderFulfillmentInfoList;

    // 订单还款承诺
    @NameInMap("order_promise_info")
    public OrderPromiseInfo orderPromiseInfo;

    // 订单商品信息
    @NameInMap("order_product_info_list")
    public java.util.List<OrderProductInfo> orderProductInfoList;

    // 经营分账信息
    @NameInMap("operate_divide_info_list")
    public java.util.List<OperateDivideInfo> operateDivideInfoList;

    // 订单合同信息
    @NameInMap("order_contract_info_list")
    public java.util.List<OrderContractInfo> orderContractInfoList;

    public static DetailInnerOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerOrderResponse self = new DetailInnerOrderResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerOrderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DetailInnerOrderResponse setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public DetailInnerOrderResponse setProductTotalCount(Long productTotalCount) {
        this.productTotalCount = productTotalCount;
        return this;
    }
    public Long getProductTotalCount() {
        return this.productTotalCount;
    }

    public DetailInnerOrderResponse setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public DetailInnerOrderResponse setOrderUserInfo(OrderUserInfo orderUserInfo) {
        this.orderUserInfo = orderUserInfo;
        return this;
    }
    public OrderUserInfo getOrderUserInfo() {
        return this.orderUserInfo;
    }

    public DetailInnerOrderResponse setOrderFulfillmentInfoList(java.util.List<OrderFulfillmentInfo> orderFulfillmentInfoList) {
        this.orderFulfillmentInfoList = orderFulfillmentInfoList;
        return this;
    }
    public java.util.List<OrderFulfillmentInfo> getOrderFulfillmentInfoList() {
        return this.orderFulfillmentInfoList;
    }

    public DetailInnerOrderResponse setOrderPromiseInfo(OrderPromiseInfo orderPromiseInfo) {
        this.orderPromiseInfo = orderPromiseInfo;
        return this;
    }
    public OrderPromiseInfo getOrderPromiseInfo() {
        return this.orderPromiseInfo;
    }

    public DetailInnerOrderResponse setOrderProductInfoList(java.util.List<OrderProductInfo> orderProductInfoList) {
        this.orderProductInfoList = orderProductInfoList;
        return this;
    }
    public java.util.List<OrderProductInfo> getOrderProductInfoList() {
        return this.orderProductInfoList;
    }

    public DetailInnerOrderResponse setOperateDivideInfoList(java.util.List<OperateDivideInfo> operateDivideInfoList) {
        this.operateDivideInfoList = operateDivideInfoList;
        return this;
    }
    public java.util.List<OperateDivideInfo> getOperateDivideInfoList() {
        return this.operateDivideInfoList;
    }

    public DetailInnerOrderResponse setOrderContractInfoList(java.util.List<OrderContractInfo> orderContractInfoList) {
        this.orderContractInfoList = orderContractInfoList;
        return this;
    }
    public java.util.List<OrderContractInfo> getOrderContractInfoList() {
        return this.orderContractInfoList;
    }

}
