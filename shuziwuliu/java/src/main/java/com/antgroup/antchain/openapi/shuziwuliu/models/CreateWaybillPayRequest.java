// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateWaybillPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 确认到账时间
    // 
    @NameInMap("arrive_time")
    @Validation(required = true)
    public Long arriveTime;

    // 关联银行流水号
    // 
    @NameInMap("bank_sn")
    @Validation(required = true)
    public String bankSn;

    // 付款金额
    // 
    @NameInMap("pay_amount")
    @Validation(required = true)
    public String payAmount;

    // 付款方银行账号
    // 
    @NameInMap("pay_bank_card_no")
    @Validation(required = true)
    public String payBankCardNo;

    // 付款方开户行
    // 
    @NameInMap("pay_bank_name")
    @Validation(required = true)
    public String payBankName;

    // 是否核验
    @NameInMap("pay_check")
    public Boolean payCheck;

    // 付款方did
    // 
    @NameInMap("pay_did")
    @Validation(required = true)
    public String payDid;

    // 付款方名称
    // 
    @NameInMap("pay_name")
    @Validation(required = true)
    public String payName;

    // 付款时间戳
    // 
    @NameInMap("pay_time")
    @Validation(required = true)
    public Long payTime;

    // 支付类型
    // 
    @NameInMap("pay_type_new")
    @Validation(required = true)
    public String payTypeNew;

    // 支付方式
    // 
    @NameInMap("pay_way")
    @Validation(required = true)
    public String payWay;

    // 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
    // 
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 支付订单ID
    // 
    @NameInMap("pos_info_id")
    @Validation(required = true)
    public String posInfoId;

    // 实际付款方开户行
    // 
    @NameInMap("real_pay_bank")
    @Validation(required = true)
    public String realPayBank;

    // 实际付款方银行账号
    // 
    @NameInMap("real_pay_bank_card_no")
    @Validation(required = true)
    public String realPayBankCardNo;

    // 实际付款方名称
    // 
    @NameInMap("real_pay_name")
    @Validation(required = true)
    public String realPayName;

    // 收款方银行账号
    // 
    @NameInMap("recv_bank_card_no")
    @Validation(required = true)
    public String recvBankCardNo;

    // 收款方开户行
    // 
    @NameInMap("recv_bank_name")
    @Validation(required = true)
    public String recvBankName;

    // 收款方did
    // 
    @NameInMap("recv_did")
    @Validation(required = true)
    public String recvDid;

    // 收款方名称
    // 
    @NameInMap("recv_name")
    @Validation(required = true)
    public String recvName;

    // 关联的运单ID
    // 
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    // MYBank_CloudCapital_1,  ## 云资金1.0
    // MYBank_CloudCapital_2,  ## 云资金2.0
    @NameInMap("check_channel")
    public String checkChannel;

    // CNY, USD
    @NameInMap("currency")
    public String currency;

    public static CreateWaybillPayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWaybillPayRequest self = new CreateWaybillPayRequest();
        return TeaModel.build(map, self);
    }

    public CreateWaybillPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWaybillPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWaybillPayRequest setArriveTime(Long arriveTime) {
        this.arriveTime = arriveTime;
        return this;
    }
    public Long getArriveTime() {
        return this.arriveTime;
    }

    public CreateWaybillPayRequest setBankSn(String bankSn) {
        this.bankSn = bankSn;
        return this;
    }
    public String getBankSn() {
        return this.bankSn;
    }

    public CreateWaybillPayRequest setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public CreateWaybillPayRequest setPayBankCardNo(String payBankCardNo) {
        this.payBankCardNo = payBankCardNo;
        return this;
    }
    public String getPayBankCardNo() {
        return this.payBankCardNo;
    }

    public CreateWaybillPayRequest setPayBankName(String payBankName) {
        this.payBankName = payBankName;
        return this;
    }
    public String getPayBankName() {
        return this.payBankName;
    }

    public CreateWaybillPayRequest setPayCheck(Boolean payCheck) {
        this.payCheck = payCheck;
        return this;
    }
    public Boolean getPayCheck() {
        return this.payCheck;
    }

    public CreateWaybillPayRequest setPayDid(String payDid) {
        this.payDid = payDid;
        return this;
    }
    public String getPayDid() {
        return this.payDid;
    }

    public CreateWaybillPayRequest setPayName(String payName) {
        this.payName = payName;
        return this;
    }
    public String getPayName() {
        return this.payName;
    }

    public CreateWaybillPayRequest setPayTime(Long payTime) {
        this.payTime = payTime;
        return this;
    }
    public Long getPayTime() {
        return this.payTime;
    }

    public CreateWaybillPayRequest setPayTypeNew(String payTypeNew) {
        this.payTypeNew = payTypeNew;
        return this;
    }
    public String getPayTypeNew() {
        return this.payTypeNew;
    }

    public CreateWaybillPayRequest setPayWay(String payWay) {
        this.payWay = payWay;
        return this;
    }
    public String getPayWay() {
        return this.payWay;
    }

    public CreateWaybillPayRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateWaybillPayRequest setPosInfoId(String posInfoId) {
        this.posInfoId = posInfoId;
        return this;
    }
    public String getPosInfoId() {
        return this.posInfoId;
    }

    public CreateWaybillPayRequest setRealPayBank(String realPayBank) {
        this.realPayBank = realPayBank;
        return this;
    }
    public String getRealPayBank() {
        return this.realPayBank;
    }

    public CreateWaybillPayRequest setRealPayBankCardNo(String realPayBankCardNo) {
        this.realPayBankCardNo = realPayBankCardNo;
        return this;
    }
    public String getRealPayBankCardNo() {
        return this.realPayBankCardNo;
    }

    public CreateWaybillPayRequest setRealPayName(String realPayName) {
        this.realPayName = realPayName;
        return this;
    }
    public String getRealPayName() {
        return this.realPayName;
    }

    public CreateWaybillPayRequest setRecvBankCardNo(String recvBankCardNo) {
        this.recvBankCardNo = recvBankCardNo;
        return this;
    }
    public String getRecvBankCardNo() {
        return this.recvBankCardNo;
    }

    public CreateWaybillPayRequest setRecvBankName(String recvBankName) {
        this.recvBankName = recvBankName;
        return this;
    }
    public String getRecvBankName() {
        return this.recvBankName;
    }

    public CreateWaybillPayRequest setRecvDid(String recvDid) {
        this.recvDid = recvDid;
        return this;
    }
    public String getRecvDid() {
        return this.recvDid;
    }

    public CreateWaybillPayRequest setRecvName(String recvName) {
        this.recvName = recvName;
        return this;
    }
    public String getRecvName() {
        return this.recvName;
    }

    public CreateWaybillPayRequest setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

    public CreateWaybillPayRequest setCheckChannel(String checkChannel) {
        this.checkChannel = checkChannel;
        return this;
    }
    public String getCheckChannel() {
        return this.checkChannel;
    }

    public CreateWaybillPayRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
