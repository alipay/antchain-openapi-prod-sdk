// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class MachineObservation extends TeaModel {
    // 操作系统名称
    /**
     * <strong>example:</strong>
     * <p>macOS</p>
     */
    @NameInMap("os_name")
    public String osName;

    // 操作系统版本
    /**
     * <strong>example:</strong>
     * <p>15.0</p>
     */
    @NameInMap("os_version")
    public String osVersion;

    // CPU 架构
    /**
     * <strong>example:</strong>
     * <p>arm64</p>
     */
    @NameInMap("architecture")
    public String architecture;

    // 运行形态：NATIVE、CONTAINER、VM、UNKNOWN
    /**
     * <strong>example:</strong>
     * <p>NATIVE</p>
     */
    @NameInMap("runtime_type")
    @Validation(required = true)
    public String runtimeType;

    // 本次网卡枚举是否完整
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("network_interfaces_complete")
    @Validation(required = true)
    public Boolean networkInterfacesComplete;

    // 本次枚举到的网卡及地址
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("network_interfaces")
    public java.util.List<NetworkInterfaceObservation> networkInterfaces;

    public static MachineObservation build(java.util.Map<String, ?> map) throws Exception {
        MachineObservation self = new MachineObservation();
        return TeaModel.build(map, self);
    }

    public MachineObservation setOsName(String osName) {
        this.osName = osName;
        return this;
    }
    public String getOsName() {
        return this.osName;
    }

    public MachineObservation setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public MachineObservation setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public MachineObservation setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public MachineObservation setNetworkInterfacesComplete(Boolean networkInterfacesComplete) {
        this.networkInterfacesComplete = networkInterfacesComplete;
        return this;
    }
    public Boolean getNetworkInterfacesComplete() {
        return this.networkInterfacesComplete;
    }

    public MachineObservation setNetworkInterfaces(java.util.List<NetworkInterfaceObservation> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }
    public java.util.List<NetworkInterfaceObservation> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

}
