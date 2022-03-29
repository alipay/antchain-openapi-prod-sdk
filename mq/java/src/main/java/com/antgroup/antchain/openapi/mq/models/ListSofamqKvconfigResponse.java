// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqKvconfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // kv config page
    @NameInMap("data")
    public KVConfigPageDTO data;

    public static ListSofamqKvconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqKvconfigResponse self = new ListSofamqKvconfigResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqKvconfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqKvconfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqKvconfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqKvconfigResponse setData(KVConfigPageDTO data) {
        this.data = data;
        return this;
    }
    public KVConfigPageDTO getData() {
        return this.data;
    }

}
