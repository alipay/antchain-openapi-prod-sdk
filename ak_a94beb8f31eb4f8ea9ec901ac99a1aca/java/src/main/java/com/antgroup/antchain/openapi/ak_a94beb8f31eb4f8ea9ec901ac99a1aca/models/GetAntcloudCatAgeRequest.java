// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a94beb8f31eb4f8ea9ec901ac99a1aca.models;

import com.aliyun.tea.*;

public class GetAntcloudCatAgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 猫猫的id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // a a a
    @NameInMap("time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    public static GetAntcloudCatAgeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntcloudCatAgeRequest self = new GetAntcloudCatAgeRequest();
        return TeaModel.build(map, self);
    }

    public GetAntcloudCatAgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntcloudCatAgeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAntcloudCatAgeRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
