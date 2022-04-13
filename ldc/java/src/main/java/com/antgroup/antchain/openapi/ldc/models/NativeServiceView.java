// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NativeServiceView extends TeaModel {
    // 服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 服务类型。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 负载均衡实例id。
    @NameInMap("load_balancer_id")
    public String loadBalancerId;

    // VIP地址信息。
    @NameInMap("vip_addresses")
    public java.util.List<String> vipAddresses;

    // VIP地址信息类型。
    @NameInMap("vip_address_type")
    public String vipAddressType;

    // ClusterIP信息。
    @NameInMap("cluster_ip")
    public String clusterIp;

    // 创建时间。
    @NameInMap("created_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTimestamp;

    // 修改时间。
    @NameInMap("modified_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTimestamp;

    public static NativeServiceView build(java.util.Map<String, ?> map) throws Exception {
        NativeServiceView self = new NativeServiceView();
        return TeaModel.build(map, self);
    }

    public NativeServiceView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NativeServiceView setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public NativeServiceView setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public NativeServiceView setVipAddresses(java.util.List<String> vipAddresses) {
        this.vipAddresses = vipAddresses;
        return this;
    }
    public java.util.List<String> getVipAddresses() {
        return this.vipAddresses;
    }

    public NativeServiceView setVipAddressType(String vipAddressType) {
        this.vipAddressType = vipAddressType;
        return this;
    }
    public String getVipAddressType() {
        return this.vipAddressType;
    }

    public NativeServiceView setClusterIp(String clusterIp) {
        this.clusterIp = clusterIp;
        return this;
    }
    public String getClusterIp() {
        return this.clusterIp;
    }

    public NativeServiceView setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }
    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public NativeServiceView setModifiedTimestamp(String modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
        return this;
    }
    public String getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

}
