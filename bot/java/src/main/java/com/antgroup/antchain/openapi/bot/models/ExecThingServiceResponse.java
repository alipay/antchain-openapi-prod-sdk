// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecThingServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备返回的数据
    @NameInMap("outputdata")
    public String outputdata;

    public static ExecThingServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecThingServiceResponse self = new ExecThingServiceResponse();
        return TeaModel.build(map, self);
    }

    public ExecThingServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecThingServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecThingServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecThingServiceResponse setOutputdata(String outputdata) {
        this.outputdata = outputdata;
        return this;
    }
    public String getOutputdata() {
        return this.outputdata;
    }

}
