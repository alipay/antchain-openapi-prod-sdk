// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SubmitMeiyouAuditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据Id
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 模态
    @NameInMap("modal")
    @Validation(required = true)
    public String modal;

    // 场景
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    // 美柚审核记录信息
    @NameInMap("audit_info")
    @Validation(required = true)
    public String auditInfo;

    // 回调函数
    @NameInMap("callback")
    @Validation(required = true)
    public String callback;

    // 租户
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    public static SubmitMeiyouAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMeiyouAuditRequest self = new SubmitMeiyouAuditRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMeiyouAuditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitMeiyouAuditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitMeiyouAuditRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public SubmitMeiyouAuditRequest setModal(String modal) {
        this.modal = modal;
        return this;
    }
    public String getModal() {
        return this.modal;
    }

    public SubmitMeiyouAuditRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SubmitMeiyouAuditRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SubmitMeiyouAuditRequest setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public String getAuditInfo() {
        return this.auditInfo;
    }

    public SubmitMeiyouAuditRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public SubmitMeiyouAuditRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
