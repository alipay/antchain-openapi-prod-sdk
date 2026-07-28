// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class QueryUserAuthcheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小游戏ID
    @NameInMap("mini_program_id")
    @Validation(required = true)
    public String miniProgramId;

    // 平台ID
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 用户身份认证令牌
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 开放用户ID
    @NameInMap("open_uid")
    @Validation(required = true)
    public String openUid;

    public static QueryUserAuthcheckRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAuthcheckRequest self = new QueryUserAuthcheckRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserAuthcheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserAuthcheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUserAuthcheckRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public QueryUserAuthcheckRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public QueryUserAuthcheckRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public QueryUserAuthcheckRequest setOpenUid(String openUid) {
        this.openUid = openUid;
        return this;
    }
    public String getOpenUid() {
        return this.openUid;
    }

}
