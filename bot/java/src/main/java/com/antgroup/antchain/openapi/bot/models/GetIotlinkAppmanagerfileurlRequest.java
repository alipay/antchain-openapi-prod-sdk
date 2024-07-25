// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetIotlinkAppmanagerfileurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用包id
    @NameInMap("apk_id")
    @Validation(required = true)
    public String apkId;

    public static GetIotlinkAppmanagerfileurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIotlinkAppmanagerfileurlRequest self = new GetIotlinkAppmanagerfileurlRequest();
        return TeaModel.build(map, self);
    }

    public GetIotlinkAppmanagerfileurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetIotlinkAppmanagerfileurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetIotlinkAppmanagerfileurlRequest setApkId(String apkId) {
        this.apkId = apkId;
        return this;
    }
    public String getApkId() {
        return this.apkId;
    }

}
