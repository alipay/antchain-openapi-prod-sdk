// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecAiotdatalinkInterfaceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回状态码，200 成功 其他失败
    @NameInMap("code")
    public Long code;

    // 返回描述信息
    @NameInMap("message")
    public String message;

    // 返回 data 数据， json 格式字符串，根据 api 接口不同，返回的数据会不同
    @NameInMap("data")
    public String data;

    public static ExecAiotdatalinkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAiotdatalinkInterfaceResponse self = new ExecAiotdatalinkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public ExecAiotdatalinkInterfaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAiotdatalinkInterfaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAiotdatalinkInterfaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAiotdatalinkInterfaceResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ExecAiotdatalinkInterfaceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecAiotdatalinkInterfaceResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
