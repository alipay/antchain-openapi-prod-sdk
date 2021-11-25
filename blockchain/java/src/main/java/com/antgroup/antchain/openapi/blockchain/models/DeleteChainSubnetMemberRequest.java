// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteChainSubnetMemberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 子链id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    public String consortiumId;

    // 子链成员id
    @NameInMap("member_id")
    public String memberId;

    public static DeleteChainSubnetMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChainSubnetMemberRequest self = new DeleteChainSubnetMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChainSubnetMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteChainSubnetMemberRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteChainSubnetMemberRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DeleteChainSubnetMemberRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DeleteChainSubnetMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

}
