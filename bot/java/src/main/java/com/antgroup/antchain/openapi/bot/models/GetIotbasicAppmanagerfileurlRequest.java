// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetIotbasicAppmanagerfileurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用包id
    @NameInMap("apk_id")
    @Validation(required = true)
    public String apkId;

    public static GetIotbasicAppmanagerfileurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIotbasicAppmanagerfileurlRequest self = new GetIotbasicAppmanagerfileurlRequest();
        return TeaModel.build(map, self);
    }

    public GetIotbasicAppmanagerfileurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetIotbasicAppmanagerfileurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetIotbasicAppmanagerfileurlRequest setApkId(String apkId) {
        this.apkId = apkId;
        return this;
    }
    public String getApkId() {
        return this.apkId;
    }

}
