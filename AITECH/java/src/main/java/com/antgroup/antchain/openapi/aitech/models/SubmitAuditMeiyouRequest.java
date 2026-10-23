// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SubmitAuditMeiyouRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 美柚审核信息存储请求
    @NameInMap("save_info")
    public java.util.List<MeiyouAuditSaveWebRequest> saveInfo;

    public static SubmitAuditMeiyouRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuditMeiyouRequest self = new SubmitAuditMeiyouRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuditMeiyouRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAuditMeiyouRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAuditMeiyouRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SubmitAuditMeiyouRequest setSaveInfo(java.util.List<MeiyouAuditSaveWebRequest> saveInfo) {
        this.saveInfo = saveInfo;
        return this;
    }
    public java.util.List<MeiyouAuditSaveWebRequest> getSaveInfo() {
        return this.saveInfo;
    }

}
