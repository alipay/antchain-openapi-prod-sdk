// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryFundCreditauthResponse extends TeaModel {
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

    // 授权类型
    // ● CREDIT_GRANTING 授信
    // ● CREDIT_UTILIZATION 用信
    @NameInMap("auth_type")
    public String authType;

    // 授权结果
    // AUTHORIZED 已同意
    // REJECTED 已拒绝
    // EXPIRED 已过期
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

    // 授信/用信授权信息,json结构
    @NameInMap("auth_info")
    public String authInfo;

    public static QueryFundCreditauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFundCreditauthResponse self = new QueryFundCreditauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryFundCreditauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFundCreditauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFundCreditauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFundCreditauthResponse setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public QueryFundCreditauthResponse setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryFundCreditauthResponse setAuthResult(String authResult) {
        this.authResult = authResult;
        return this;
    }
    public String getAuthResult() {
        return this.authResult;
    }

    public QueryFundCreditauthResponse setAuthBeginTime(String authBeginTime) {
        this.authBeginTime = authBeginTime;
        return this;
    }
    public String getAuthBeginTime() {
        return this.authBeginTime;
    }

    public QueryFundCreditauthResponse setAuthEndTime(String authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public String getAuthEndTime() {
        return this.authEndTime;
    }

    public QueryFundCreditauthResponse setAuthApplyExpireTime(String authApplyExpireTime) {
        this.authApplyExpireTime = authApplyExpireTime;
        return this;
    }
    public String getAuthApplyExpireTime() {
        return this.authApplyExpireTime;
    }

    public QueryFundCreditauthResponse setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

}
