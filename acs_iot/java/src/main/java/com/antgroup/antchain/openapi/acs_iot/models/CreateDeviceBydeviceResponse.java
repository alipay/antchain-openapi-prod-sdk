// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_iot.models;

import com.aliyun.tea.*;

public class CreateDeviceBydeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上唯一身份ID
    @NameInMap("chain_device_did")
    public String chainDeviceDid;

    // 设备激活文本-设备直连上链方式使用
    // 
    @NameInMap("active_data")
    public String activeData;

    public static CreateDeviceBydeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceBydeviceResponse self = new CreateDeviceBydeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceBydeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDeviceBydeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDeviceBydeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDeviceBydeviceResponse setChainDeviceDid(String chainDeviceDid) {
        this.chainDeviceDid = chainDeviceDid;
        return this;
    }
    public String getChainDeviceDid() {
        return this.chainDeviceDid;
    }

    public CreateDeviceBydeviceResponse setActiveData(String activeData) {
        this.activeData = activeData;
        return this;
    }
    public String getActiveData() {
        return this.activeData;
    }

}
