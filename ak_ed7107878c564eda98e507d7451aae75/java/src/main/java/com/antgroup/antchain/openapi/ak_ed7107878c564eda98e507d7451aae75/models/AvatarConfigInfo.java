// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarConfigInfo extends TeaModel {
    // 交互配置id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 交互配置名
    /**
     * <strong>example:</strong>
     * <p>测试交互配置</p>
     */
    @NameInMap("config_name")
    @Validation(required = true)
    public String configName;

    // 交互配置编码
    /**
     * <strong>example:</strong>
     * <p>1e077a39c88140f196449e43d3efb</p>
     */
    @NameInMap("virtual_code")
    @Validation(required = true)
    public String virtualCode;

    // 数字人角色id
    /**
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("human_id")
    @Validation(required = true)
    public Long humanId;

    public static AvatarConfigInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarConfigInfo self = new AvatarConfigInfo();
        return TeaModel.build(map, self);
    }

    public AvatarConfigInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AvatarConfigInfo setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public AvatarConfigInfo setVirtualCode(String virtualCode) {
        this.virtualCode = virtualCode;
        return this;
    }
    public String getVirtualCode() {
        return this.virtualCode;
    }

    public AvatarConfigInfo setHumanId(Long humanId) {
        this.humanId = humanId;
        return this;
    }
    public Long getHumanId() {
        return this.humanId;
    }

}
