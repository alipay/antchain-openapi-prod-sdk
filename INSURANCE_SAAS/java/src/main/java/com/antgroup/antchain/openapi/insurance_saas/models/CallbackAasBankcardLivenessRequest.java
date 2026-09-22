// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackAasBankcardLivenessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码：BANKCARD_LIVENESS
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 请求ID，最大32位字母数字
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 银行卡号（AES加密）
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 加密用户ID（身份证号或手机号的AES加密）
    @NameInMap("encrypted_user_id")
    @Validation(required = true)
    public String encryptedUserId;

    // 活跃度结果
    @NameInMap("liveness_result")
    @Validation(required = true)
    public String livenessResult;

    // 活跃度评分（0-100）
    @NameInMap("liveness_score")
    public String livenessScore;

    // 原查询日期，格式yyyyMMdd
    @NameInMap("query_date")
    public String queryDate;

    // 回调时间，格式yyyyMMddHHmmss
    @NameInMap("callback_time")
    public String callbackTime;

    // 扩展信息（JSON字符串）
    @NameInMap("ext_info")
    public String extInfo;

    public static CallbackAasBankcardLivenessRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAasBankcardLivenessRequest self = new CallbackAasBankcardLivenessRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAasBankcardLivenessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAasBankcardLivenessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CallbackAasBankcardLivenessRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackAasBankcardLivenessRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public CallbackAasBankcardLivenessRequest setEncryptedUserId(String encryptedUserId) {
        this.encryptedUserId = encryptedUserId;
        return this;
    }
    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public CallbackAasBankcardLivenessRequest setLivenessResult(String livenessResult) {
        this.livenessResult = livenessResult;
        return this;
    }
    public String getLivenessResult() {
        return this.livenessResult;
    }

    public CallbackAasBankcardLivenessRequest setLivenessScore(String livenessScore) {
        this.livenessScore = livenessScore;
        return this;
    }
    public String getLivenessScore() {
        return this.livenessScore;
    }

    public CallbackAasBankcardLivenessRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

    public CallbackAasBankcardLivenessRequest setCallbackTime(String callbackTime) {
        this.callbackTime = callbackTime;
        return this;
    }
    public String getCallbackTime() {
        return this.callbackTime;
    }

    public CallbackAasBankcardLivenessRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
