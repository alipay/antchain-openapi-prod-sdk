// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSingleworkspaceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 创建时间。
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    // workspace工作空间的显示名称
    @NameInMap("display_name")
    public String displayName;

    // workspace名称。
    @NameInMap("id")
    public String id;

    // 最近修改时间。
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modifiedTime;

    // workspace显示名称。
    @NameInMap("name")
    public String name;

    // 网络类型。
    @NameInMap("network_type")
    public String networkType;

    // region id
    @NameInMap("region")
    public String region;

    // 所属租户信息。
    @NameInMap("tenant")
    public String tenant;

    // 工作空间类型：标准工作空间；单元化工作空间
    @NameInMap("type")
    public String type;

    // vpc iaas id
    @NameInMap("vpc_iaas_id")
    public String vpcIaasId;

    // workspace所属环境名称[可能不存在]。
    @NameInMap("workspace_group")
    public String workspaceGroup;

    // workspace对应的zoneId列表。
    @NameInMap("zones")
    public java.util.List<String> zones;

    public static GetSingleworkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSingleworkspaceResponse self = new GetSingleworkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetSingleworkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSingleworkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSingleworkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSingleworkspaceResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetSingleworkspaceResponse setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetSingleworkspaceResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetSingleworkspaceResponse setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public GetSingleworkspaceResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSingleworkspaceResponse setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public GetSingleworkspaceResponse setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetSingleworkspaceResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetSingleworkspaceResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetSingleworkspaceResponse setVpcIaasId(String vpcIaasId) {
        this.vpcIaasId = vpcIaasId;
        return this;
    }
    public String getVpcIaasId() {
        return this.vpcIaasId;
    }

    public GetSingleworkspaceResponse setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public GetSingleworkspaceResponse setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

}
