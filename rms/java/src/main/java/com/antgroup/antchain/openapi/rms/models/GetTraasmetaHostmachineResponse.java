// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetTraasmetaHostmachineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // host_machine
    @NameInMap("host_machine")
    public TraasHostMachineDto hostMachine;

    public static GetTraasmetaHostmachineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraasmetaHostmachineResponse self = new GetTraasmetaHostmachineResponse();
        return TeaModel.build(map, self);
    }

    public GetTraasmetaHostmachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTraasmetaHostmachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTraasmetaHostmachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTraasmetaHostmachineResponse setHostMachine(TraasHostMachineDto hostMachine) {
        this.hostMachine = hostMachine;
        return this;
    }
    public TraasHostMachineDto getHostMachine() {
        return this.hostMachine;
    }

}
