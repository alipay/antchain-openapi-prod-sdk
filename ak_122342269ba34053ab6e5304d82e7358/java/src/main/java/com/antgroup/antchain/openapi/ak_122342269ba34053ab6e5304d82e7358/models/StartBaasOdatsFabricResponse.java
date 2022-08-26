// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class StartBaasOdatsFabricResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // fabric chain info的信息
    @NameInMap("data")
    public FabricChainInfo data;

    public static StartBaasOdatsFabricResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBaasOdatsFabricResponse self = new StartBaasOdatsFabricResponse();
        return TeaModel.build(map, self);
    }

    public StartBaasOdatsFabricResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartBaasOdatsFabricResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartBaasOdatsFabricResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartBaasOdatsFabricResponse setData(FabricChainInfo data) {
        this.data = data;
        return this;
    }
    public FabricChainInfo getData() {
        return this.data;
    }

}
