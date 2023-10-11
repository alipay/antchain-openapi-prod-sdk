// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FinishBclOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁宝plus服务返回的订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 资方尾款金额，单位为分且最小值：1（租赁单有融资时必传）
    @NameInMap("investor_final_payment")
    public Long investorFinalPayment;

    // 买家还款金额，单位分（提前还款，到期买断，到期归还场景必传）
    @NameInMap("buyer_repay_amount")
    public Long buyerRepayAmount;

    // 幂等号，用来保证请求幂等性，标识一次完结请求，确保同笔订单下该值唯一。
    // 注意：
    // ● clientToken只支持ASCII字符，且不能超过64个字符；
    // ● 针对同一次完结请求如果调用接口失败或异常了，重试时要保证该值不变；
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    // 完结场景：
    // ● BUYER_PRE_REPAY：买家提前还款 
    // ● BUYER_DUE_GIVE_BACK：买家到期归还
    // ● BUYER_DUE_BUYOUT：买家到期买断 
    // ● BUYER_BAD_DEBT：买家坏账
    // ● BUYER_CANCEL_AGREEMENT：买家解约
    // ● MERCHANT_CANCEL_ORDER：商家取消订单
    @NameInMap("finish_scene")
    @Validation(required = true)
    public String finishScene;

    // 完结的分期信息（买家到期归还和买家到期买断场景不传，其他场景必传）
    @NameInMap("finish_installments")
    public java.util.List<BclFinishInstallment> finishInstallments;

    public static FinishBclOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishBclOrderRequest self = new FinishBclOrderRequest();
        return TeaModel.build(map, self);
    }

    public FinishBclOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishBclOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishBclOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FinishBclOrderRequest setInvestorFinalPayment(Long investorFinalPayment) {
        this.investorFinalPayment = investorFinalPayment;
        return this;
    }
    public Long getInvestorFinalPayment() {
        return this.investorFinalPayment;
    }

    public FinishBclOrderRequest setBuyerRepayAmount(Long buyerRepayAmount) {
        this.buyerRepayAmount = buyerRepayAmount;
        return this;
    }
    public Long getBuyerRepayAmount() {
        return this.buyerRepayAmount;
    }

    public FinishBclOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FinishBclOrderRequest setFinishScene(String finishScene) {
        this.finishScene = finishScene;
        return this;
    }
    public String getFinishScene() {
        return this.finishScene;
    }

    public FinishBclOrderRequest setFinishInstallments(java.util.List<BclFinishInstallment> finishInstallments) {
        this.finishInstallments = finishInstallments;
        return this;
    }
    public java.util.List<BclFinishInstallment> getFinishInstallments() {
        return this.finishInstallments;
    }

}
