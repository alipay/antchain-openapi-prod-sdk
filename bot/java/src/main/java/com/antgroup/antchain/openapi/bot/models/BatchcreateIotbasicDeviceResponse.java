// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BatchcreateIotbasicDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 注册成功集合
    @NameInMap("success_list")
    public java.util.List<IotBasicDeviceRegisterResult> successList;

    // 注册失败集合
    @NameInMap("fail_list")
    public java.util.List<IotBasicDeviceRegisterFail> failList;

    public static BatchcreateIotbasicDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateIotbasicDeviceResponse self = new BatchcreateIotbasicDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateIotbasicDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateIotbasicDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateIotbasicDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateIotbasicDeviceResponse setSuccessList(java.util.List<IotBasicDeviceRegisterResult> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<IotBasicDeviceRegisterResult> getSuccessList() {
        return this.successList;
    }

    public BatchcreateIotbasicDeviceResponse setFailList(java.util.List<IotBasicDeviceRegisterFail> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<IotBasicDeviceRegisterFail> getFailList() {
        return this.failList;
    }

}
