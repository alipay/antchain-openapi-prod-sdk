// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryStatusflowTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 联盟ID
    @NameInMap("union_id")
    public String unionId;

    // 状态流模版名称
    @NameInMap("flow_name")
    public String flowName;

    // 自定义流程返回DTO
    @NameInMap("list_template_process")
    public java.util.List<FlowTemplate> listTemplateProcess;

    public static QueryStatusflowTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatusflowTemplateResponse self = new QueryStatusflowTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatusflowTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStatusflowTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStatusflowTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStatusflowTemplateResponse setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public QueryStatusflowTemplateResponse setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public QueryStatusflowTemplateResponse setListTemplateProcess(java.util.List<FlowTemplate> listTemplateProcess) {
        this.listTemplateProcess = listTemplateProcess;
        return this;
    }
    public java.util.List<FlowTemplate> getListTemplateProcess() {
        return this.listTemplateProcess;
    }

}
