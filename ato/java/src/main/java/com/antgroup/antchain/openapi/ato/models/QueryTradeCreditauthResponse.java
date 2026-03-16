// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryTradeCreditauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权id
    @NameInMap("auth_id")
    public String authId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    public String fundId;

    // 授权类型
    @NameInMap("auth_type")
    public String authType;

    // 授权结果
    @NameInMap("auth_result")
    public String authResult;

    // 授权开始时间
    @NameInMap("auth_begin_time")
    public String authBeginTime;

    // 授权结束时间
    @NameInMap("auth_end_time")
    public String authEndTime;

    // 授权申请过期时间
    @NameInMap("auth_apply_expire_time")
    public String authApplyExpireTime;

    // 授权信息
    @NameInMap("auth_info")
    public String authInfo;

    // 合同信息
    @NameInMap("auth_contract")
    public String authContract;

    public static QueryTradeCreditauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeCreditauthResponse self = new QueryTradeCreditauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeCreditauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTradeCreditauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTradeCreditauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTradeCreditauthResponse setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public QueryTradeCreditauthResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryTradeCreditauthResponse setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryTradeCreditauthResponse setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryTradeCreditauthResponse setAuthResult(String authResult) {
        this.authResult = authResult;
        return this;
    }
    public String getAuthResult() {
        return this.authResult;
    }

    public QueryTradeCreditauthResponse setAuthBeginTime(String authBeginTime) {
        this.authBeginTime = authBeginTime;
        return this;
    }
    public String getAuthBeginTime() {
        return this.authBeginTime;
    }

    public QueryTradeCreditauthResponse setAuthEndTime(String authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public String getAuthEndTime() {
        return this.authEndTime;
    }

    public QueryTradeCreditauthResponse setAuthApplyExpireTime(String authApplyExpireTime) {
        this.authApplyExpireTime = authApplyExpireTime;
        return this;
    }
    public String getAuthApplyExpireTime() {
        return this.authApplyExpireTime;
    }

    public QueryTradeCreditauthResponse setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public QueryTradeCreditauthResponse setAuthContract(String authContract) {
        this.authContract = authContract;
        return this;
    }
    public String getAuthContract() {
        return this.authContract;
    }

}
