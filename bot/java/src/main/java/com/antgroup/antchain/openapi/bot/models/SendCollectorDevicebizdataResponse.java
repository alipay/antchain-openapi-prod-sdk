// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SendCollectorDevicebizdataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据上链哈希
    @NameInMap("result_list")
    public java.util.List<SendCollectorResult> resultList;

    public static SendCollectorDevicebizdataResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCollectorDevicebizdataResponse self = new SendCollectorDevicebizdataResponse();
        return TeaModel.build(map, self);
    }

    public SendCollectorDevicebizdataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendCollectorDevicebizdataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendCollectorDevicebizdataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendCollectorDevicebizdataResponse setResultList(java.util.List<SendCollectorResult> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<SendCollectorResult> getResultList() {
        return this.resultList;
    }

}
