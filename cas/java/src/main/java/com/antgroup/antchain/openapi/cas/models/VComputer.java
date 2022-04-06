// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VComputer extends TeaModel {
    // v_computer_group
    @NameInMap("v_computer_group")
    public VComputerGroup vComputerGroup;

    // ip
    @NameInMap("ip")
    public String ip;

    // computer
    @NameInMap("computer")
    public Computer computer;

    // port
    @NameInMap("port")
    public Long port;

    // weight
    @NameInMap("weight")
    public Long weight;

    // 是否是EIP
    @NameInMap("is_eip")
    public Boolean isEip;

    // is_managed_computer
    @NameInMap("is_managed_computer")
    public Boolean isManagedComputer;

    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    public static VComputer build(java.util.Map<String, ?> map) throws Exception {
        VComputer self = new VComputer();
        return TeaModel.build(map, self);
    }

    public VComputer setVComputerGroup(VComputerGroup vComputerGroup) {
        this.vComputerGroup = vComputerGroup;
        return this;
    }
    public VComputerGroup getVComputerGroup() {
        return this.vComputerGroup;
    }

    public VComputer setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public VComputer setComputer(Computer computer) {
        this.computer = computer;
        return this;
    }
    public Computer getComputer() {
        return this.computer;
    }

    public VComputer setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public VComputer setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public VComputer setIsEip(Boolean isEip) {
        this.isEip = isEip;
        return this;
    }
    public Boolean getIsEip() {
        return this.isEip;
    }

    public VComputer setIsManagedComputer(Boolean isManagedComputer) {
        this.isManagedComputer = isManagedComputer;
        return this;
    }
    public Boolean getIsManagedComputer() {
        return this.isManagedComputer;
    }

    public VComputer setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

}
