// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinancePayorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 确认到账时间
    @NameInMap("arrive_time")
    @Validation(required = true)
    public Long arriveTime;

    // 关联银行流水号
    @NameInMap("bank_sn")
    @Validation(required = true)
    public String bankSn;

    // 付款金额
    @NameInMap("pay_amount")
    @Validation(required = true)
    public String payAmount;

    // 付款方银行账号
    @NameInMap("pay_bank_card_no")
    @Validation(required = true)
    public String payBankCardNo;

    // 付款方开户行
    @NameInMap("pay_bank_name")
    @Validation(required = true)
    public String payBankName;

    // 付款方did
    @NameInMap("pay_did")
    public String payDid;

    // 付款方名称
    @NameInMap("pay_name")
    @Validation(required = true)
    public String payName;

    // 付款时间戳
    @NameInMap("pay_time")
    @Validation(required = true)
    public Long payTime;

    // 支付类型
    @NameInMap("pay_type_new")
    @Validation(required = true)
    public String payTypeNew;

    // 支付方式
    @NameInMap("pay_way")
    @Validation(required = true)
    public String payWay;

    // 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
    @NameInMap("platform_did")
    public String platformDid;

    // 支付订单ID
    @NameInMap("pos_info_id")
    @Validation(required = true)
    public String posInfoId;

    // 实际付款方开户行
    @NameInMap("real_pay_bank")
    @Validation(required = true)
    public String realPayBank;

    // 实际付款方银行账号
    @NameInMap("real_pay_bank_card_no")
    @Validation(required = true)
    public String realPayBankCardNo;

    // 实际付款方名称
    @NameInMap("real_pay_name")
    @Validation(required = true)
    public String realPayName;

    // 收款方银行账号
    @NameInMap("recv_bank_card_no")
    @Validation(required = true)
    public String recvBankCardNo;

    // 收款方开户行
    @NameInMap("recv_bank_name")
    @Validation(required = true)
    public String recvBankName;

    // 收款方did
    @NameInMap("recv_did")
    public String recvDid;

    // 收款方名称
    @NameInMap("recv_name")
    @Validation(required = true)
    public String recvName;

    // 关联的运单ID
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    public static CreateLogisticFinancePayorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinancePayorderRequest self = new CreateLogisticFinancePayorderRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinancePayorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLogisticFinancePayorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLogisticFinancePayorderRequest setArriveTime(Long arriveTime) {
        this.arriveTime = arriveTime;
        return this;
    }
    public Long getArriveTime() {
        return this.arriveTime;
    }

    public CreateLogisticFinancePayorderRequest setBankSn(String bankSn) {
        this.bankSn = bankSn;
        return this;
    }
    public String getBankSn() {
        return this.bankSn;
    }

    public CreateLogisticFinancePayorderRequest setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public CreateLogisticFinancePayorderRequest setPayBankCardNo(String payBankCardNo) {
        this.payBankCardNo = payBankCardNo;
        return this;
    }
    public String getPayBankCardNo() {
        return this.payBankCardNo;
    }

    public CreateLogisticFinancePayorderRequest setPayBankName(String payBankName) {
        this.payBankName = payBankName;
        return this;
    }
    public String getPayBankName() {
        return this.payBankName;
    }

    public CreateLogisticFinancePayorderRequest setPayDid(String payDid) {
        this.payDid = payDid;
        return this;
    }
    public String getPayDid() {
        return this.payDid;
    }

    public CreateLogisticFinancePayorderRequest setPayName(String payName) {
        this.payName = payName;
        return this;
    }
    public String getPayName() {
        return this.payName;
    }

    public CreateLogisticFinancePayorderRequest setPayTime(Long payTime) {
        this.payTime = payTime;
        return this;
    }
    public Long getPayTime() {
        return this.payTime;
    }

    public CreateLogisticFinancePayorderRequest setPayTypeNew(String payTypeNew) {
        this.payTypeNew = payTypeNew;
        return this;
    }
    public String getPayTypeNew() {
        return this.payTypeNew;
    }

    public CreateLogisticFinancePayorderRequest setPayWay(String payWay) {
        this.payWay = payWay;
        return this;
    }
    public String getPayWay() {
        return this.payWay;
    }

    public CreateLogisticFinancePayorderRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateLogisticFinancePayorderRequest setPosInfoId(String posInfoId) {
        this.posInfoId = posInfoId;
        return this;
    }
    public String getPosInfoId() {
        return this.posInfoId;
    }

    public CreateLogisticFinancePayorderRequest setRealPayBank(String realPayBank) {
        this.realPayBank = realPayBank;
        return this;
    }
    public String getRealPayBank() {
        return this.realPayBank;
    }

    public CreateLogisticFinancePayorderRequest setRealPayBankCardNo(String realPayBankCardNo) {
        this.realPayBankCardNo = realPayBankCardNo;
        return this;
    }
    public String getRealPayBankCardNo() {
        return this.realPayBankCardNo;
    }

    public CreateLogisticFinancePayorderRequest setRealPayName(String realPayName) {
        this.realPayName = realPayName;
        return this;
    }
    public String getRealPayName() {
        return this.realPayName;
    }

    public CreateLogisticFinancePayorderRequest setRecvBankCardNo(String recvBankCardNo) {
        this.recvBankCardNo = recvBankCardNo;
        return this;
    }
    public String getRecvBankCardNo() {
        return this.recvBankCardNo;
    }

    public CreateLogisticFinancePayorderRequest setRecvBankName(String recvBankName) {
        this.recvBankName = recvBankName;
        return this;
    }
    public String getRecvBankName() {
        return this.recvBankName;
    }

    public CreateLogisticFinancePayorderRequest setRecvDid(String recvDid) {
        this.recvDid = recvDid;
        return this;
    }
    public String getRecvDid() {
        return this.recvDid;
    }

    public CreateLogisticFinancePayorderRequest setRecvName(String recvName) {
        this.recvName = recvName;
        return this;
    }
    public String getRecvName() {
        return this.recvName;
    }

    public CreateLogisticFinancePayorderRequest setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

}
