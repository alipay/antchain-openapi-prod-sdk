// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateFederationConfigmapResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // FedConfigMap 数据
    @NameInMap("configmap")
    public FedConfigmap configmap;

    public static CreateFederationConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFederationConfigmapResponse self = new CreateFederationConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public CreateFederationConfigmapResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateFederationConfigmapResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateFederationConfigmapResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateFederationConfigmapResponse setConfigmap(FedConfigmap configmap) {
        this.configmap = configmap;
        return this;
    }
    public FedConfigmap getConfigmap() {
        return this.configmap;
    }

}
