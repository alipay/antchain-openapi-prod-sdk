// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SyncIotbasicDevicegenerateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备私钥
    @NameInMap("device_key")
    public String deviceKey;

    // 设备认证id
    @NameInMap("sec_id")
    public String secId;

    public static SyncIotbasicDevicegenerateResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncIotbasicDevicegenerateResponse self = new SyncIotbasicDevicegenerateResponse();
        return TeaModel.build(map, self);
    }

    public SyncIotbasicDevicegenerateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncIotbasicDevicegenerateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncIotbasicDevicegenerateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncIotbasicDevicegenerateResponse setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
        return this;
    }
    public String getDeviceKey() {
        return this.deviceKey;
    }

    public SyncIotbasicDevicegenerateResponse setSecId(String secId) {
        this.secId = secId;
        return this;
    }
    public String getSecId() {
        return this.secId;
    }

}
