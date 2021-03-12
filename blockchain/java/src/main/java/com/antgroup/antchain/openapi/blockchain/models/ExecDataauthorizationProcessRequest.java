// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecDataauthorizationProcessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审批操作意见
    @NameInMap("comment")
    @Validation(required = true)
    public String comment;

    // 扩展参数
    @NameInMap("extension_info")
    public String extensionInfo;

    // 新节点ID列表
    @NameInMap("forward_node_ids")
    public java.util.List<String> forwardNodeIds;

    // 审批操作结果
    @NameInMap("operate_result")
    @Validation(required = true)
    public String operateResult;

    // 审批操作时间
    @NameInMap("operate_time")
    @Validation(required = true)
    public Long operateTime;

    // 审批操作人ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 流程ID
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    public static ExecDataauthorizationProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataauthorizationProcessRequest self = new ExecDataauthorizationProcessRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataauthorizationProcessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDataauthorizationProcessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDataauthorizationProcessRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ExecDataauthorizationProcessRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public ExecDataauthorizationProcessRequest setForwardNodeIds(java.util.List<String> forwardNodeIds) {
        this.forwardNodeIds = forwardNodeIds;
        return this;
    }
    public java.util.List<String> getForwardNodeIds() {
        return this.forwardNodeIds;
    }

    public ExecDataauthorizationProcessRequest setOperateResult(String operateResult) {
        this.operateResult = operateResult;
        return this;
    }
    public String getOperateResult() {
        return this.operateResult;
    }

    public ExecDataauthorizationProcessRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public ExecDataauthorizationProcessRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ExecDataauthorizationProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
