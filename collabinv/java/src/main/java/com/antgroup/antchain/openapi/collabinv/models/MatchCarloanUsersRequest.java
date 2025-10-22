// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class MatchCarloanUsersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要匹配的值
    @NameInMap("match_id")
    @Validation(required = true)
    public String matchId;

    // 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    public static MatchCarloanUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchCarloanUsersRequest self = new MatchCarloanUsersRequest();
        return TeaModel.build(map, self);
    }

    public MatchCarloanUsersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchCarloanUsersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchCarloanUsersRequest setMatchId(String matchId) {
        this.matchId = matchId;
        return this;
    }
    public String getMatchId() {
        return this.matchId;
    }

    public MatchCarloanUsersRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

}
