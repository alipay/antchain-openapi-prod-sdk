// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VPC extends TeaModel {
    // VPC的IPv4网段
    @NameInMap("cidr_block")
    @Validation(required = true)
    public String cidrBlock;

    // VPC的创建时间
    @NameInMap("creation_time")
    @Validation(required = true)
    public String creationTime;

    // VPC的描述信息
    @NameInMap("description")
    public String description;

    // VPC所在的地域
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 路由表ID
    @NameInMap("router_table_ids")
    @Validation(required = true)
    public java.util.List<String> routerTableIds;

    // VPC的状态，取值：
    // 
    // Pending：配置中。
    // Available：可用。
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 用户侧网段的列表
    @NameInMap("user_cidrs")
    public String userCidrs;

    // VPC的id
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // VPC的名称
    @NameInMap("vpc_name")
    @Validation(required = true)
    public String vpcName;

    // VPC路由器的ID
    @NameInMap("v_router_id")
    @Validation(required = true)
    public String vRouterId;

    // 关联的workspace id
    @NameInMap("workspace_id")
    public String workspaceId;

    // vpc是否已导入workspace
    @NameInMap("import_info")
    public ImportInfo importInfo;

    // vpc在CAFE测的唯一ID
    @NameInMap("vpc_paas_id")
    public String vpcPaasId;

    public static VPC build(java.util.Map<String, ?> map) throws Exception {
        VPC self = new VPC();
        return TeaModel.build(map, self);
    }

    public VPC setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public VPC setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public VPC setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public VPC setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public VPC setRouterTableIds(java.util.List<String> routerTableIds) {
        this.routerTableIds = routerTableIds;
        return this;
    }
    public java.util.List<String> getRouterTableIds() {
        return this.routerTableIds;
    }

    public VPC setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VPC setUserCidrs(String userCidrs) {
        this.userCidrs = userCidrs;
        return this;
    }
    public String getUserCidrs() {
        return this.userCidrs;
    }

    public VPC setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public VPC setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }
    public String getVpcName() {
        return this.vpcName;
    }

    public VPC setVRouterId(String vRouterId) {
        this.vRouterId = vRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.vRouterId;
    }

    public VPC setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public VPC setImportInfo(ImportInfo importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public ImportInfo getImportInfo() {
        return this.importInfo;
    }

    public VPC setVpcPaasId(String vpcPaasId) {
        this.vpcPaasId = vpcPaasId;
        return this;
    }
    public String getVpcPaasId() {
        return this.vpcPaasId;
    }

}
