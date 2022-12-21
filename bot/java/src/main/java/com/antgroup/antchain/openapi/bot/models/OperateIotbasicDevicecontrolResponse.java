// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicDevicecontrolResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 操作成功的设备did列表
    @NameInMap("success_list")
    public java.util.List<String> successList;

    // 操作失败的设备did及失败信息列表
    @NameInMap("fail_list")
    public java.util.List<DeviceControlFail> failList;

    public static OperateIotbasicDevicecontrolResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicDevicecontrolResponse self = new OperateIotbasicDevicecontrolResponse();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicDevicecontrolResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateIotbasicDevicecontrolResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateIotbasicDevicecontrolResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateIotbasicDevicecontrolResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OperateIotbasicDevicecontrolResponse setSuccessList(java.util.List<String> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<String> getSuccessList() {
        return this.successList;
    }

    public OperateIotbasicDevicecontrolResponse setFailList(java.util.List<DeviceControlFail> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<DeviceControlFail> getFailList() {
        return this.failList;
    }

}
