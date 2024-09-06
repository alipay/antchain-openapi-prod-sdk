// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class QueryAntdigitalMediasmsMsgStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 信息发送状态
    @NameInMap("data")
    public SmsSendStatus data;

    public static QueryAntdigitalMediasmsMsgStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalMediasmsMsgStatusResponse self = new QueryAntdigitalMediasmsMsgStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalMediasmsMsgStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalMediasmsMsgStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalMediasmsMsgStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalMediasmsMsgStatusResponse setData(SmsSendStatus data) {
        this.data = data;
        return this;
    }
    public SmsSendStatus getData() {
        return this.data;
    }

}
