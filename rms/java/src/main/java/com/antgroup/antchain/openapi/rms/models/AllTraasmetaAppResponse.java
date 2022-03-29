// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AllTraasmetaAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // appdto
    @NameInMap("apps")
    public java.util.List<TraasAppDto> apps;

    public static AllTraasmetaAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AllTraasmetaAppResponse self = new AllTraasmetaAppResponse();
        return TeaModel.build(map, self);
    }

    public AllTraasmetaAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllTraasmetaAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllTraasmetaAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllTraasmetaAppResponse setApps(java.util.List<TraasAppDto> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<TraasAppDto> getApps() {
        return this.apps;
    }

}
