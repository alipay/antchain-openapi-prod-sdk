// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class GetIsvSharecodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 电话号码/邮箱等登陆名
    @NameInMap("logon_id")
    @Validation(required = true)
    public String logonId;

    public static GetIsvSharecodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIsvSharecodeRequest self = new GetIsvSharecodeRequest();
        return TeaModel.build(map, self);
    }

    public GetIsvSharecodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetIsvSharecodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetIsvSharecodeRequest setLogonId(String logonId) {
        this.logonId = logonId;
        return this;
    }
    public String getLogonId() {
        return this.logonId;
    }

}
