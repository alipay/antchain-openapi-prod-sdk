// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CheckOpticalIdentifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 光鉴智能凭证响应结果
    @NameInMap("data")
    public IdentityData data;

    public static CheckOpticalIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOpticalIdentifyResponse self = new CheckOpticalIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public CheckOpticalIdentifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckOpticalIdentifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckOpticalIdentifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckOpticalIdentifyResponse setData(IdentityData data) {
        this.data = data;
        return this;
    }
    public IdentityData getData() {
        return this.data;
    }

}
