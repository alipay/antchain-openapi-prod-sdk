// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DidUpdateTenantReq extends TeaModel {
    // 待更新实体身份did
    /**
     * <strong>example:</strong>
     * <p>&quot;did:iot_xxxxx&quot;</p>
     */
    @NameInMap("thing_did")
    @Validation(required = true)
    public String thingDid;

    // 待更新访问者列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;&quot;,&quot;&quot;]</p>
     */
    @NameInMap("tenant_list")
    @Validation(required = true)
    public java.util.List<String> tenantList;

    // 权限角色
    // TENANT_ROLE_OWNER
    // TENANT_ROLE_USER
    // TENANT_ROLE_OBSERVER
    /**
     * <strong>example:</strong>
     * <p>TENANT_ROLE_OWNER</p>
     */
    @NameInMap("tenant_role")
    @Validation(required = true)
    public String tenantRole;

    // 增加权限：THINGS_OP_MODE_ADD
    // 删除权限：THINGS_OP_MODE_REMOVE
    /**
     * <strong>example:</strong>
     * <p>THINGS_OP_MODE_ADD</p>
     */
    @NameInMap("op_mode")
    @Validation(required = true)
    public String opMode;

    public static DidUpdateTenantReq build(java.util.Map<String, ?> map) throws Exception {
        DidUpdateTenantReq self = new DidUpdateTenantReq();
        return TeaModel.build(map, self);
    }

    public DidUpdateTenantReq setThingDid(String thingDid) {
        this.thingDid = thingDid;
        return this;
    }
    public String getThingDid() {
        return this.thingDid;
    }

    public DidUpdateTenantReq setTenantList(java.util.List<String> tenantList) {
        this.tenantList = tenantList;
        return this;
    }
    public java.util.List<String> getTenantList() {
        return this.tenantList;
    }

    public DidUpdateTenantReq setTenantRole(String tenantRole) {
        this.tenantRole = tenantRole;
        return this;
    }
    public String getTenantRole() {
        return this.tenantRole;
    }

    public DidUpdateTenantReq setOpMode(String opMode) {
        this.opMode = opMode;
        return this;
    }
    public String getOpMode() {
        return this.opMode;
    }

}
