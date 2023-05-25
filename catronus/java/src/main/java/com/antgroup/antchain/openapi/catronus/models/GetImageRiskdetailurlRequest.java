// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class GetImageRiskdetailurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 镜像地址
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    public static GetImageRiskdetailurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageRiskdetailurlRequest self = new GetImageRiskdetailurlRequest();
        return TeaModel.build(map, self);
    }

    public GetImageRiskdetailurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetImageRiskdetailurlRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public GetImageRiskdetailurlRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
