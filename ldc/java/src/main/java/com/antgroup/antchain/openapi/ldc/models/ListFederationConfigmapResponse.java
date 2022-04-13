// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListFederationConfigmapResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // FedConfigMap List
    @NameInMap("configmaps")
    public java.util.List<FedConfigmap> configmaps;

    public static ListFederationConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFederationConfigmapResponse self = new ListFederationConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public ListFederationConfigmapResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListFederationConfigmapResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListFederationConfigmapResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListFederationConfigmapResponse setConfigmaps(java.util.List<FedConfigmap> configmaps) {
        this.configmaps = configmaps;
        return this;
    }
    public java.util.List<FedConfigmap> getConfigmaps() {
        return this.configmaps;
    }

}
