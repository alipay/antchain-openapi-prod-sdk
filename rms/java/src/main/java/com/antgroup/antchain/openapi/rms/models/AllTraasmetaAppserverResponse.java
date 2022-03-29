// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaAppserverResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // app_servers
    @NameInMap("app_servers")
    public java.util.List<TraasAppServerDto> appServers;

    public static AllTraasmetaAppserverResponse build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaAppserverResponse self = new AllTraasmetaAppserverResponse();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaAppserverResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllTraasmetaAppserverResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllTraasmetaAppserverResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllTraasmetaAppserverResponse setAppServers(java.util.List<TraasAppServerDto> appServers) {
        this.appServers = appServers;
        return this;
    }
    public java.util.List<TraasAppServerDto> getAppServers() {
        return this.appServers;
    }

}
