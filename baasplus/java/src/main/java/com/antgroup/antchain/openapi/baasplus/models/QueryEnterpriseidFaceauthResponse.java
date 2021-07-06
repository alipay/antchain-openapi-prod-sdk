// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseidFaceauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证的唯一性标示
    @NameInMap("biz_no")
    public String bizNo;

    // 认证失败错误码
    @NameInMap("failed_code")
    public String failedCode;

    // 认证失败原因信息
    @NameInMap("failed_message")
    public String failedMessage;

    // 是否认证通过
    @NameInMap("passed")
    public Boolean passed;

    public static QueryEnterpriseidFaceauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseidFaceauthResponse self = new QueryEnterpriseidFaceauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseidFaceauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnterpriseidFaceauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnterpriseidFaceauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnterpriseidFaceauthResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryEnterpriseidFaceauthResponse setFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }
    public String getFailedCode() {
        return this.failedCode;
    }

    public QueryEnterpriseidFaceauthResponse setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }
    public String getFailedMessage() {
        return this.failedMessage;
    }

    public QueryEnterpriseidFaceauthResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

}
