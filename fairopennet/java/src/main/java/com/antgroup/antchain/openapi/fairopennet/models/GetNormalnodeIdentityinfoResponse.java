// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class GetNormalnodeIdentityinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  
    @NameInMap("normal_node_identity_info")
    public NormalNodeIdentityInfo normalNodeIdentityInfo;

    public static GetNormalnodeIdentityinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNormalnodeIdentityinfoResponse self = new GetNormalnodeIdentityinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetNormalnodeIdentityinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetNormalnodeIdentityinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetNormalnodeIdentityinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetNormalnodeIdentityinfoResponse setNormalNodeIdentityInfo(NormalNodeIdentityInfo normalNodeIdentityInfo) {
        this.normalNodeIdentityInfo = normalNodeIdentityInfo;
        return this;
    }
    public NormalNodeIdentityInfo getNormalNodeIdentityInfo() {
        return this.normalNodeIdentityInfo;
    }

}
