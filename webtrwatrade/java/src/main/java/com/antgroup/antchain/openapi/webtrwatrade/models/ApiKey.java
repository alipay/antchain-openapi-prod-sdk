// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ApiKey extends TeaModel {
    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // AK
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // SK(或公钥)
    @NameInMap("secret")
    @Validation(required = true)
    public String secret;

    // 创建日期
    @NameInMap("gmt_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreated;

    public static ApiKey build(java.util.Map<String, ?> map) throws Exception {
        ApiKey self = new ApiKey();
        return TeaModel.build(map, self);
    }

    public ApiKey setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ApiKey setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ApiKey setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public ApiKey setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

}
