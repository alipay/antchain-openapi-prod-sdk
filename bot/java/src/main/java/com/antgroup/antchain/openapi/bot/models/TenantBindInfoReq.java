// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TenantBindInfoReq extends TeaModel {
    // 租户关联扩展信息
    /**
     * <strong>example:</strong>
     * <p>&quot;CN,北京&quot;</p>
     */
    @NameInMap("extension")
    public String extension;

    // 业务类型，默认空
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("biz_type")
    public String bizType;

    // 组织机构代码，可为中文
    /**
     * <strong>example:</strong>
     * <p>&quot;12345&quot;</p>
     */
    @NameInMap("tenant_uid")
    @Validation(required = true)
    public String tenantUid;

    // 组织结构名称
    /**
     * <strong>example:</strong>
     * <p>&quot;xx公司xx部门&quot;</p>
     */
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static TenantBindInfoReq build(java.util.Map<String, ?> map) throws Exception {
        TenantBindInfoReq self = new TenantBindInfoReq();
        return TeaModel.build(map, self);
    }

    public TenantBindInfoReq setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public TenantBindInfoReq setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public TenantBindInfoReq setTenantUid(String tenantUid) {
        this.tenantUid = tenantUid;
        return this;
    }
    public String getTenantUid() {
        return this.tenantUid;
    }

    public TenantBindInfoReq setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
