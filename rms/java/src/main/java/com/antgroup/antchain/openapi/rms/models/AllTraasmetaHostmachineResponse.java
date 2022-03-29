// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaHostmachineResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // hosts
    @NameInMap("hosts")
    public java.util.List<TraasHostMachineDto> hosts;

    public static AllTraasmetaHostmachineResponse build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaHostmachineResponse self = new AllTraasmetaHostmachineResponse();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaHostmachineResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllTraasmetaHostmachineResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllTraasmetaHostmachineResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllTraasmetaHostmachineResponse setHosts(java.util.List<TraasHostMachineDto> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<TraasHostMachineDto> getHosts() {
        return this.hosts;
    }

}
