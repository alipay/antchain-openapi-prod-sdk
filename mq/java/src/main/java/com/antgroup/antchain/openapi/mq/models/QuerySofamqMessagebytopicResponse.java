// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqMessagebytopicResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页查询Message
    @NameInMap("data")
    public MessageGetPageDTO data;

    public static QuerySofamqMessagebytopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqMessagebytopicResponse self = new QuerySofamqMessagebytopicResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqMessagebytopicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqMessagebytopicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqMessagebytopicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqMessagebytopicResponse setData(MessageGetPageDTO data) {
        this.data = data;
        return this;
    }
    public MessageGetPageDTO getData() {
        return this.data;
    }

}
