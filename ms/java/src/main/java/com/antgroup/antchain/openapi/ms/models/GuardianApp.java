// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GuardianApp extends TeaModel {
    // 是否生效
    @NameInMap("enable")
    public Boolean enable;

    // 监控id
    @NameInMap("id")
    public Long id;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 描述字段
    @NameInMap("name")
    public String name;

    // 运行模式
    @NameInMap("run_mode")
    public String runMode;

    public static GuardianApp build(java.util.Map<String, ?> map) throws Exception {
        GuardianApp self = new GuardianApp();
        return TeaModel.build(map, self);
    }

    public GuardianApp setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public GuardianApp setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GuardianApp setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GuardianApp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GuardianApp setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

}
