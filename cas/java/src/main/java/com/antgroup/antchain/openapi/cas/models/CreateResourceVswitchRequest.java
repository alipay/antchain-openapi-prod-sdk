// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateResourceVswitchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 交换机的网段。交换机网段要求如下：
    // 
    // 交换机的网段的掩码长度范围为16~29位。
    // 交换机的网段必须从属于所在VPC的网段。
    // 交换机的网段不能与所在VPC中路由条目的目标网段相同，但可以是目标网段的子集。
    @NameInMap("cidr_block")
    @Validation(required = true)
    public String cidrBlock;

    // 描述信息
    @NameInMap("description")
    public String description;

    // 交换机的名称。
    // 
    // 名称长度为2~128个字符，必须以字母或中文开头，但不能以http://或https://开头。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 要创建的交换机的地域 identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 要创建的交换机所属的VPC ID。
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 要创建的交换机所属的可用区 identity
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

    public static CreateResourceVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceVswitchRequest self = new CreateResourceVswitchRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceVswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateResourceVswitchRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateResourceVswitchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateResourceVswitchRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceVswitchRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateResourceVswitchRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateResourceVswitchRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateResourceVswitchRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
