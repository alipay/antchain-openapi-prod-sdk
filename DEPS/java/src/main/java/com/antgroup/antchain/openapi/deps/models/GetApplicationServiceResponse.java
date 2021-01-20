// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetApplicationServiceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名称
    @NameInMap("application_name")
    public String applicationName;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

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
    //                             DEPLOYMENT：部署操作
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

    public static GetApplicationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationServiceResponse self = new GetApplicationServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetApplicationServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetApplicationServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetApplicationServiceResponse setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public GetApplicationServiceResponse setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public GetApplicationServiceResponse setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public GetApplicationServiceResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetApplicationServiceResponse setExtraInfos(String extraInfos) {
        this.extraInfos = extraInfos;
        return this;
    }
    public String getExtraInfos() {
        return this.extraInfos;
    }

    public GetApplicationServiceResponse setLatestOperationId(String latestOperationId) {
        this.latestOperationId = latestOperationId;
        return this;
    }
    public String getLatestOperationId() {
        return this.latestOperationId;
    }

    public GetApplicationServiceResponse setLatestOperationType(String latestOperationType) {
        this.latestOperationType = latestOperationType;
        return this;
    }
    public String getLatestOperationType() {
        return this.latestOperationType;
    }

    public GetApplicationServiceResponse setLatestVersionNo(String latestVersionNo) {
        this.latestVersionNo = latestVersionNo;
        return this;
    }
    public String getLatestVersionNo() {
        return this.latestVersionNo;
    }

    public GetApplicationServiceResponse setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetApplicationServiceResponse setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
