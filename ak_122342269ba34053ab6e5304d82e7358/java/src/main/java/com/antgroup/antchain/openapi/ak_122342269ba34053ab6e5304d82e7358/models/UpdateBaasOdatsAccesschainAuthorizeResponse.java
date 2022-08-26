// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class UpdateBaasOdatsAccesschainAuthorizeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跨链访问数据授权信息
    @NameInMap("data")
    public AccessChainInfo data;

    public static UpdateBaasOdatsAccesschainAuthorizeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasOdatsAccesschainAuthorizeResponse self = new UpdateBaasOdatsAccesschainAuthorizeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBaasOdatsAccesschainAuthorizeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateBaasOdatsAccesschainAuthorizeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateBaasOdatsAccesschainAuthorizeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateBaasOdatsAccesschainAuthorizeResponse setData(AccessChainInfo data) {
        this.data = data;
        return this;
    }
    public AccessChainInfo getData() {
        return this.data;
    }

}
