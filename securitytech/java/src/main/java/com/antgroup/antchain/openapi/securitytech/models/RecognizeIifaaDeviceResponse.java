// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RecognizeIifaaDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回数据内容
    @NameInMap("data")
    public String data;

    public static RecognizeIifaaDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIifaaDeviceResponse self = new RecognizeIifaaDeviceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeIifaaDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RecognizeIifaaDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RecognizeIifaaDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RecognizeIifaaDeviceResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
