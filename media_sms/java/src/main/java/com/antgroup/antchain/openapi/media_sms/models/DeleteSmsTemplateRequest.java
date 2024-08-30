// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 请求唯一id
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

    // 模版id
    @NameInMap("mms_id")
    @Validation(required = true)
    public String mmsId;

    public static DeleteSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateRequest self = new DeleteSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSmsTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSmsTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteSmsTemplateRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public DeleteSmsTemplateRequest setMmsId(String mmsId) {
        this.mmsId = mmsId;
        return this;
    }
    public String getMmsId() {
        return this.mmsId;
    }

}
