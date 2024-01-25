// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAcopmTestobjectTestsubResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // msgId
    @NameInMap("msgid")
    public String msgid;

    // providerId
    @NameInMap("providerid")
    public String providerid;

    public static QueryAcopmTestobjectTestsubResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAcopmTestobjectTestsubResponse self = new QueryAcopmTestobjectTestsubResponse();
        return TeaModel.build(map, self);
    }

    public QueryAcopmTestobjectTestsubResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAcopmTestobjectTestsubResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAcopmTestobjectTestsubResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAcopmTestobjectTestsubResponse setMsgid(String msgid) {
        this.msgid = msgid;
        return this;
    }
    public String getMsgid() {
        return this.msgid;
    }

    public QueryAcopmTestobjectTestsubResponse setProviderid(String providerid) {
        this.providerid = providerid;
        return this;
    }
    public String getProviderid() {
        return this.providerid;
    }

}
