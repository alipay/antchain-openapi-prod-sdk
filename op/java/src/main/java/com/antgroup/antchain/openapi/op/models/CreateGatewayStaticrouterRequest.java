// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class CreateGatewayStaticrouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 产品码
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    // 套件版本
    @NameInMap("suit_version")
    @Validation(required = true)
    public String suitVersion;

    // 分组名称
    @NameInMap("group_name")
    @Validation(required = true)
    public String groupName;

    // accessKey
    @NameInMap("accesskey")
    @Validation(required = true)
    public String accesskey;

    // 后端地址
    @NameInMap("host")
    @Validation(required = true)
    public String host;

    public static CreateGatewayStaticrouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayStaticrouterRequest self = new CreateGatewayStaticrouterRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayStaticrouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateGatewayStaticrouterRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateGatewayStaticrouterRequest setSuitVersion(String suitVersion) {
        this.suitVersion = suitVersion;
        return this;
    }
    public String getSuitVersion() {
        return this.suitVersion;
    }

    public CreateGatewayStaticrouterRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateGatewayStaticrouterRequest setAccesskey(String accesskey) {
        this.accesskey = accesskey;
        return this;
    }
    public String getAccesskey() {
        return this.accesskey;
    }

    public CreateGatewayStaticrouterRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

}
