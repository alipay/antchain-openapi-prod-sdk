// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryEnterpriseFaceauthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证唯一性标识
    @NameInMap("biz_no")
    public String bizNo;

    // 认证失败错误码
    @NameInMap("failed_code")
    public String failedCode;

    // 认证是否通过
    @NameInMap("passed")
    public Boolean passed;

    public static QueryEnterpriseFaceauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseFaceauthResponse self = new QueryEnterpriseFaceauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseFaceauthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnterpriseFaceauthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnterpriseFaceauthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnterpriseFaceauthResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryEnterpriseFaceauthResponse setFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }
    public String getFailedCode() {
        return this.failedCode;
    }

    public QueryEnterpriseFaceauthResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

}
