// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqDlqbygroupidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 消息内容
    @NameInMap("data")
    public MessageGetPageDTO data;

    public static QuerySofamqDlqbygroupidResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqDlqbygroupidResponse self = new QuerySofamqDlqbygroupidResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqDlqbygroupidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySofamqDlqbygroupidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySofamqDlqbygroupidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySofamqDlqbygroupidResponse setData(MessageGetPageDTO data) {
        this.data = data;
        return this;
    }
    public MessageGetPageDTO getData() {
        return this.data;
    }

}
