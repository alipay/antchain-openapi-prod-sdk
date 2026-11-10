// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class NetworkInterfaceObservation extends TeaModel {
    // 网卡接口名
    /**
     * <strong>example:</strong>
     * <p>en0</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 网卡 MAC 地址，可缺失
    /**
     * <strong>example:</strong>
     * <p>02:00:00:00:00:01</p>
     */
    @NameInMap("mac_address")
    public String macAddress;

    // IPv4/IPv6 地址列表；缺失表示未取得
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("ip_addresses")
    public java.util.List<String> ipAddresses;

    public static NetworkInterfaceObservation build(java.util.Map<String, ?> map) throws Exception {
        NetworkInterfaceObservation self = new NetworkInterfaceObservation();
        return TeaModel.build(map, self);
    }

    public NetworkInterfaceObservation setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NetworkInterfaceObservation setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public NetworkInterfaceObservation setIpAddresses(java.util.List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }
    public java.util.List<String> getIpAddresses() {
        return this.ipAddresses;
    }

}
