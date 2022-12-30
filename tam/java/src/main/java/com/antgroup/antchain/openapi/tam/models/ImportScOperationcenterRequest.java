// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ImportScOperationcenterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 提交表单入参
    @NameInMap("submit_request")
    @Validation(required = true)
    public SubmitRequest submitRequest;

    // 站位
    @NameInMap("flag_id")
    public String flagId;

    public static ImportScOperationcenterRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportScOperationcenterRequest self = new ImportScOperationcenterRequest();
        return TeaModel.build(map, self);
    }

    public ImportScOperationcenterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportScOperationcenterRequest setSubmitRequest(SubmitRequest submitRequest) {
        this.submitRequest = submitRequest;
        return this;
    }
    public SubmitRequest getSubmitRequest() {
        return this.submitRequest;
    }

    public ImportScOperationcenterRequest setFlagId(String flagId) {
        this.flagId = flagId;
        return this;
    }
    public String getFlagId() {
        return this.flagId;
    }

}
