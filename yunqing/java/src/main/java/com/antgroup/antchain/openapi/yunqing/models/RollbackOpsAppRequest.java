// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class RollbackOpsAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发布单id
    @NameInMap("ops_plan_id")
    @Validation(required = true)
    public String opsPlanId;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 需要回滚的快照版本
    @NameInMap("prod_snapshot_version")
    @Validation(required = true)
    public String prodSnapshotVersion;

    // 部署单元ID
    @NameInMap("unit_instance_id")
    @Validation(required = true)
    public String unitInstanceId;

    // 操作人Id
    @NameInMap("submitter_id")
    @Validation(required = true)
    public String submitterId;

    // 分组策略，默认使用SYSTEM_RECOMMENDATION
    @NameInMap("group_strategy")
    public String groupStrategy;

    public static RollbackOpsAppRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackOpsAppRequest self = new RollbackOpsAppRequest();
        return TeaModel.build(map, self);
    }

    public RollbackOpsAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackOpsAppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RollbackOpsAppRequest setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

    public RollbackOpsAppRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public RollbackOpsAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RollbackOpsAppRequest setProdSnapshotVersion(String prodSnapshotVersion) {
        this.prodSnapshotVersion = prodSnapshotVersion;
        return this;
    }
    public String getProdSnapshotVersion() {
        return this.prodSnapshotVersion;
    }

    public RollbackOpsAppRequest setUnitInstanceId(String unitInstanceId) {
        this.unitInstanceId = unitInstanceId;
        return this;
    }
    public String getUnitInstanceId() {
        return this.unitInstanceId;
    }

    public RollbackOpsAppRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

    public RollbackOpsAppRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

}
