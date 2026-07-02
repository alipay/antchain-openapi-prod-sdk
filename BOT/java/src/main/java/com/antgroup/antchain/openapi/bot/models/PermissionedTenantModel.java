// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PermissionedTenantModel extends TeaModel {
    // 主键Id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 租户名称
    /**
     * <strong>example:</strong>
     * <p>testTenant</p>
     */
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 公司名称
    /**
     * <strong>example:</strong>
     * <p>alipay</p>
     */
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 租户所有人标识
    /**
     * <strong>example:</strong>
     * <p>alipay</p>
     */
    @NameInMap("owner")
    public String owner;

    // 网关私钥
    /**
     * <strong>example:</strong>
     * <p>MEUCIDxNw...</p>
     */
    @NameInMap("gateway_private_key")
    public String gatewayPrivateKey;

    // 网关公钥
    /**
     * <strong>example:</strong>
     * <p>MEUCID...</p>
     */
    @NameInMap("gateway_public_key")
    public String gatewayPublicKey;

    public static PermissionedTenantModel build(java.util.Map<String, ?> map) throws Exception {
        PermissionedTenantModel self = new PermissionedTenantModel();
        return TeaModel.build(map, self);
    }

    public PermissionedTenantModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PermissionedTenantModel setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PermissionedTenantModel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PermissionedTenantModel setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public PermissionedTenantModel setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public PermissionedTenantModel setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public PermissionedTenantModel setGatewayPrivateKey(String gatewayPrivateKey) {
        this.gatewayPrivateKey = gatewayPrivateKey;
        return this;
    }
    public String getGatewayPrivateKey() {
        return this.gatewayPrivateKey;
    }

    public PermissionedTenantModel setGatewayPublicKey(String gatewayPublicKey) {
        this.gatewayPublicKey = gatewayPublicKey;
        return this;
    }
    public String getGatewayPublicKey() {
        return this.gatewayPublicKey;
    }

}
