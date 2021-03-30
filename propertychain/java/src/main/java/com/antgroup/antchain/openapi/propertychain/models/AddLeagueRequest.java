// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class AddLeagueRequest extends TeaModel {
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

    public static AddLeagueRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLeagueRequest self = new AddLeagueRequest();
        return TeaModel.build(map, self);
    }

    public AddLeagueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddLeagueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddLeagueRequest setLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }
    public String getLeagueId() {
        return this.leagueId;
    }

    public AddLeagueRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
