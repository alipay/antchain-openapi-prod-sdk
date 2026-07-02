// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerFundmngorderResponse extends TeaModel {
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

    // 订单基础信息
    @NameInMap("order_info")
    public OrderInfo orderInfo;

    // 订单物流信息列表
    @NameInMap("order_logistic_info_list")
    public java.util.List<OrderLogisticInfo> orderLogisticInfoList;

    // 订单用户信息
    @NameInMap("order_user_info")
    public OrderUserInfo orderUserInfo;

    // 订单融资信息
    @NameInMap("order_finance_info")
    public OrderFinanceInfo orderFinanceInfo;

    // 订单履约信息
    @NameInMap("order_fulfillment_info_list")
    public java.util.List<OrderFulfillmentInfo> orderFulfillmentInfoList;

    // 订单履约计划
    @NameInMap("order_promise_info")
    public java.util.List<OrderRepayStrategy> orderPromiseInfo;

    // 订单商品信息
    @NameInMap("order_product_info_list")
    public java.util.List<OrderProductInfo> orderProductInfoList;

    // 订单合同文件信息
    @NameInMap("order_contract_info_list")
    public java.util.List<OrderContractInfo> orderContractInfoList;

    // 订单代扣协议信息
    @NameInMap("order_withhold_contract_info")
    public OrderWithholdContractInfo orderWithholdContractInfo;

    // 订单资产凭证信息
    @NameInMap("order_credit_info")
    public java.util.List<InnerCreditInfo> orderCreditInfo;

    // 商家履约计划
    @NameInMap("merchant_order_repay_strategy")
    public java.util.List<MerchantOrderRepayStrategy> merchantOrderRepayStrategy;

    // 商户履约记录信息
    @NameInMap("merchant_order_fulfillment_info")
    public java.util.List<MerchantOrderFulfillmentInfo> merchantOrderFulfillmentInfo;

    // 资方后台融资申请结果
    @NameInMap("fund_mng_loan_applay_result")
    public FundMngLoanApplyResult fundMngLoanApplayResult;

    // 商户履约赎回信息
    @NameInMap("merchant_performance_redeem_info")
    public MerchantPerformanceRedeemInfo merchantPerformanceRedeemInfo;

    // 商户履约还款取消信息
    @NameInMap("merchant_performance_repay_support_info")
    public java.util.List<MerchantPerformanceRepaySupportInfo> merchantPerformanceRepaySupportInfo;

    public static DetailInnerFundmngorderResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerFundmngorderResponse self = new DetailInnerFundmngorderResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerFundmngorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerFundmngorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerFundmngorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerFundmngorderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DetailInnerFundmngorderResponse setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public DetailInnerFundmngorderResponse setOrderLogisticInfoList(java.util.List<OrderLogisticInfo> orderLogisticInfoList) {
        this.orderLogisticInfoList = orderLogisticInfoList;
        return this;
    }
    public java.util.List<OrderLogisticInfo> getOrderLogisticInfoList() {
        return this.orderLogisticInfoList;
    }

    public DetailInnerFundmngorderResponse setOrderUserInfo(OrderUserInfo orderUserInfo) {
        this.orderUserInfo = orderUserInfo;
        return this;
    }
    public OrderUserInfo getOrderUserInfo() {
        return this.orderUserInfo;
    }

    public DetailInnerFundmngorderResponse setOrderFinanceInfo(OrderFinanceInfo orderFinanceInfo) {
        this.orderFinanceInfo = orderFinanceInfo;
        return this;
    }
    public OrderFinanceInfo getOrderFinanceInfo() {
        return this.orderFinanceInfo;
    }

    public DetailInnerFundmngorderResponse setOrderFulfillmentInfoList(java.util.List<OrderFulfillmentInfo> orderFulfillmentInfoList) {
        this.orderFulfillmentInfoList = orderFulfillmentInfoList;
        return this;
    }
    public java.util.List<OrderFulfillmentInfo> getOrderFulfillmentInfoList() {
        return this.orderFulfillmentInfoList;
    }

    public DetailInnerFundmngorderResponse setOrderPromiseInfo(java.util.List<OrderRepayStrategy> orderPromiseInfo) {
        this.orderPromiseInfo = orderPromiseInfo;
        return this;
    }
    public java.util.List<OrderRepayStrategy> getOrderPromiseInfo() {
        return this.orderPromiseInfo;
    }

    public DetailInnerFundmngorderResponse setOrderProductInfoList(java.util.List<OrderProductInfo> orderProductInfoList) {
        this.orderProductInfoList = orderProductInfoList;
        return this;
    }
    public java.util.List<OrderProductInfo> getOrderProductInfoList() {
        return this.orderProductInfoList;
    }

    public DetailInnerFundmngorderResponse setOrderContractInfoList(java.util.List<OrderContractInfo> orderContractInfoList) {
        this.orderContractInfoList = orderContractInfoList;
        return this;
    }
    public java.util.List<OrderContractInfo> getOrderContractInfoList() {
        return this.orderContractInfoList;
    }

    public DetailInnerFundmngorderResponse setOrderWithholdContractInfo(OrderWithholdContractInfo orderWithholdContractInfo) {
        this.orderWithholdContractInfo = orderWithholdContractInfo;
        return this;
    }
    public OrderWithholdContractInfo getOrderWithholdContractInfo() {
        return this.orderWithholdContractInfo;
    }

    public DetailInnerFundmngorderResponse setOrderCreditInfo(java.util.List<InnerCreditInfo> orderCreditInfo) {
        this.orderCreditInfo = orderCreditInfo;
        return this;
    }
    public java.util.List<InnerCreditInfo> getOrderCreditInfo() {
        return this.orderCreditInfo;
    }

    public DetailInnerFundmngorderResponse setMerchantOrderRepayStrategy(java.util.List<MerchantOrderRepayStrategy> merchantOrderRepayStrategy) {
        this.merchantOrderRepayStrategy = merchantOrderRepayStrategy;
        return this;
    }
    public java.util.List<MerchantOrderRepayStrategy> getMerchantOrderRepayStrategy() {
        return this.merchantOrderRepayStrategy;
    }

    public DetailInnerFundmngorderResponse setMerchantOrderFulfillmentInfo(java.util.List<MerchantOrderFulfillmentInfo> merchantOrderFulfillmentInfo) {
        this.merchantOrderFulfillmentInfo = merchantOrderFulfillmentInfo;
        return this;
    }
    public java.util.List<MerchantOrderFulfillmentInfo> getMerchantOrderFulfillmentInfo() {
        return this.merchantOrderFulfillmentInfo;
    }

    public DetailInnerFundmngorderResponse setFundMngLoanApplayResult(FundMngLoanApplyResult fundMngLoanApplayResult) {
        this.fundMngLoanApplayResult = fundMngLoanApplayResult;
        return this;
    }
    public FundMngLoanApplyResult getFundMngLoanApplayResult() {
        return this.fundMngLoanApplayResult;
    }

    public DetailInnerFundmngorderResponse setMerchantPerformanceRedeemInfo(MerchantPerformanceRedeemInfo merchantPerformanceRedeemInfo) {
        this.merchantPerformanceRedeemInfo = merchantPerformanceRedeemInfo;
        return this;
    }
    public MerchantPerformanceRedeemInfo getMerchantPerformanceRedeemInfo() {
        return this.merchantPerformanceRedeemInfo;
    }

    public DetailInnerFundmngorderResponse setMerchantPerformanceRepaySupportInfo(java.util.List<MerchantPerformanceRepaySupportInfo> merchantPerformanceRepaySupportInfo) {
        this.merchantPerformanceRepaySupportInfo = merchantPerformanceRepaySupportInfo;
        return this;
    }
    public java.util.List<MerchantPerformanceRepaySupportInfo> getMerchantPerformanceRepaySupportInfo() {
        return this.merchantPerformanceRepaySupportInfo;
    }

}
