// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class PartyReq extends TeaModel {
    // 参与方类型，例如：{FATE, SAAS_FATE, KUSCIA, SAAS_KUSCIA}
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 参与方租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 远端节点的配置信息，本期仅支持一种类型：FATE，其配置参考FatePartyLocalConfigInfo结构体定义
    @NameInMap("remote_config")
    @Validation(required = true)
    public String remoteConfig;

    public static PartyReq build(java.util.Map<String, ?> map) throws Exception {
        PartyReq self = new PartyReq();
        return TeaModel.build(map, self);
    }

    public PartyReq setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PartyReq setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PartyReq setRemoteConfig(String remoteConfig) {
        this.remoteConfig = remoteConfig;
        return this;
    }
    public String getRemoteConfig() {
        return this.remoteConfig;
    }

}
