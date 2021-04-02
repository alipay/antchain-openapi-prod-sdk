// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetPeripheralBychainperipheralidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 外围设备信息
    @NameInMap("peripheral")
    public Peripheral peripheral;

    public static GetPeripheralBychainperipheralidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPeripheralBychainperipheralidResponse self = new GetPeripheralBychainperipheralidResponse();
        return TeaModel.build(map, self);
    }

    public GetPeripheralBychainperipheralidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetPeripheralBychainperipheralidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetPeripheralBychainperipheralidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetPeripheralBychainperipheralidResponse setPeripheral(Peripheral peripheral) {
        this.peripheral = peripheral;
        return this;
    }
    public Peripheral getPeripheral() {
        return this.peripheral;
    }

}
