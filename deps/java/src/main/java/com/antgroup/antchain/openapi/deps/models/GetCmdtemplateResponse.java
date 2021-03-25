// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetCmdtemplateResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 指令模板详情
    @NameInMap("template")
    @Validation(required = true)
    public CmdTemplate template;

    public static GetCmdtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCmdtemplateResponse self = new GetCmdtemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetCmdtemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCmdtemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCmdtemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCmdtemplateResponse setTemplate(CmdTemplate template) {
        this.template = template;
        return this;
    }
    public CmdTemplate getTemplate() {
        return this.template;
    }

}
