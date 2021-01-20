// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateConfigTemplateResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用参数模板 id
    @NameInMap("tpl_id")
    public String tplId;

    public static CreateConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigTemplateResponse self = new CreateConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateConfigTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateConfigTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateConfigTemplateResponse setTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }
    public String getTplId() {
        return this.tplId;
    }

}
