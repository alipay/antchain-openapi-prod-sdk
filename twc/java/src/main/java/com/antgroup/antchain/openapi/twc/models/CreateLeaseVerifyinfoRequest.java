// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseVerifyinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台生成返回
    @NameInMap("application_id")
    public String applicationId;

    // 是否启动订单的异步处理
    @NameInMap("async")
    public Long async;

    // 放款账户
    @NameInMap("card_number")
    public String cardNumber;

    // 授信终止时间，格式为"2019-07-31 12:00:00"
    @NameInMap("credit_end_time")
    public String creditEndTime;

    // 授信额度，精确到毫厘，即123400表示12.34元
    @NameInMap("credit_limit")
    public Long creditLimit;

    // 授信起始时间，格式为"2019-07-31 12:00:00"
    @NameInMap("credit_start_time")
    public String creditStartTime;

    // 融资租赁审贷信息额外字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 承租企业统一社会信用代码 长度不可超过50
    @NameInMap("lease_corp_id")
    public String leaseCorpId;

    // 承租企业名称 长度不可超过50
    @NameInMap("lease_corp_name")
    public String leaseCorpName;

    // 承租法定代表人姓名 长度不可超过50
    @NameInMap("lease_corp_owner_name")
    public String leaseCorpOwnerName;

    // 租赁服务平台id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 放款流水单号
    @NameInMap("loan")
    public String loan;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 还款计划文件哈希
    @NameInMap("pay_back_hash")
    public String payBackHash;

    // 还款计划文件存证交易哈希
    @NameInMap("pay_back_tx_hash")
    public String payBackTxHash;

    // 承租人身份证
    @NameInMap("user_id")
    public String userId;

    // 承租人姓名 长度不可超过10
    @NameInMap("user_name")
    public String userName;

    // 承租人手机号
    @NameInMap("user_phone_number")
    public String userPhoneNumber;

    // 是否通过，0表示不通过，1表示通过
    @NameInMap("verify_result")
    @Validation(required = true)
    public Long verifyResult;

    // 付款汇款凭证 民盛转账成功后上传
    @NameInMap("voucher")
    public String voucher;

    // 拒绝的理由
    @NameInMap("verify_refuse_desc")
    public String verifyRefuseDesc;

    public static CreateLeaseVerifyinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseVerifyinfoRequest self = new CreateLeaseVerifyinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseVerifyinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseVerifyinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseVerifyinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseVerifyinfoRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

    public CreateLeaseVerifyinfoRequest setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public CreateLeaseVerifyinfoRequest setCreditEndTime(String creditEndTime) {
        this.creditEndTime = creditEndTime;
        return this;
    }
    public String getCreditEndTime() {
        return this.creditEndTime;
    }

    public CreateLeaseVerifyinfoRequest setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }
    public Long getCreditLimit() {
        return this.creditLimit;
    }

    public CreateLeaseVerifyinfoRequest setCreditStartTime(String creditStartTime) {
        this.creditStartTime = creditStartTime;
        return this;
    }
    public String getCreditStartTime() {
        return this.creditStartTime;
    }

    public CreateLeaseVerifyinfoRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseVerifyinfoRequest setLeaseCorpId(String leaseCorpId) {
        this.leaseCorpId = leaseCorpId;
        return this;
    }
    public String getLeaseCorpId() {
        return this.leaseCorpId;
    }

    public CreateLeaseVerifyinfoRequest setLeaseCorpName(String leaseCorpName) {
        this.leaseCorpName = leaseCorpName;
        return this;
    }
    public String getLeaseCorpName() {
        return this.leaseCorpName;
    }

    public CreateLeaseVerifyinfoRequest setLeaseCorpOwnerName(String leaseCorpOwnerName) {
        this.leaseCorpOwnerName = leaseCorpOwnerName;
        return this;
    }
    public String getLeaseCorpOwnerName() {
        return this.leaseCorpOwnerName;
    }

    public CreateLeaseVerifyinfoRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeaseVerifyinfoRequest setLoan(String loan) {
        this.loan = loan;
        return this;
    }
    public String getLoan() {
        return this.loan;
    }

    public CreateLeaseVerifyinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseVerifyinfoRequest setPayBackHash(String payBackHash) {
        this.payBackHash = payBackHash;
        return this;
    }
    public String getPayBackHash() {
        return this.payBackHash;
    }

    public CreateLeaseVerifyinfoRequest setPayBackTxHash(String payBackTxHash) {
        this.payBackTxHash = payBackTxHash;
        return this;
    }
    public String getPayBackTxHash() {
        return this.payBackTxHash;
    }

    public CreateLeaseVerifyinfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateLeaseVerifyinfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateLeaseVerifyinfoRequest setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public CreateLeaseVerifyinfoRequest setVerifyResult(Long verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public Long getVerifyResult() {
        return this.verifyResult;
    }

    public CreateLeaseVerifyinfoRequest setVoucher(String voucher) {
        this.voucher = voucher;
        return this;
    }
    public String getVoucher() {
        return this.voucher;
    }

    public CreateLeaseVerifyinfoRequest setVerifyRefuseDesc(String verifyRefuseDesc) {
        this.verifyRefuseDesc = verifyRefuseDesc;
        return this;
    }
    public String getVerifyRefuseDesc() {
        return this.verifyRefuseDesc;
    }

}
