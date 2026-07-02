// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotbasicDeviceorderbatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口是否执行成功
    @NameInMap("success")
    public Boolean success;

    // 订单上链成功的集合
    @NameInMap("success_list")
    public java.util.List<DeviceOrderResult> successList;

    // 订单上链失败的集合
    @NameInMap("fail_list")
    public java.util.List<DeviceOrderFail> failList;

    public static ImportIotbasicDeviceorderbatchResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportIotbasicDeviceorderbatchResponse self = new ImportIotbasicDeviceorderbatchResponse();
        return TeaModel.build(map, self);
    }

    public ImportIotbasicDeviceorderbatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportIotbasicDeviceorderbatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportIotbasicDeviceorderbatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportIotbasicDeviceorderbatchResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportIotbasicDeviceorderbatchResponse setSuccessList(java.util.List<DeviceOrderResult> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<DeviceOrderResult> getSuccessList() {
        return this.successList;
    }

    public ImportIotbasicDeviceorderbatchResponse setFailList(java.util.List<DeviceOrderFail> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<DeviceOrderFail> getFailList() {
        return this.failList;
    }

}
