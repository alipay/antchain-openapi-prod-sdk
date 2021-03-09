// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class PermissionVO extends TeaModel {
    // authorizedCidrIp
    @NameInMap("authorized_cidr_ip")
    public String authorizedCidrIp;

    // authorize_type
    @NameInMap("authorize_type")
    public String authorizeType;

    // direction
    @NameInMap("direction")
    public String direction;

    // endPort
    @NameInMap("end_port")
    public Long endPort;

    // ipProtocol
    @NameInMap("ip_protocol")
    public String ipProtocol;

    // nicType
    @NameInMap("nic_type")
    public String nicType;

    // policy
    @NameInMap("policy")
    public String policy;

    // priority
    @NameInMap("priority")
    public Long priority;

    // securityGroupId
    @NameInMap("security_group_id")
    public String securityGroupId;

    // startPort
    @NameInMap("start_port")
    public Long startPort;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static PermissionVO build(java.util.Map<String, ?> map) throws Exception {
        PermissionVO self = new PermissionVO();
        return TeaModel.build(map, self);
    }

    public PermissionVO setAuthorizedCidrIp(String authorizedCidrIp) {
        this.authorizedCidrIp = authorizedCidrIp;
        return this;
    }
    public String getAuthorizedCidrIp() {
        return this.authorizedCidrIp;
    }

    public PermissionVO setAuthorizeType(String authorizeType) {
        this.authorizeType = authorizeType;
        return this;
    }
    public String getAuthorizeType() {
        return this.authorizeType;
    }

    public PermissionVO setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public PermissionVO setEndPort(Long endPort) {
        this.endPort = endPort;
        return this;
    }
    public Long getEndPort() {
        return this.endPort;
    }

    public PermissionVO setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public PermissionVO setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public PermissionVO setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public PermissionVO setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public PermissionVO setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public PermissionVO setStartPort(Long startPort) {
        this.startPort = startPort;
        return this;
    }
    public Long getStartPort() {
        return this.startPort;
    }

    public PermissionVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
