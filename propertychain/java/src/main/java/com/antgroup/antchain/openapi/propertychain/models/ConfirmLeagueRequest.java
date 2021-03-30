// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ConfirmLeagueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟id
    @NameInMap("league_id")
    @Validation(required = true)
    public String leagueId;

    // 用户标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 加入用户的标识
    @NameInMap("join_user_id")
    @Validation(required = true)
    public String joinUserId;

    // 审核结果
    @NameInMap("pass")
    @Validation(required = true)
    public Boolean pass;

    public static ConfirmLeagueRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLeagueRequest self = new ConfirmLeagueRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmLeagueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmLeagueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmLeagueRequest setLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }
    public String getLeagueId() {
        return this.leagueId;
    }

    public ConfirmLeagueRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ConfirmLeagueRequest setJoinUserId(String joinUserId) {
        this.joinUserId = joinUserId;
        return this;
    }
    public String getJoinUserId() {
        return this.joinUserId;
    }

    public ConfirmLeagueRequest setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }
    public Boolean getPass() {
        return this.pass;
    }

}
