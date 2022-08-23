// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CreateAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 执行运维操作的目标应用列表。
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // 执行运维操作的目标容器列表。当ops_dimension为CONTAINER时，该参数必填。
    @NameInMap("container_ids")
    public java.util.List<String> containerIds;

    // 目标环境唯一标识。
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启，RECOVERY_RESTART：容灾重启，DISABLE_SLB_TRAFFIC:应用摘流，ENABLE_SLB_TRAFFIC:应用挂流。
    @NameInMap("ops_action")
    @Validation(required = true)
    public String opsAction;

    // 应用运维维度。两种取值：APP_SERVICE、CONTAINER。
    @NameInMap("ops_dimension")
    @Validation(required = true)
    public String opsDimension;

    // 要执行运维操作的应用服务实例所在的单元。
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    // 操作人ID
    @NameInMap("submitter_id")
    public String submitterId;

    // 操作人名称（花名或者真名）
    @NameInMap("submitter_name")
    public String submitterName;

    // 应用容器分组策略，默认取SYSTEM_RECOMMENDATION
    @NameInMap("group_strategy")
    public String groupStrategy;

    public static CreateAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppopsRequest self = new CreateAppopsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppopsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAppopsRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public CreateAppopsRequest setContainerIds(java.util.List<String> containerIds) {
        this.containerIds = containerIds;
        return this;
    }
    public java.util.List<String> getContainerIds() {
        return this.containerIds;
    }

    public CreateAppopsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CreateAppopsRequest setOpsAction(String opsAction) {
        this.opsAction = opsAction;
        return this;
    }
    public String getOpsAction() {
        return this.opsAction;
    }

    public CreateAppopsRequest setOpsDimension(String opsDimension) {
        this.opsDimension = opsDimension;
        return this;
    }
    public String getOpsDimension() {
        return this.opsDimension;
    }

    public CreateAppopsRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public CreateAppopsRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

    public CreateAppopsRequest setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }
    public String getSubmitterName() {
        return this.submitterName;
    }

    public CreateAppopsRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

}
