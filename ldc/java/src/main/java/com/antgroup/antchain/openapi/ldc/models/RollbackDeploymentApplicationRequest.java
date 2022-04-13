// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RollbackDeploymentApplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 待回滚的应用名称，必须是部署单中包含的应用
    @NameInMap("application_name")
    @Validation(required = true)
    public String applicationName;

    // 应用的回滚版本，如果不指定，默认回滚到最近一次发布成功的版本
    @NameInMap("version_no")
    public String versionNo;

    // 回滚时的分组策略，取值为：
    //                              QUICK：快速分组；
    //                              EACH_ONE：每台一组；
    //                              UNIT：按逻辑单元分组；
    //                              CELL：按部署单元分组；
    //                              默认为QUICK
    //                 
    @NameInMap("group_strategy")
    public String groupStrategy;

    // 分组数，默认为3
    @NameInMap("group_count")
    public Integer groupCount;

    // 回滚原因
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // 操作人
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    public static RollbackDeploymentApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackDeploymentApplicationRequest self = new RollbackDeploymentApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RollbackDeploymentApplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackDeploymentApplicationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RollbackDeploymentApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public RollbackDeploymentApplicationRequest setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public RollbackDeploymentApplicationRequest setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public RollbackDeploymentApplicationRequest setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Integer getGroupCount() {
        return this.groupCount;
    }

    public RollbackDeploymentApplicationRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public RollbackDeploymentApplicationRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

}
