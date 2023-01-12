// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetCmdtemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 指令模板详情
    @NameInMap("template")
    @Validation(required = true)
    public CmdTemplate template;

    // 作用域
    @NameInMap("scope")
    public String scope;

    // 作用域id
    @NameInMap("scope_ids")
    public java.util.List<String> scopeIds;

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

    public GetCmdtemplateResponse setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetCmdtemplateResponse setScopeIds(java.util.List<String> scopeIds) {
        this.scopeIds = scopeIds;
        return this;
    }
    public java.util.List<String> getScopeIds() {
        return this.scopeIds;
    }

}
