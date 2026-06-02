// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QueryCardsmsDomesticResponse extends TeaModel {
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
    public java.util.List<CradSmsSendDetail> sendDatals;

    public static QueryCardsmsDomesticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardsmsDomesticResponse self = new QueryCardsmsDomesticResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardsmsDomesticResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCardsmsDomesticResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCardsmsDomesticResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCardsmsDomesticResponse setSendDatals(java.util.List<CradSmsSendDetail> sendDatals) {
        this.sendDatals = sendDatals;
        return this;
    }
    public java.util.List<CradSmsSendDetail> getSendDatals() {
        return this.sendDatals;
    }

}
