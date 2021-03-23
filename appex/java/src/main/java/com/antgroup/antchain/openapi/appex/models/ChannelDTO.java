// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ChannelDTO extends TeaModel {
    // 通道名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 通道是否公开访问
    @NameInMap("public_acl")
    @Validation(required = true)
    public Boolean publicAcl;

    // 通道创建账户
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    public static ChannelDTO build(java.util.Map<String, ?> map) throws Exception {
        ChannelDTO self = new ChannelDTO();
        return TeaModel.build(map, self);
    }

    public ChannelDTO setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ChannelDTO setPublicAcl(Boolean publicAcl) {
        this.publicAcl = publicAcl;
        return this;
    }
    public Boolean getPublicAcl() {
        return this.publicAcl;
    }

    public ChannelDTO setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

}
