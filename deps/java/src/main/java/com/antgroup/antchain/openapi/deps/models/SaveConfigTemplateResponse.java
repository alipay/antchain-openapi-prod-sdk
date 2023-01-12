// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SaveConfigTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用参数模板 id
    @NameInMap("tpl_id")
    public String tplId;

    public static SaveConfigTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigTemplateResponse self = new SaveConfigTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SaveConfigTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveConfigTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveConfigTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveConfigTemplateResponse setTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }
    public String getTplId() {
        return this.tplId;
    }

}
