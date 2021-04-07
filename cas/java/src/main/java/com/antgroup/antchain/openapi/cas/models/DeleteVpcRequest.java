// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteVpcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 专有网络序列号
    @NameInMap("vpc_sequence")
    @Validation(required = true)
    public String vpcSequence;

    public static DeleteVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcRequest self = new DeleteVpcRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteVpcRequest setVpcSequence(String vpcSequence) {
        this.vpcSequence = vpcSequence;
        return this;
    }
    public String getVpcSequence() {
        return this.vpcSequence;
    }

}
