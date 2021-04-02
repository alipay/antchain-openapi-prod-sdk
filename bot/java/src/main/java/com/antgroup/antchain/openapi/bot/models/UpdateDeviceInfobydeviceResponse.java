// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateDeviceInfobydeviceResponse extends TeaModel {
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
    @NameInMap("chain_device_id")
    public String chainDeviceId;

    // 发行设备Id
    // 
    // 
    @NameInMap("distribute_device_id")
    public String distributeDeviceId;

    public static UpdateDeviceInfobydeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceInfobydeviceResponse self = new UpdateDeviceInfobydeviceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceInfobydeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDeviceInfobydeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDeviceInfobydeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDeviceInfobydeviceResponse setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public UpdateDeviceInfobydeviceResponse setDistributeDeviceId(String distributeDeviceId) {
        this.distributeDeviceId = distributeDeviceId;
        return this;
    }
    public String getDistributeDeviceId() {
        return this.distributeDeviceId;
    }

}
