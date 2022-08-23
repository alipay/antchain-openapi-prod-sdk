// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class RollbackOpsProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要回滚的解决方案ID
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 需要回滚的快照版本
    @NameInMap("prod_snapshot_version")
    @Validation(required = true)
    public String prodSnapshotVersion;

    // 分组策略
    @NameInMap("group_strategy")
    public String groupStrategy;

    // 部署单元ID
    @NameInMap("unit_instance_id")
    @Validation(required = true)
    public String unitInstanceId;

    // 操作人ID
    @NameInMap("submitter_id")
    @Validation(required = true)
    public String submitterId;

    // 操作人名称（花名或者真名）
    @NameInMap("submitter_name")
    public String submitterName;

    public static RollbackOpsProductRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackOpsProductRequest self = new RollbackOpsProductRequest();
        return TeaModel.build(map, self);
    }

    public RollbackOpsProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackOpsProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RollbackOpsProductRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public RollbackOpsProductRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public RollbackOpsProductRequest setProdSnapshotVersion(String prodSnapshotVersion) {
        this.prodSnapshotVersion = prodSnapshotVersion;
        return this;
    }
    public String getProdSnapshotVersion() {
        return this.prodSnapshotVersion;
    }

    public RollbackOpsProductRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public RollbackOpsProductRequest setUnitInstanceId(String unitInstanceId) {
        this.unitInstanceId = unitInstanceId;
        return this;
    }
    public String getUnitInstanceId() {
        return this.unitInstanceId;
    }

    public RollbackOpsProductRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

    public RollbackOpsProductRequest setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }
    public String getSubmitterName() {
        return this.submitterName;
    }

}
