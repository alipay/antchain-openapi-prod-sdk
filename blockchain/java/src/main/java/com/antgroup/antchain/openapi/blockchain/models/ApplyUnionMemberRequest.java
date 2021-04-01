// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyUnionMemberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟id
    @NameInMap("consortium_id")
    public String consortiumId;

    // 被邀请用户的bid
    @NameInMap("invite_bid")
    public String inviteBid;

    // 被邀请的用户id
    @NameInMap("invite_user_id")
    public Long inviteUserId;

    // 区域信息
    @NameInMap("region_id")
    public String regionId;

    public static ApplyUnionMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyUnionMemberRequest self = new ApplyUnionMemberRequest();
        return TeaModel.build(map, self);
    }

    public ApplyUnionMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyUnionMemberRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyUnionMemberRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ApplyUnionMemberRequest setInviteBid(String inviteBid) {
        this.inviteBid = inviteBid;
        return this;
    }
    public String getInviteBid() {
        return this.inviteBid;
    }

    public ApplyUnionMemberRequest setInviteUserId(Long inviteUserId) {
        this.inviteUserId = inviteUserId;
        return this;
    }
    public Long getInviteUserId() {
        return this.inviteUserId;
    }

    public ApplyUnionMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
