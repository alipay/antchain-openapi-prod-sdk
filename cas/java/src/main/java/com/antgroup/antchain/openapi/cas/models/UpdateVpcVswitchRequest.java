// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateVpcVswitchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 修改会的 vswitch 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // vswitch id
    @NameInMap("vswitch_id")
    @Validation(required = true)
    public String vswitchId;

    // vpc paas id
    @NameInMap("vpc_sequence")
    @Validation(required = true)
    public String vpcSequence;

    // 描述
    @NameInMap("description")
    public String description;

    public static UpdateVpcVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcVswitchRequest self = new UpdateVpcVswitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpcVswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateVpcVswitchRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVpcVswitchRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public UpdateVpcVswitchRequest setVpcSequence(String vpcSequence) {
        this.vpcSequence = vpcSequence;
        return this;
    }
    public String getVpcSequence() {
        return this.vpcSequence;
    }

    public UpdateVpcVswitchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
