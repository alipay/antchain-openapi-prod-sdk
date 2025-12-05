// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cat.models;

import com.aliyun.tea.*;

public class ImportAbcdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static ImportAbcdRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAbcdRequest self = new ImportAbcdRequest();
        return TeaModel.build(map, self);
    }

    public ImportAbcdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
