// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class StartBaasOdatsCrosschainAuthorizeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跨链调用信息结构体
    @NameInMap("data")
    public CrossChainInfo data;

    public static StartBaasOdatsCrosschainAuthorizeResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBaasOdatsCrosschainAuthorizeResponse self = new StartBaasOdatsCrosschainAuthorizeResponse();
        return TeaModel.build(map, self);
    }

    public StartBaasOdatsCrosschainAuthorizeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartBaasOdatsCrosschainAuthorizeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartBaasOdatsCrosschainAuthorizeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartBaasOdatsCrosschainAuthorizeResponse setData(CrossChainInfo data) {
        this.data = data;
        return this;
    }
    public CrossChainInfo getData() {
        return this.data;
    }

}
