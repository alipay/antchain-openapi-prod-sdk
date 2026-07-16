// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class ExecApiAuthtemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回的下一层节点集合
    @NameInMap("nodes")
    public java.util.List<TreeNode> nodes;

    // 树id
    @NameInMap("tree_template_id")
    public String treeTemplateId;

    // 授权状态,提交接口此字段为空
    // 1、正在处理中
    // 2、登陆成功
    @NameInMap("auth_state")
    public String authState;

    // 请求是否成功
    // true 成功
    // false 失败
    @NameInMap("success")
    public Boolean success;

    public static ExecApiAuthtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecApiAuthtemplateResponse self = new ExecApiAuthtemplateResponse();
        return TeaModel.build(map, self);
    }

    public ExecApiAuthtemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecApiAuthtemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecApiAuthtemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecApiAuthtemplateResponse setNodes(java.util.List<TreeNode> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<TreeNode> getNodes() {
        return this.nodes;
    }

    public ExecApiAuthtemplateResponse setTreeTemplateId(String treeTemplateId) {
        this.treeTemplateId = treeTemplateId;
        return this;
    }
    public String getTreeTemplateId() {
        return this.treeTemplateId;
    }

    public ExecApiAuthtemplateResponse setAuthState(String authState) {
        this.authState = authState;
        return this;
    }
    public String getAuthState() {
        return this.authState;
    }

    public ExecApiAuthtemplateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
