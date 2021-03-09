// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteResourceRuleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 传输层协议。参数值大小写敏感。取值范围：
    // 
    // icmp
    // gre
    // tcp
    // udp
    // all：支持所有协议
    @NameInMap("ip_protocol")
    @Validation(required = true)
    public String ipProtocol;

    // 目的端安全组开放的传输层协议相关的端口范围。取值范围：
    // 
    // TCP/UDP协议：取值范围为1~65535。使用斜线（/）隔开起始端口和终止端口。例如：1/200
    // ICMP协议：-1/-1
    // GRE协议：-1/-1
    // all：-1/-1
    @NameInMap("port_range")
    @Validation(required = true)
    public String portRange;

    // CN-HANGZHOU_FINANCE
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 枚举值：
    // ingress：入口规则
    // egress：出口规则
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    // 目的端安全组ID。
    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    // 源端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。默认值：0.0.0.0/0
    @NameInMap("source_cidr_ip")
    public String sourceCidrIp;

    // 目的端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。默认值：0.0.0.0/0
    @NameInMap("dest_cidr_ip")
    public String destCidrIp;

    public static DeleteResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRuleRequest self = new DeleteResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteResourceRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public DeleteResourceRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public DeleteResourceRuleRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteResourceRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DeleteResourceRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DeleteResourceRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public DeleteResourceRuleRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

}
