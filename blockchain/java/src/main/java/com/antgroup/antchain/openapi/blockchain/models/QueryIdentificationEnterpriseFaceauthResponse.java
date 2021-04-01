// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryIdentificationEnterpriseFaceauthResponse extends TeaModel {
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

    public static QueryIdentificationEnterpriseFaceauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentificationEnterpriseFaceauthResponse self = new QueryIdentificationEnterpriseFaceauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryIdentificationEnterpriseFaceauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIdentificationEnterpriseFaceauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIdentificationEnterpriseFaceauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIdentificationEnterpriseFaceauthResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryIdentificationEnterpriseFaceauthResponse setFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }
    public String getFailedCode() {
        return this.failedCode;
    }

    public QueryIdentificationEnterpriseFaceauthResponse setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }
    public String getFailedMessage() {
        return this.failedMessage;
    }

    public QueryIdentificationEnterpriseFaceauthResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

}
