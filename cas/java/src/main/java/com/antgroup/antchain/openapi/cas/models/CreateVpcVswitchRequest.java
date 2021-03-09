// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateVpcVswitchRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 网段
    @NameInMap("cidr_block")
    @Validation(required = true)
    public String cidrBlock;

    // 描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // switch 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // vpc paas id
    @NameInMap("vpc_sequence")
    @Validation(required = true)
    public String vpcSequence;

    // zone
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

    public static CreateVpcVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcVswitchRequest self = new CreateVpcVswitchRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcVswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateVpcVswitchRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateVpcVswitchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVpcVswitchRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpcVswitchRequest setVpcSequence(String vpcSequence) {
        this.vpcSequence = vpcSequence;
        return this;
    }
    public String getVpcSequence() {
        return this.vpcSequence;
    }

    public CreateVpcVswitchRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
