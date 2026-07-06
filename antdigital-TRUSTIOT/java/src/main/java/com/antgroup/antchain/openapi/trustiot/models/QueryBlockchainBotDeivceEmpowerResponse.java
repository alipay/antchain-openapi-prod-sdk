// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotDeivceEmpowerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权设备记录列表
    @NameInMap("devices")
    public java.util.List<EmpowerDeviceInfo> devices;

    public static QueryBlockchainBotDeivceEmpowerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotDeivceEmpowerResponse self = new QueryBlockchainBotDeivceEmpowerResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotDeivceEmpowerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotDeivceEmpowerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotDeivceEmpowerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotDeivceEmpowerResponse setDevices(java.util.List<EmpowerDeviceInfo> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<EmpowerDeviceInfo> getDevices() {
        return this.devices;
    }

}
