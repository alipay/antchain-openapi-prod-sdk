// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetContainerserviceRevisionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 容器服务版本信息。
    @NameInMap("revision")
    public ContainerServiceRevision revision;

    public static GetContainerserviceRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContainerserviceRevisionResponse self = new GetContainerserviceRevisionResponse();
        return TeaModel.build(map, self);
    }

    public GetContainerserviceRevisionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetContainerserviceRevisionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetContainerserviceRevisionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetContainerserviceRevisionResponse setRevision(ContainerServiceRevision revision) {
        this.revision = revision;
        return this;
    }
    public ContainerServiceRevision getRevision() {
        return this.revision;
    }

}
