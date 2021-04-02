// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceBydeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上设备Id
    // 
    // 
    @NameInMap("chain_deviceid")
    public String chainDeviceid;

    // 发行设备Id
    // 
    // 
    @NameInMap("distribute_device_id")
    public String distributeDeviceId;

    public static CreateDistributedeviceBydeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceBydeviceResponse self = new CreateDistributedeviceBydeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceBydeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDistributedeviceBydeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDistributedeviceBydeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDistributedeviceBydeviceResponse setChainDeviceid(String chainDeviceid) {
        this.chainDeviceid = chainDeviceid;
        return this;
    }
    public String getChainDeviceid() {
        return this.chainDeviceid;
    }

    public CreateDistributedeviceBydeviceResponse setDistributeDeviceId(String distributeDeviceId) {
        this.distributeDeviceId = distributeDeviceId;
        return this;
    }
    public String getDistributeDeviceId() {
        return this.distributeDeviceId;
    }

}
