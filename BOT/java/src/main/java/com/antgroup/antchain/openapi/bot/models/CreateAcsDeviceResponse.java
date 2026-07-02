// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateAcsDeviceResponse extends TeaModel {
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
    @NameInMap("chain_deviceid")
    public String chainDeviceid;

    // 发行设备ID
    @NameInMap("distribute_device_id")
    public String distributeDeviceId;

    // 设备激活文本-设备直连上链方式使用
    @NameInMap("active_data")
    public String activeData;

    public static CreateAcsDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAcsDeviceResponse self = new CreateAcsDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAcsDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAcsDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAcsDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAcsDeviceResponse setChainDeviceid(String chainDeviceid) {
        this.chainDeviceid = chainDeviceid;
        return this;
    }
    public String getChainDeviceid() {
        return this.chainDeviceid;
    }

    public CreateAcsDeviceResponse setDistributeDeviceId(String distributeDeviceId) {
        this.distributeDeviceId = distributeDeviceId;
        return this;
    }
    public String getDistributeDeviceId() {
        return this.distributeDeviceId;
    }

    public CreateAcsDeviceResponse setActiveData(String activeData) {
        this.activeData = activeData;
        return this;
    }
    public String getActiveData() {
        return this.activeData;
    }

}
