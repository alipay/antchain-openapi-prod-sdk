// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class WitnessApprovalData extends TeaModel {
    // 审批流程id
    /**
     * <strong>example:</strong>
     * <p>someId</p>
     */
    @NameInMap("approval_flow_id")
    public String approvalFlowId;

    // 印章id列表
    @NameInMap("seal_ids")
    public java.util.List<String> sealIds;

    public static WitnessApprovalData build(java.util.Map<String, ?> map) throws Exception {
        WitnessApprovalData self = new WitnessApprovalData();
        return TeaModel.build(map, self);
    }

    public WitnessApprovalData setApprovalFlowId(String approvalFlowId) {
        this.approvalFlowId = approvalFlowId;
        return this;
    }
    public String getApprovalFlowId() {
        return this.approvalFlowId;
    }

    public WitnessApprovalData setSealIds(java.util.List<String> sealIds) {
        this.sealIds = sealIds;
        return this;
    }
    public java.util.List<String> getSealIds() {
        return this.sealIds;
    }

}
