// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSidecarTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar 模板列表
    @NameInMap("sidecar_templates")
    public java.util.List<SidecarTemplate> sidecarTemplates;

    public static ListSidecarTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarTemplateResponse self = new ListSidecarTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListSidecarTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSidecarTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSidecarTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSidecarTemplateResponse setSidecarTemplates(java.util.List<SidecarTemplate> sidecarTemplates) {
        this.sidecarTemplates = sidecarTemplates;
        return this;
    }
    public java.util.List<SidecarTemplate> getSidecarTemplates() {
        return this.sidecarTemplates;
    }

}
