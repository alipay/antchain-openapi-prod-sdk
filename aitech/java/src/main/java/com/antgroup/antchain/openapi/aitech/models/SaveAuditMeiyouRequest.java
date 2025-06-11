// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SaveAuditMeiyouRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 美柚待审核信息保存请求
    @NameInMap("request")
    @Validation(required = true)
    public java.util.List<MeiyouAuditSaveWebInfo> request;

    public static SaveAuditMeiyouRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAuditMeiyouRequest self = new SaveAuditMeiyouRequest();
        return TeaModel.build(map, self);
    }

    public SaveAuditMeiyouRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveAuditMeiyouRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveAuditMeiyouRequest setRequest(java.util.List<MeiyouAuditSaveWebInfo> request) {
        this.request = request;
        return this;
    }
    public java.util.List<MeiyouAuditSaveWebInfo> getRequest() {
        return this.request;
    }

}
