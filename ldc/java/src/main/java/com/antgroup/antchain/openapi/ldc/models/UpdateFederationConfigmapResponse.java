// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFederationConfigmapResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // fedconfigmap data
    @NameInMap("configmap")
    public FedConfigmap configmap;

    public static UpdateFederationConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFederationConfigmapResponse self = new UpdateFederationConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFederationConfigmapResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateFederationConfigmapResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateFederationConfigmapResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateFederationConfigmapResponse setConfigmap(FedConfigmap configmap) {
        this.configmap = configmap;
        return this;
    }
    public FedConfigmap getConfigmap() {
        return this.configmap;
    }

}
