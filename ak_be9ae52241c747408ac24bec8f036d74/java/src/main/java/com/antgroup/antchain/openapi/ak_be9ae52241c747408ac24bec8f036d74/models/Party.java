// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class Party extends TeaModel {
    // 参与方节点id，创建项目时无需传入，由saas统一分配
    @NameInMap("party_id")
    public String partyId;

    // 所属方id，若为云上节点，则为云上租户ID，若为线下节点，则该参数为空
    @NameInMap("tenant_id")
    public String tenantId;

    // 参与方节点类型，创建项目时无需填写，由local_config字段推导出节点参与方类型；
    // 一期支持两类，FATE为线下fate参与方节点，SAAS_FATE为云上fate参与方节点
    @NameInMap("type")
    public String type;

    // 参与方配置json，当type为FATE时，其结构为FatePartyConfigInfo，当type为SAAS_FATE时，其结构为List<FatePartyConfigInfo>
    @NameInMap("node_config")
    public String nodeConfig;

    public static Party build(java.util.Map<String, ?> map) throws Exception {
        Party self = new Party();
        return TeaModel.build(map, self);
    }

    public Party setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

    public Party setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Party setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Party setNodeConfig(String nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public String getNodeConfig() {
        return this.nodeConfig;
    }

}
