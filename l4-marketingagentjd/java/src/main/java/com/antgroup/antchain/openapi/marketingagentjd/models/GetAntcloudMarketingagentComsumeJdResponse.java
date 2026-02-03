// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagentjd.models;

import com.aliyun.tea.*;

public class GetAntcloudMarketingagentComsumeJdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码：SUCCESS/FAIL
    @NameInMap("code")
    public String code;

    // 结果描述：成功或失败原因
    @NameInMap("message")
    public String message;

    public static GetAntcloudMarketingagentComsumeJdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntcloudMarketingagentComsumeJdResponse self = new GetAntcloudMarketingagentComsumeJdResponse();
        return TeaModel.build(map, self);
    }

    public GetAntcloudMarketingagentComsumeJdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAntcloudMarketingagentComsumeJdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAntcloudMarketingagentComsumeJdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAntcloudMarketingagentComsumeJdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAntcloudMarketingagentComsumeJdResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
