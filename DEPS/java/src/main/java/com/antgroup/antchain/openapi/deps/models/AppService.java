// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppService extends TeaModel {
    // 应用名称
    @NameInMap("application_name")
    public String applicationName;

    // 关联的部署单元
    @NameInMap("cell_ids")
    public java.util.List<String> cellIds;

    // 服务实例描述
    @NameInMap("description")
    public String description;

    // 用户自定义的扩展属性
    @NameInMap("extra_infos")
    public String extraInfos;

    // 最近一次执行的运维操作单号
    @NameInMap("latest_operation_id")
    public String latestOperationId;

    // 最近一次执行的运维操作类型。取值列表：
    //                     DEPLOYMENT：部署操作
    //                 
    @NameInMap("latest_operation_type")
    public String latestOperationType;

    // 最近成功部署的版本号
    @NameInMap("latest_version_no")
    public String latestVersionNo;

    // 服务实例名称
    @NameInMap("service_name")
    public String serviceName;

    // 环境名称
    @NameInMap("workspace")
    public String workspace;

    public static AppService build(java.util.Map<String, ?> map) throws Exception {
        AppService self = new AppService();
        return TeaModel.build(map, self);
    }

    public AppService setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public AppService setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public AppService setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppService setExtraInfos(String extraInfos) {
        this.extraInfos = extraInfos;
        return this;
    }
    public String getExtraInfos() {
        return this.extraInfos;
    }

    public AppService setLatestOperationId(String latestOperationId) {
        this.latestOperationId = latestOperationId;
        return this;
    }
    public String getLatestOperationId() {
        return this.latestOperationId;
    }

    public AppService setLatestOperationType(String latestOperationType) {
        this.latestOperationType = latestOperationType;
        return this;
    }
    public String getLatestOperationType() {
        return this.latestOperationType;
    }

    public AppService setLatestVersionNo(String latestVersionNo) {
        this.latestVersionNo = latestVersionNo;
        return this;
    }
    public String getLatestVersionNo() {
        return this.latestVersionNo;
    }

    public AppService setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public AppService setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
