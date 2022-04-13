// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSidecaropsTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回的特定类型的sidecar版本信息列表，只取最近的20条
    @NameInMap("sidecar_templates")
    public java.util.List<SidecarTemplateMeta> sidecarTemplates;

    public static ListSidecaropsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSidecaropsTemplateResponse self = new ListSidecaropsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListSidecaropsTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSidecaropsTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSidecaropsTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSidecaropsTemplateResponse setSidecarTemplates(java.util.List<SidecarTemplateMeta> sidecarTemplates) {
        this.sidecarTemplates = sidecarTemplates;
        return this;
    }
    public java.util.List<SidecarTemplateMeta> getSidecarTemplates() {
        return this.sidecarTemplates;
    }

}
