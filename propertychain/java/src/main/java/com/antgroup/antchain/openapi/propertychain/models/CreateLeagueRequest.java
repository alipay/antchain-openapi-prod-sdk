// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateLeagueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链标识
    @NameInMap("blockchain_d")
    @Validation(required = true)
    public String blockchainD;

    // 评论
    @NameInMap("comment")
    public String comment;

    // 联盟名称
    @NameInMap("league_name")
    @Validation(required = true)
    public String leagueName;

    // 用户标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateLeagueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeagueRequest self = new CreateLeagueRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeagueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeagueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeagueRequest setBlockchainD(String blockchainD) {
        this.blockchainD = blockchainD;
        return this;
    }
    public String getBlockchainD() {
        return this.blockchainD;
    }

    public CreateLeagueRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateLeagueRequest setLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }
    public String getLeagueName() {
        return this.leagueName;
    }

    public CreateLeagueRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
