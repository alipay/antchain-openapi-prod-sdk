// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinanceCargopayorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行流水号
    @NameInMap("bank_no")
    @Validation(required = true)
    public String bankNo;

    // 货源单号
    @NameInMap("cargo_order")
    @Validation(required = true)
    public String cargoOrder;

    // 费用类型   (运费、调度费、服务费)
    @NameInMap("expense_type")
    @Validation(required = true)
    public String expenseType;

    // 支付金额
    @NameInMap("payment")
    @Validation(required = true)
    public String payment;

    // 付款方did
    @NameInMap("pay_did")
    @Validation(required = true)
    public String payDid;

    // 平台支付单号
    @NameInMap("pay_id")
    @Validation(required = true)
    public String payId;

    // 支付备注
    @NameInMap("pay_note")
    public String payNote;

    // 收款方did
    @NameInMap("recv_did")
    @Validation(required = true)
    public String recvDid;

    public static CreateLogisticFinanceCargopayorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinanceCargopayorderRequest self = new CreateLogisticFinanceCargopayorderRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinanceCargopayorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLogisticFinanceCargopayorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLogisticFinanceCargopayorderRequest setBankNo(String bankNo) {
        this.bankNo = bankNo;
        return this;
    }
    public String getBankNo() {
        return this.bankNo;
    }

    public CreateLogisticFinanceCargopayorderRequest setCargoOrder(String cargoOrder) {
        this.cargoOrder = cargoOrder;
        return this;
    }
    public String getCargoOrder() {
        return this.cargoOrder;
    }

    public CreateLogisticFinanceCargopayorderRequest setExpenseType(String expenseType) {
        this.expenseType = expenseType;
        return this;
    }
    public String getExpenseType() {
        return this.expenseType;
    }

    public CreateLogisticFinanceCargopayorderRequest setPayment(String payment) {
        this.payment = payment;
        return this;
    }
    public String getPayment() {
        return this.payment;
    }

    public CreateLogisticFinanceCargopayorderRequest setPayDid(String payDid) {
        this.payDid = payDid;
        return this;
    }
    public String getPayDid() {
        return this.payDid;
    }

    public CreateLogisticFinanceCargopayorderRequest setPayId(String payId) {
        this.payId = payId;
        return this;
    }
    public String getPayId() {
        return this.payId;
    }

    public CreateLogisticFinanceCargopayorderRequest setPayNote(String payNote) {
        this.payNote = payNote;
        return this;
    }
    public String getPayNote() {
        return this.payNote;
    }

    public CreateLogisticFinanceCargopayorderRequest setRecvDid(String recvDid) {
        this.recvDid = recvDid;
        return this;
    }
    public String getRecvDid() {
        return this.recvDid;
    }

}
