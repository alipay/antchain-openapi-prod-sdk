// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class FinishFlowInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // legal标URL，只有当入参needLegalLogo为true且响应resultCode=200时才会返回
    @NameInMap("legal_logo_url")
    public String legalLogoUrl;

    public static FinishFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishFlowInstanceResponse self = new FinishFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public FinishFlowInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FinishFlowInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FinishFlowInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FinishFlowInstanceResponse setLegalLogoUrl(String legalLogoUrl) {
        this.legalLogoUrl = legalLogoUrl;
        return this;
    }
    public String getLegalLogoUrl() {
        return this.legalLogoUrl;
    }

}
