// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteVpcVswitchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // vpc id
    @NameInMap("vpc_sequence")
    @Validation(required = true)
    public String vpcSequence;

    // vswitch 的 iaasIds
    @NameInMap("vswitch_ids")
    @Validation(required = true)
    public java.util.List<String> vswitchIds;

    public static DeleteVpcVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcVswitchRequest self = new DeleteVpcVswitchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcVswitchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteVpcVswitchRequest setVpcSequence(String vpcSequence) {
        this.vpcSequence = vpcSequence;
        return this;
    }
    public String getVpcSequence() {
        return this.vpcSequence;
    }

    public DeleteVpcVswitchRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

}
