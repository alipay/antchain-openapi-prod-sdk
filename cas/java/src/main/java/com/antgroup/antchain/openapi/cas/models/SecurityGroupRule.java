// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SecurityGroupRule extends TeaModel {
    // 规则描述信息
    @NameInMap("description")
    public String description;

    // 目的端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。
    @NameInMap("dest_cidr_ip")
    public String destCidrIp;

    // 传输层协议。不区分大小写。取值范围：
    // 
    // icmp
    // gre
    // tcp
    // udp
    // all：支持所有协议
    @NameInMap("ip_protocol")
    public String ipProtocol;

    // 经典网络类型安全组规则的网卡类型。取值范围：
    // 
    // internet：公网。
    // intranet：内网。
    // 默认值：internet。
    // 
    // 在以下情况中，参数NicType取值只能为intranet：
    // 
    // 安全组规则的网络类型为专有网络VPC时，您无需设置NicType参数，默认并且只能为intranet。
    // 当设置安全组之间互相访问时，即指定了DestGroupId且没有指定DestCidrIp时。
    @NameInMap("nic_type")
    public String nicType;

    // 访问权限。取值范围：
    // 
    // accept：接受访问。
    // drop：拒绝访问，不返回拒绝信息。
    // 默认值：accept。
    @NameInMap("policy")
    public String policy;

    // 目的端安全组开放的传输层协议相关的端口范围。取值范围：
    // 
    // TCP/UDP协议：取值范围为1~65535。使用斜线（/）隔开起始端口和终止端口。正确示范：1/200；错误示范：200/1。
    // ICMP协议：-1/-1。
    // GRE协议：-1/-1。
    // all：-1/-1。
    @NameInMap("port_range")
    public String portRange;

    // 安全组规则优先级。取值范围：1~100
    // 
    // 默认值：1。
    @NameInMap("priority")
    public String priority;

    // 源端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。
    // 
    // 默认值：0.0.0.0/0。
    @NameInMap("source_cidr_ip")
    public String sourceCidrIp;

    public static SecurityGroupRule build(java.util.Map<String, ?> map) throws Exception {
        SecurityGroupRule self = new SecurityGroupRule();
        return TeaModel.build(map, self);
    }

    public SecurityGroupRule setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SecurityGroupRule setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public SecurityGroupRule setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public SecurityGroupRule setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public SecurityGroupRule setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SecurityGroupRule setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public SecurityGroupRule setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SecurityGroupRule setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

}
