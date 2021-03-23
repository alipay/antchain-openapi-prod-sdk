// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class UserChannelDTO extends TeaModel {
    // 通道名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 通道是否公开可访问
    @NameInMap("public_acl")
    @Validation(required = true)
    public Boolean publicAcl;

    // 创建通道的用户did
    @NameInMap("creator_did")
    @Validation(required = true)
    public String creatorDid;

    // 权限到期时间
    @NameInMap("valid_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String validTime;

    public static UserChannelDTO build(java.util.Map<String, ?> map) throws Exception {
        UserChannelDTO self = new UserChannelDTO();
        return TeaModel.build(map, self);
    }

    public UserChannelDTO setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UserChannelDTO setPublicAcl(Boolean publicAcl) {
        this.publicAcl = publicAcl;
        return this;
    }
    public Boolean getPublicAcl() {
        return this.publicAcl;
    }

    public UserChannelDTO setCreatorDid(String creatorDid) {
        this.creatorDid = creatorDid;
        return this;
    }
    public String getCreatorDid() {
        return this.creatorDid;
    }

    public UserChannelDTO setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

}
