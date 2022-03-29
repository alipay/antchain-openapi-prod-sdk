// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AliyunOpenState extends TeaModel {
    // 阿里云用户ID
    @NameInMap("aliyun_user_id")
    @Validation(required = true)
    public Long aliyunUserId;

    // 阿里云实例ID
    @NameInMap("aliyun_instance_id")
    @Validation(required = true)
    public String aliyunInstanceId;

    // 监控租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // 监控租户名称
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 开通状态，0未开通，1开通
    @NameInMap("state")
    @Validation(required = true)
    public Long state;

    public static AliyunOpenState build(java.util.Map<String, ?> map) throws Exception {
        AliyunOpenState self = new AliyunOpenState();
        return TeaModel.build(map, self);
    }

    public AliyunOpenState setAliyunUserId(Long aliyunUserId) {
        this.aliyunUserId = aliyunUserId;
        return this;
    }
    public Long getAliyunUserId() {
        return this.aliyunUserId;
    }

    public AliyunOpenState setAliyunInstanceId(String aliyunInstanceId) {
        this.aliyunInstanceId = aliyunInstanceId;
        return this;
    }
    public String getAliyunInstanceId() {
        return this.aliyunInstanceId;
    }

    public AliyunOpenState setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public AliyunOpenState setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public AliyunOpenState setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AliyunOpenState setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AliyunOpenState setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

}
