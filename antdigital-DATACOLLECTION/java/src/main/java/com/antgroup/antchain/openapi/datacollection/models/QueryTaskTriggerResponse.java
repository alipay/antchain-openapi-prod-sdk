// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class QueryTaskTriggerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // code 吗
    @NameInMap("code")
    public String code;

    // 描述
    @NameInMap("msg")
    public String msg;

    // 额外数据
    @NameInMap("data")
    public String data;

    public static QueryTaskTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskTriggerResponse self = new QueryTaskTriggerResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskTriggerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTaskTriggerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTaskTriggerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTaskTriggerResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTaskTriggerResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryTaskTriggerResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
