// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QuerySdkApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商业能力id
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    // 发布版本号
    @NameInMap("publish_version")
    @Validation(required = true)
    public String publishVersion;

    public static QuerySdkApiRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySdkApiRequest self = new QuerySdkApiRequest();
        return TeaModel.build(map, self);
    }

    public QuerySdkApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySdkApiRequest setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

    public QuerySdkApiRequest setPublishVersion(String publishVersion) {
        this.publishVersion = publishVersion;
        return this;
    }
    public String getPublishVersion() {
        return this.publishVersion;
    }

}
