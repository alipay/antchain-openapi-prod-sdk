// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ApiKey extends TeaModel {
    // 主键
    /**
     * <strong>example:</strong>
     * <p>c7ac992c8c4041c3ab35c60105ed0440</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // AK
    /**
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiJ9.eyJpbnN0aXR1dGlvblR5cGUiOiIyIiwidXNlclR5cGUiOiJJTlNUSVRVVElPTiIsInB1cnBvc2UiOiJBQ0NFU1MiLCJub25jZSI6NDIsInN1YiI6IjkiLCJpYXQiOjE3MjYyMDkyMTYsImV4cCI6MTcyNjIxNjQxM30.oF95cFuz3D_rXAcUNieJbk2uxd75O0AznIFbXiITz7A</p>
     */
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // SK(或公钥)
    /**
     * <strong>example:</strong>
     * <p>YU8jNHr9Qn5ROGVrFQ54JER8gkVsX05bG4PKxcdLB5eWZGIGgKSbZyeWTvHZ0fKxYFW2Je8ezk0LG3/WKOlRFGiFLVjpEYfhxffhAqj5xwk4DdBgaZEa71O0qjlAbEteQb+nJi2qK/AQJrAj3Wg==</p>
     */
    @NameInMap("secret")
    @Validation(required = true)
    public String secret;

    // 创建日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
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
