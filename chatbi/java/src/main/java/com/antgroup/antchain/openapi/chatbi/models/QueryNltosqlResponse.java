// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.chatbi.models;

import com.aliyun.tea.*;

public class QueryNltosqlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 文字解释说明
    @NameInMap("explanation")
    public String explanation;

    // 消息ID
    @NameInMap("messageid")
    public String messageid;

    public static QueryNltosqlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNltosqlResponse self = new QueryNltosqlResponse();
        return TeaModel.build(map, self);
    }

    public QueryNltosqlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNltosqlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNltosqlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNltosqlResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryNltosqlResponse setExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }
    public String getExplanation() {
        return this.explanation;
    }

    public QueryNltosqlResponse setMessageid(String messageid) {
        this.messageid = messageid;
        return this;
    }
    public String getMessageid() {
        return this.messageid;
    }

}
