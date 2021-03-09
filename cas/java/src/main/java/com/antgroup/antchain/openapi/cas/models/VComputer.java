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

}
