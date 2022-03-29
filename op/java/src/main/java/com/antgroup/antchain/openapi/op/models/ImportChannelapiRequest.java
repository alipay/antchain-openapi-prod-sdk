// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ImportChannelapiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 渠道API列表
    @NameInMap("api_list")
    @Validation(required = true)
    public java.util.List<ChannelApi> apiList;

    public static ImportChannelapiRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportChannelapiRequest self = new ImportChannelapiRequest();
        return TeaModel.build(map, self);
    }

    public ImportChannelapiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportChannelapiRequest setApiList(java.util.List<ChannelApi> apiList) {
        this.apiList = apiList;
        return this;
    }
    public java.util.List<ChannelApi> getApiList() {
        return this.apiList;
    }

}
