// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceByperipheralidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发行设备Id
    // 
    @NameInMap("distribute_device_id")
    public String distributeDeviceId;

    // 链上外围设备Id
    // 
    @NameInMap("chain_peripheral_id")
    public String chainPeripheralId;

    public static CreateDistributedeviceByperipheralidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceByperipheralidResponse self = new CreateDistributedeviceByperipheralidResponse();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceByperipheralidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDistributedeviceByperipheralidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDistributedeviceByperipheralidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDistributedeviceByperipheralidResponse setDistributeDeviceId(String distributeDeviceId) {
        this.distributeDeviceId = distributeDeviceId;
        return this;
    }
    public String getDistributeDeviceId() {
        return this.distributeDeviceId;
    }

    public CreateDistributedeviceByperipheralidResponse setChainPeripheralId(String chainPeripheralId) {
        this.chainPeripheralId = chainPeripheralId;
        return this;
    }
    public String getChainPeripheralId() {
        return this.chainPeripheralId;
    }

}
