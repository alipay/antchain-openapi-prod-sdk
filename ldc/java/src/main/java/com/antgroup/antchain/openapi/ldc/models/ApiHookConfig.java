// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ApiHookConfig extends TeaModel {
    // 卡点要调用的api地址
    @NameInMap("post_url")
    @Validation(required = true)
    public String postUrl;

    // 授权码
    @NameInMap("auth_key")
    public String authKey;

    // 接口超时时间，单位ms
    @NameInMap("timeout")
    public String timeout;

    // 查询异步卡点接口执行结果api
    @NameInMap("check_url")
    public String checkUrl;

    public static ApiHookConfig build(java.util.Map<String, ?> map) throws Exception {
        ApiHookConfig self = new ApiHookConfig();
        return TeaModel.build(map, self);
    }

    public ApiHookConfig setPostUrl(String postUrl) {
        this.postUrl = postUrl;
        return this;
    }
    public String getPostUrl() {
        return this.postUrl;
    }

    public ApiHookConfig setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public ApiHookConfig setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ApiHookConfig setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

}
