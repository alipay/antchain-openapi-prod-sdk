// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerWithholdjdsignurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 京东签约串
    @NameInMap("sign_str")
    public String signStr;

    public static CreateInnerWithholdjdsignurlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerWithholdjdsignurlResponse self = new CreateInnerWithholdjdsignurlResponse();
        return TeaModel.build(map, self);
    }

    public CreateInnerWithholdjdsignurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateInnerWithholdjdsignurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateInnerWithholdjdsignurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateInnerWithholdjdsignurlResponse setSignStr(String signStr) {
        this.signStr = signStr;
        return this;
    }
    public String getSignStr() {
        return this.signStr;
    }

}
