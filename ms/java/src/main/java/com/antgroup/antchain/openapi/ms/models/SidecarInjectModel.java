// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class SidecarInjectModel extends TeaModel {
    // 主键
    @NameInMap("id")
    public Long id;

    // 租户实例id
    @NameInMap("instance_id")
    public String instanceId;

    // sidecar名称
    @NameInMap("sidecar_name")
    public String sidecarName;

    // 状态 0关闭 1开启
    @NameInMap("status")
    public Long status;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // sidecar注入配置
    @NameInMap("configs")
    public java.util.List<SidecarInjectConfigModel> configs;

    public static SidecarInjectModel build(java.util.Map<String, ?> map) throws Exception {
        SidecarInjectModel self = new SidecarInjectModel();
        return TeaModel.build(map, self);
    }

    public SidecarInjectModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SidecarInjectModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SidecarInjectModel setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public SidecarInjectModel setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SidecarInjectModel setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SidecarInjectModel setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SidecarInjectModel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SidecarInjectModel setConfigs(java.util.List<SidecarInjectConfigModel> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<SidecarInjectConfigModel> getConfigs() {
        return this.configs;
    }

}
