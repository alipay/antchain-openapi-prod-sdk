// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryAgreementAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 隐私协议版本号
    @NameInMap("privacy_agreement_no")
    public String privacyAgreementNo;

    // 用户协议版本号
    @NameInMap("user_agreement_no")
    public String userAgreementNo;

    // 隐私协议签署时间
    @NameInMap("privacy_agreement_sign_time")
    public String privacyAgreementSignTime;

    // 用户协议签署时间
    @NameInMap("user_agreement_sign_time")
    public String userAgreementSignTime;

    public static QueryAgreementAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgreementAppResponse self = new QueryAgreementAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgreementAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAgreementAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAgreementAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAgreementAppResponse setPrivacyAgreementNo(String privacyAgreementNo) {
        this.privacyAgreementNo = privacyAgreementNo;
        return this;
    }
    public String getPrivacyAgreementNo() {
        return this.privacyAgreementNo;
    }

    public QueryAgreementAppResponse setUserAgreementNo(String userAgreementNo) {
        this.userAgreementNo = userAgreementNo;
        return this;
    }
    public String getUserAgreementNo() {
        return this.userAgreementNo;
    }

    public QueryAgreementAppResponse setPrivacyAgreementSignTime(String privacyAgreementSignTime) {
        this.privacyAgreementSignTime = privacyAgreementSignTime;
        return this;
    }
    public String getPrivacyAgreementSignTime() {
        return this.privacyAgreementSignTime;
    }

    public QueryAgreementAppResponse setUserAgreementSignTime(String userAgreementSignTime) {
        this.userAgreementSignTime = userAgreementSignTime;
        return this;
    }
    public String getUserAgreementSignTime() {
        return this.userAgreementSignTime;
    }

}
