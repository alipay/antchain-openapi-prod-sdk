// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SLBInfo extends TeaModel {
    // 名称
    @NameInMap("name")
    public String name;

    // 机器ID
    @NameInMap("machine_id")
    public String machineId;

    // 端口
    @NameInMap("port")
    public Long port;

    // paas id
    @NameInMap("paas_id")
    public String paasId;

    // iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // 虚拟服务器组 id
    @NameInMap("v_server_group_id")
    public String vServerGroupId;

    // 虚拟服务器组名
    @NameInMap("v_server_group_name")
    public String vServerGroupName;

    // 计算资源 ID
    @NameInMap("computer_id")
    public String computerId;

    // 应用 ID
    @NameInMap("app_id")
    public String appId;

    // 应用服务 ID
    @NameInMap("app_svc_id")
    public String appSvcId;

    // vip 地址列表
    @NameInMap("vip_addresses")
    public java.util.List<String> vipAddresses;

    // 权重
    @NameInMap("weight")
    public Long weight;

    // 状态
    @NameInMap("state")
    public String state;

    // ID
    @NameInMap("id")
    public String id;

    public static SLBInfo build(java.util.Map<String, ?> map) throws Exception {
        SLBInfo self = new SLBInfo();
        return TeaModel.build(map, self);
    }

    public SLBInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SLBInfo setMachineId(String machineId) {
        this.machineId = machineId;
        return this;
    }
    public String getMachineId() {
        return this.machineId;
    }

    public SLBInfo setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public SLBInfo setPaasId(String paasId) {
        this.paasId = paasId;
        return this;
    }
    public String getPaasId() {
        return this.paasId;
    }

    public SLBInfo setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public SLBInfo setVServerGroupId(String vServerGroupId) {
        this.vServerGroupId = vServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    public SLBInfo setVServerGroupName(String vServerGroupName) {
        this.vServerGroupName = vServerGroupName;
        return this;
    }
    public String getVServerGroupName() {
        return this.vServerGroupName;
    }

    public SLBInfo setComputerId(String computerId) {
        this.computerId = computerId;
        return this;
    }
    public String getComputerId() {
        return this.computerId;
    }

    public SLBInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SLBInfo setAppSvcId(String appSvcId) {
        this.appSvcId = appSvcId;
        return this;
    }
    public String getAppSvcId() {
        return this.appSvcId;
    }

    public SLBInfo setVipAddresses(java.util.List<String> vipAddresses) {
        this.vipAddresses = vipAddresses;
        return this;
    }
    public java.util.List<String> getVipAddresses() {
        return this.vipAddresses;
    }

    public SLBInfo setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public SLBInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SLBInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
