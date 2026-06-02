// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QuerySmsDomesticResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 短信发送详情
    @NameInMap("send_datals")
    public java.util.List<SmsSendDetail> sendDatals;

    public static QuerySmsDomesticResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsDomesticResponse self = new QuerySmsDomesticResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsDomesticResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySmsDomesticResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySmsDomesticResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySmsDomesticResponse setSendDatals(java.util.List<SmsSendDetail> sendDatals) {
        this.sendDatals = sendDatals;
        return this;
    }
    public java.util.List<SmsSendDetail> getSendDatals() {
        return this.sendDatals;
    }

}
