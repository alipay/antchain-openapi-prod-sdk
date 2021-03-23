// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateUnionChannelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟ID
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // 通信通道的名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 发起创建channel的用户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // Channel中数据是否联盟内公开，true为公开可访问，支持后续更新是否公开
    @NameInMap("public_acl")
    @Validation(required = true)
    public Boolean publicAcl;

    public static CreateUnionChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUnionChannelRequest self = new CreateUnionChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateUnionChannelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUnionChannelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUnionChannelRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public CreateUnionChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateUnionChannelRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public CreateUnionChannelRequest setPublicAcl(Boolean publicAcl) {
        this.publicAcl = publicAcl;
        return this;
    }
    public Boolean getPublicAcl() {
        return this.publicAcl;
    }

}
