// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class StartSlxfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待修复人list
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<PersonData> data;

    public static StartSlxfRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSlxfRequest self = new StartSlxfRequest();
        return TeaModel.build(map, self);
    }

    public StartSlxfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartSlxfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartSlxfRequest setData(java.util.List<PersonData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PersonData> getData() {
        return this.data;
    }

}
